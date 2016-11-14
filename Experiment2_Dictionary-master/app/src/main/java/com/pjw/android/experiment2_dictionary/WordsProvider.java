package com.pjw.android.experiment2_dictionary;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

public class WordsProvider extends ContentProvider
{
	//UriMathcher匹配结果码
	private static final int MULTIPLE_WORDS = 1;//
	private static final int SINGLE_WORD = 2;
	WordsDBHelper mDbHelper;
	private static final UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

	static {
		uriMatcher.addURI(Word.AUTHORITY, Word.PATH_SINGLE, SINGLE_WORD);
		uriMatcher.addURI(Word.AUTHORITY, Word.PATH_MULTIPLE, MULTIPLE_WORDS);
	}

	public WordsProvider ()
	{
	}

	@Override
	public int delete (Uri uri, String selection, String[] selectionArgs)
	{

		// Implement this to handle requests to delete one or more rows.
		SQLiteDatabase db = mDbHelper.getReadableDatabase();
		int count  = 0;
		switch (uriMatcher.match(uri)) {
			case MULTIPLE_WORDS:
				count = db.delete(Word.TABLE_NAME, selection, selectionArgs);
				break;
			case SINGLE_WORD:
				String whereClause=Word._ID+"="+uri.getPathSegments().get(1);
				count = db.delete(Word.TABLE_NAME, whereClause, selectionArgs);
				break;
			default:
				throw new IllegalArgumentException("Unkonwn Uri:" + uri);
		}

		//通知ContentResolver,数据已经发生改变
		try
		{
			getContext ().getContentResolver ().notifyChange (uri, null);
		}
		catch (NullPointerException e)
		{
			e.printStackTrace ();
		}
		return count;
	}

	@Override
	public String getType (Uri uri)
	{
		switch (uriMatcher.match(uri)) {
			case MULTIPLE_WORDS://多条数据记录
				return Word.MINE_TYPE_MULTIPLE;
			case SINGLE_WORD://单条数据记录
				return Word.MINE_TYPE_SINGLE;
			default:
				throw new IllegalArgumentException("Unkonwn Uri:" + uri);
		}
	}

	@Override
	public Uri insert (Uri uri, ContentValues values)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase();

		long id = db.insert(Word.TABLE_NAME, null, values);
		if ( id > 0 ){
			//在已有的Uri后面添加id
			Uri newUri = ContentUris.withAppendedId(Word.CONTENT_URI, id);
			getContext().getContentResolver().notifyChange(newUri, null);
			return newUri;
		}
		throw new SQLException ("Failed to insert row into " + uri);

	}

	@Override
	public boolean onCreate ()
	{
		//创建SQLiteOpenHelper对象
		mDbHelper = new WordsDBHelper(this.getContext());
		return true;

	}

	@Override
	public Cursor query (Uri uri, String[] projection, String selection,
	                     String[] selectionArgs, String sortOrder)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase();

		SQLiteQueryBuilder qb = new SQLiteQueryBuilder ();
		qb.setTables(Word.TABLE_NAME);

		switch (uriMatcher.match(uri)) {
			case MULTIPLE_WORDS:
				return db.query(Word.TABLE_NAME, projection, selection, selectionArgs, null, null, sortOrder);

			case SINGLE_WORD:
				qb.appendWhere(Word._ID + "=" + uri.getPathSegments().get(1));
				return qb.query(db, projection, selection, selectionArgs, null, null, sortOrder);

			default:
				throw new IllegalArgumentException("Unkonwn Uri:" + uri);
		}
	}

	@Override
	public int update (Uri uri, ContentValues values, String selection,
	                   String[] selectionArgs)
	{
		SQLiteDatabase db = mDbHelper.getReadableDatabase();
		int count = 0;
		switch (uriMatcher.match(uri)) {
			case MULTIPLE_WORDS:
				count = db.update(Word.TABLE_NAME, values, selection, selectionArgs);
				break;
			case SINGLE_WORD:
				String segment = uri.getPathSegments().get(1);
				count = db.update(Word.TABLE_NAME, values, Word._ID+"="+segment, selectionArgs);
				break;
			default:
				throw new IllegalArgumentException("Unkonwn Uri:" + uri);
		}

		//通知ContentResolver,数据已经发生改变
		try
		{
			getContext ().getContentResolver ().notifyChange (uri, null);
		}
		catch (NullPointerException e)
		{
			e.printStackTrace ();
		}
		return count;
	}
}
