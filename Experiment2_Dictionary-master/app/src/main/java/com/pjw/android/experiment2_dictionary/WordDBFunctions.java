package com.pjw.android.experiment2_dictionary;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//提供简单的功能，如从数据库获取全部单词等
public class WordDBFunctions
{
	private WordsDBHelper mDbHelper;

	public WordDBFunctions(Context context)
	{
		mDbHelper=new WordsDBHelper (context);
	}
	public List<Word> getAllWords ()
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase ();

		String[] projection = {
				Word._ID,
				Word.COLUMN_NAME_WORD,
				Word.COLUMN_NAME_MEANING,
				Word.COLUMN_NAME_SAMPLE
		};

		//排序
		String sortOrder =
				Word.COLUMN_NAME_WORD + " DESC";


		Cursor c = db.query (
				Word.TABLE_NAME,  // The table to query
				projection,                               // The columns to return
				null,                                // The columns for the WHERE clause
				null,                            // The values for the WHERE clause
				null,                                     // don't group the rows
				null,                                     // don't filter by row groups
				sortOrder                                 // The sort order
		);

		return ConvertCursor2List (c);
	}
	public ArrayList<Map<String, String>> getAllWordsInArrayList()
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase ();

		String[] projection = {
				Word._ID,
				Word.COLUMN_NAME_WORD,
				Word.COLUMN_NAME_MEANING,
				Word.COLUMN_NAME_SAMPLE
		};

		//排序
		String sortOrder =
				Word.COLUMN_NAME_WORD + " DESC";


		Cursor c = db.query (
				Word.TABLE_NAME,  // The table to query
				projection,                               // The columns to return
				null,                                // The columns for the WHERE clause
				null,                            // The values for the WHERE clause
				null,                                     // don't group the rows
				null,                                     // don't filter by row groups
				sortOrder                                 // The sort order
		);

		return ConvertCursor2Map (c);
	}

	public List<Word> ConvertCursor2List (Cursor cursor)
	{
		List<Word> result = new ArrayList<> ();
		while (cursor.moveToNext ())
		{
			Word word = new Word (cursor.getInt (0), cursor.getString (1), cursor.getString (2),
					cursor.getString (3));
			result.add (word);
		}
		return result;
	}

	public ArrayList<Map<String, String>> ConvertCursor2Map (Cursor cursor)
	{
		ArrayList<Map<String, String>> result = new ArrayList<> ();
		while (cursor.moveToNext ())
		{
			Map<String, String> map = new HashMap<> ();
			map.put (Word.COLUMN_NAME_ID, String.valueOf (cursor.getInt (0)));
			map.put (Word.COLUMN_NAME_WORD,cursor.getString (1));
			map.put (Word.COLUMN_NAME_MEANING, cursor.getString (2));
			map.put (Word.COLUMN_NAME_SAMPLE, cursor.getString (3));
			result.add (map);
		}
		return result;
	}

	public ArrayList<Map<String,String>> List2Map(List<Word> wordList)
	{
		ArrayList<Map<String, String>> result = new ArrayList<> ();
		for(int i=0;i<wordList.size ();i++)
		{
			Map<String, String> map = new HashMap<> ();
			map.put (Word.COLUMN_NAME_ID, String.valueOf (wordList.get (i).getId()));
			map.put (Word.COLUMN_NAME_WORD,wordList.get (i).getWord ());
			map.put (Word.COLUMN_NAME_MEANING, wordList.get (i).getMeaning ());
			map.put (Word.COLUMN_NAME_SAMPLE, wordList.get (i).getSample ());
			result.add (map);
		}
		return result;
	}

	public Word findWordbyName (String name)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase ();

		String sql = "select * from words where word like ? order by word desc";
		Cursor c = db.rawQuery (sql, new String[]{"%" + name + "%"});
		Word temp=ConvertCursor2List (c).get (0);
		//Word word = new Word (c.getInt (0), c.getString (1), c.getString (2),c.getString (3));
		return temp;
	}

	public static boolean isLand (Activity activity)
	{
		Configuration mConfiguration = activity.getResources ().getConfiguration (); //获取设置的配置信息
		int ori = mConfiguration.orientation ; //获取屏幕方向
		if (ori == mConfiguration.ORIENTATION_LANDSCAPE)
		{
			//横屏
			return true;
		}
		else if (ori == mConfiguration.ORIENTATION_PORTRAIT)
		{
			//竖屏
			return false;
		}
		return false;
	}
}

