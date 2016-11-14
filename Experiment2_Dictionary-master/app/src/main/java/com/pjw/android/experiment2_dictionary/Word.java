package com.pjw.android.experiment2_dictionary;

import android.net.Uri;
import android.provider.BaseColumns;

import java.io.Serializable;

public class Word implements BaseColumns,Serializable
{
	public static final String AUTHORITY = "com.pjw.android.sqlite_database.WordsProvider";//URI授权者


	public static final String TABLE_NAME = "words";
	public static final String COLUMN_NAME_ID="id";
	public static final String COLUMN_NAME_WORD = "word";//列：单词
	public static final String COLUMN_NAME_MEANING = "meaning";//列：单词含义
	public static final String COLUMN_NAME_SAMPLE = "sample";//单词示例
	//MIME类型
	public static final String MIME_DIR_PREFIX = "vnd.android.cursor.dir";
	public static final String MIME_ITEM_PREFIX = "vnd.android.cursor.item";
	public static final String MINE_ITEM = "vnd.sqlitedatabase.word";

	public static final String MINE_TYPE_SINGLE = MIME_ITEM_PREFIX + "/" + MINE_ITEM;
	public static final String MINE_TYPE_MULTIPLE = MIME_DIR_PREFIX + "/" + MINE_ITEM;

	public static final String PATH_SINGLE = "word/#";//单条数据的路径
	public static final String PATH_MULTIPLE = "word";//多条数据的路径

	//Content Uri
	public static final String CONTENT_URI_STRING = "content://" + AUTHORITY + "/" + PATH_MULTIPLE;
	public static final Uri CONTENT_URI = Uri.parse (CONTENT_URI_STRING);

	//单词的基本组成
	private int id;
	private String word;
	private String meaning;
	private String sample;

	public Word ()
	{
		id = 0;
		word = "error:uninitializedword";
		meaning = "error:uninitializedmeaning";
		sample = "error:error:uninitializedsample";
	}

	public Word (int i, String w, String m, String s)
	{
		id = i;
		word = w;
		meaning = m;
		sample = s;
	}

	//一系列获取
	public int getId ()
	{
		return id;
	}

	public String getWord ()
	{
		return word;
	}

	public String getMeaning ()
	{
		return meaning;
	}

	public String getSample ()
	{
		return sample;
	}

	//一系列赋值
	public void setId (int i)
	{
		id = i;
	}

	public void setWord (String w)
	{
		word = w;
	}

	public void setMeaning (String m)
	{
		meaning = m;
	}

	public void setSample (String s)
	{
		sample = s;
	}
}

