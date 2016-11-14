package com.pjw.android.experiment2_dictionary;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements WordListFragment
		.OnListFragmentInteractionListener, WordDetailFragment.OnListFragmentInteractionListener
{

	WordsDBHelper mDbHelper;
	WordDBFunctions mDbFunctions;
	ListView mListView;
	WordListFragment mlistFragment;
	FragmentManager mfragmentManager;
	FragmentTransaction mfragmentTransaction;

	@Override
	public void returnViewFromListFragment (View returnView)
	{
		mListView = (ListView) returnView;
	}

	@Override
	public void onDetailClick (String itemname) {}

	@Override
	public void onItemClick (String itemname)
	{
		FragmentManager fragmentManager=getFragmentManager ();
		FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction ();
		Word word = mDbFunctions.findWordbyName (itemname);
		if (WordDBFunctions.isLand (this))
		{//横屏
			Bundle args = new Bundle ();
			args.putSerializable ("word", word);
			WordDetailFragment fragment = new WordDetailFragment ();
			fragment.setArguments (args);
			fragmentTransaction.replace (R.id.fragment_detail, fragment);
		}
		else
		{//竖屏
			//fragmentTransaction.addToBackStack (null);
			Intent intent = new Intent (MainActivity.this, DetailActivity.class);
			intent.putExtra ("word", word);
			startActivity (intent);
		}
		fragmentTransaction.commit ();
	}

	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_main);
		mDbFunctions = new WordDBFunctions (this);
		Toolbar toolbar = (Toolbar) findViewById (R.id.toolbar);
		setSupportActionBar (toolbar);

		FloatingActionButton fab = (FloatingActionButton) findViewById (R.id.fab);
		fab.setOnClickListener (new View.OnClickListener ()
		{
			@Override
			public void onClick (View view)
			{
				//新增单词
				InsertDialog ();
			}
		});

		//创建SQLiteOpenHelper对象，注意第一次运行时，此时数据库并没有被创建
		mDbHelper = new WordsDBHelper (this);

		mlistFragment = WordListFragment.newInstance (1);
		mfragmentManager = getFragmentManager ();
		mfragmentManager.beginTransaction ()
				.add (R.id.fragment_list, mlistFragment)
				.commit ();

	}

	@Override
	protected void onDestroy ()
	{
		super.onDestroy ();
		mDbHelper.close ();
	}

	@Override
	public boolean onCreateOptionsMenu (Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater ().inflate (R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected (MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId ();

		//noinspection SimplifiableIfStatement
		switch (id)
		{
			case R.id.action_search:
				//查找
				SearchDialog ();
				return true;
			case R.id.action_insert:
				//新增单词
				InsertDialog ();
				return true;
		}


		return super.onOptionsItemSelected (item);
	}

	@Override
	public void onCreateContextMenu (ContextMenu menu, View v, ContextMenu.ContextMenuInfo
			menuInfo)
	{
		getMenuInflater ().inflate (R.menu.contextmenu_wordslistview, menu);
	}

	@Override
	public boolean onContextItemSelected (MenuItem item)
	{
		TextView textWord = null;

		AdapterView.AdapterContextMenuInfo info = null;
		View itemView = null;

		switch (item.getItemId ())
		{
			case R.id.action_delete:
				//删除单词
				info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo ();
				itemView = info.targetView;
				textWord = (TextView) itemView.findViewById (R.id.fragment_list_textWord);
				if (textWord != null)
				{
					String strWord = textWord.getText ().toString ();
					DeleteDialog (strWord);
				}
				break;
			case R.id.action_update:
				//修改单词
				info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo ();
				itemView = info.targetView;
				textWord = (TextView) itemView.findViewById (R.id.fragment_list_textWord);
				if (textWord != null)
				{
					String strWord = textWord.getText ().toString ();
					UpdateDialog (strWord);
				}
				break;
		}
		return true;
	}

	//设置适配器，在列表中显示单词
	private void setWordsListView (List<Word> items)
	{
		//mListView=(ListView)findViewById (R.id.fragment_list_container);
		/*SimpleAdapter adapter = new SimpleAdapter (this, mDbFunctions.List2Map (items), R.layout
				.fragment_list_layout_item,
				new String[]{Word.COLUMN_NAME_WORD},
				new int[]{R.id.fragment_list_textWord});
		mListView.setAdapter (adapter);*/
		WordListFragment wordListFragment=WordListFragment.newInstance (1);
		mfragmentManager.beginTransaction ()
				.replace (R.id.fragment_list, wordListFragment)
				.commit ();
	}

	//使用Sql语句插入单词
	private void InsertUserSql (String strWord, String strMeaning, String strSample)
	{
		String sql = "insert into  words(word,meaning,sample) values(?,?,?)";

		//Gets the data repository in write mode
		SQLiteDatabase db = mDbHelper.getWritableDatabase ();
		db.execSQL (sql, new String[]{strWord, strMeaning, strSample});
	}

	//使用insert方法增加单词
	/*private void Insert (String strWord, String strMeaning, String strSample)
	{

		//Gets the data repository in write mode
		SQLiteDatabase db = mDbHelper.getWritableDatabase ();

		// Create a new map of values, where column names are the keys
		ContentValues values = new ContentValues ();
		values.put (Word.COLUMN_NAME_WORD, strWord);
		values.put (Word.COLUMN_NAME_MEANING, strMeaning);
		values.put (Word.COLUMN_NAME_SAMPLE, strSample);

		// Insert the new row, returning the primary key value of the new row
		long newRowId;
		newRowId = db.insert (
				Word.TABLE_NAME,
				null,
				values);
	}*/


	//新增对话框
	private void InsertDialog ()
	{
		final TableLayout tableLayout = (TableLayout) getLayoutInflater ().inflate (R.layout
				.insert, null);
		new AlertDialog.Builder (this)
				.setTitle ("新增单词")//标题
				.setView (tableLayout)//设置视图
				//确定按钮及其动作
				.setPositiveButton ("确定", new DialogInterface.OnClickListener ()
				{
					@Override
					public void onClick (DialogInterface dialogInterface, int i)
					{
						String strWord = ((EditText) tableLayout.findViewById (R.id.txtWord))
								.getText ().toString ();
						String strMeaning = ((EditText) tableLayout.findViewById (R.id.txtMeaning)
						).getText ().toString ();
						String strSample = ((EditText) tableLayout.findViewById (R.id.txtSample))
								.getText ().toString ();

						//既可以使用Sql语句插入，也可以使用使用insert方法插入
						InsertUserSql (strWord, strMeaning, strSample);
						//Insert (strWord, strMeaning, strSample);

						List<Word> items = mDbFunctions.getAllWords ();
						setWordsListView (items);

					}
				})
				//取消按钮及其动作
				.setNegativeButton ("取消", new DialogInterface.OnClickListener ()
				{
					@Override
					public void onClick (DialogInterface dialogInterface, int i)
					{

					}
				})
				.create ()//创建对话框
				.show ();//显示对话框
	}

	//使用Sql语句删除单词
	private void DeleteUseSql (String strOldWord)
	{
		String sql = "delete from words where word='" + strOldWord + "'";

		//Gets the data repository in write mode*/
		SQLiteDatabase db = mDbHelper.getReadableDatabase ();
		db.execSQL (sql);
	}

	//删除单词
	/*private void Delete (String strOldWord)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase ();
		// 定义where子句
		String selection = Word._ID + " = ?";

		// 指定占位符对应的实际参数
		String[] selectionArgs = {strId};

		// Issue SQL statement.
		db.delete (Word.TABLE_NAME, selection, selectionArgs);
	}*/


	//删除对话框
	private void DeleteDialog (final String strOldWord)
	{
		new AlertDialog.Builder (this).setTitle ("删除单词").setMessage ("是否真的删除单词?")
				.setPositiveButton ("确定", new DialogInterface.OnClickListener ()
				{
					@Override
					public void onClick (DialogInterface dialogInterface, int i)
					{
						//既可以使用Sql语句删除，也可以使用使用delete方法删除
						DeleteUseSql (strOldWord);
						//Delete(strId);
						setWordsListView (mDbFunctions.getAllWords ());
					}
				}).setNegativeButton ("取消", new DialogInterface.OnClickListener ()
		{
			@Override
			public void onClick (DialogInterface dialogInterface, int i)
			{

			}
		}).create ().show ();
	}

	//使用Sql语句更新单词
	private void UpdateUseSql (String strOldWord, String strWord, String strMeaning, String
			strSample)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase ();
		String sql = "update words set word=?,meaning=?,sample=? where word=?";
		db.execSQL (sql, new String[]{strWord, strMeaning, strSample, strOldWord});
	}

	//使用方法更新
	/*private void Update (String strId, String strWord, String strMeaning, String strSample)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase ();


		// New value for one column
		ContentValues values = new ContentValues ();
		values.put (Word.COLUMN_NAME_WORD, strWord);
		values.put (Word.COLUMN_NAME_MEANING, strMeaning);
		values.put (Word.COLUMN_NAME_SAMPLE, strSample);

		String selection = Word._ID + " = ?";
		String[] selectionArgs = {strId};

		int count = db.update (
				Word.TABLE_NAME,
				values,
				selection,
				selectionArgs);
	}*/

	//修改对话框
	private void UpdateDialog (final String strWord)
	{
		final TableLayout tableLayout = (TableLayout) getLayoutInflater ().inflate (R.layout
				.insert, null);
		((EditText) tableLayout.findViewById (R.id.txtWord)).setText (strWord);
		Word updateWord = mDbFunctions.findWordbyName (strWord);
		final String strOldWord = ((EditText) tableLayout.findViewById (R.id.txtWord)).getText ()
				.toString ();
		((EditText) tableLayout.findViewById (R.id.txtMeaning)).setText (updateWord.getMeaning ());
		((EditText) tableLayout.findViewById (R.id.txtSample)).setText (updateWord.getSample ());
		new AlertDialog.Builder (this)
				.setTitle ("修改单词")//标题
				.setView (tableLayout)//设置视图
				//确定按钮及其动作
				.setPositiveButton ("确定", new DialogInterface.OnClickListener ()
				{
					@Override
					public void onClick (DialogInterface dialogInterface, int i)
					{
						String strNewWord = ((EditText) tableLayout.findViewById (R.id.txtWord))
								.getText ().toString ();
						String strNewMeaning = ((EditText) tableLayout.findViewById (R.id
								.txtMeaning)).getText ().toString ();
						String strNewSample = ((EditText) tableLayout.findViewById (R.id
								.txtSample)).getText ().toString ();

						//既可以使用Sql语句更新，也可以使用使用update方法更新
						UpdateUseSql (strOldWord, strNewWord, strNewMeaning, strNewSample);
						//  Update(strId, strNewWord, strNewMeaning, strNewSample);
						setWordsListView (mDbFunctions.getAllWords ());
					}
				})
				//取消按钮及其动作
				.setNegativeButton ("取消", new DialogInterface.OnClickListener ()
				{
					@Override
					public void onClick (DialogInterface dialogInterface, int i)
					{

					}
				})
				.create ()//创建对话框
				.show ();//显示对话框
	}

	//使用Sql语句查找
	private ArrayList<Map<String, String>> SearchUseSql (String strWordSearch)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase ();

		String sql = "select * from words where word like ? order by word desc";
		Cursor c = db.rawQuery (sql, new String[]{"%" + strWordSearch + "%"});

		return mDbFunctions.ConvertCursor2Map (c);
	}

	//使用query方法查找
	/*private List<Word> Search (String strWordSearch)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase ();

		String[] projection = {
				Word._ID,
				Word.COLUMN_NAME_WORD,
				Word.COLUMN_NAME_MEANING,
				Word.COLUMN_NAME_SAMPLE
		};

		String sortOrder =
				Word.COLUMN_NAME_WORD + " DESC";

		String selection = Word.COLUMN_NAME_WORD + " LIKE ?";
		String[] selectionArgs = {"%" + strWordSearch + "%"};

		Cursor c = db.query (
				Word.TABLE_NAME,  // The table to query
				projection,                               // The columns to return
				selection,                                // The columns for the WHERE clause
				selectionArgs,                            // The values for the WHERE clause
				null,                                     // don't group the rows
				null,                                     // don't filter by row groups
				sortOrder                                 // The sort order
		);

		return mDbFunctions.ConvertCursor2List (c);
	}*/


	//查询对话框
	private void SearchDialog ()
	{
		final TableLayout tableLayout = (TableLayout) getLayoutInflater ().inflate (R.layout
				.searchterm, null);
		new AlertDialog.Builder (this)
				.setTitle ("查找单词")//标题
				.setView (tableLayout)//设置视图
				//确定按钮及其动作
				.setPositiveButton ("确定", new DialogInterface.OnClickListener ()
				{
					@Override
					public void onClick (DialogInterface dialogInterface, int i)
					{
						String txtSearchWord = ((EditText) tableLayout.findViewById (R.id
								.txtSearchWord)).getText ().toString ();

						ArrayList<Map<String, String>> items = null;
						//既可以使用Sql语句查询，也可以使用方法查询
						items = SearchUseSql (txtSearchWord);
						// items=Search(txtSearchWord);

						if (items.size () > 0)
						{
							Bundle bundle = new Bundle ();
							bundle.putSerializable ("result", items);
							Intent intent = new Intent (MainActivity.this, SearchActivity.class);
							intent.putExtras (bundle);
							startActivity (intent);
						}
						else
							Toast.makeText (MainActivity.this, "没有找到", Toast.LENGTH_LONG).show ();
					}
				})
				//取消按钮及其动作
				.setNegativeButton ("取消", new DialogInterface.OnClickListener ()
				{
					@Override
					public void onClick (DialogInterface dialogInterface, int i)
					{

					}
				})
				.create ()//创建对话框
				.show ();//显示对话框
	}
}
