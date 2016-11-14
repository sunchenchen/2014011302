package com.pjw.android.experiment2_dictionary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WordsDBHelper extends SQLiteOpenHelper
{

	private final static String DATABASE_NAME = "wordsdb";//数据库名字
	private final static int DATABASE_VERSION = 1;//数据库版本

	//建表SQL，单词名作为主键，id主键取消，id形同作废但保留
	private final static String SQL_CREATE_DATABASE = "CREATE TABLE " + Word.TABLE_NAME + " (" +
			Word._ID + " INTEGER," +
			Word.COLUMN_NAME_WORD + " TEXT PRIMARY KEY" + "," +
			Word.COLUMN_NAME_MEANING + " TEXT" + ","
			+ Word.COLUMN_NAME_SAMPLE + " TEXT" + " )";

	//删表SQL
	private final static String SQL_DELETE_DATABASE = "DROP TABLE IF EXISTS " + Word.TABLE_NAME;

	public WordsDBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase sqLiteDatabase) {
		//创建数据库
		sqLiteDatabase.execSQL(SQL_CREATE_DATABASE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
		//当数据库升级时被调用，首先删除旧表，然后调用OnCreate()创建新表
		sqLiteDatabase.execSQL(SQL_DELETE_DATABASE);
		onCreate(sqLiteDatabase);
	}
}
