package com.pjw.android.experiment2_dictionary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Map;

public class SearchActivity extends AppCompatActivity
{

	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_search);
		Intent intent=getIntent();
		Bundle bundle=intent.getExtras();
		ArrayList<Map<String, String>> items= (ArrayList<Map<String, String>>) bundle.getSerializable("result");

		SimpleAdapter adapter = new SimpleAdapter (this, items, R.layout.fragment_detail_layout_item,
				new String[]{Word.COLUMN_NAME_WORD,Word.COLUMN_NAME_MEANING, Word.COLUMN_NAME_SAMPLE},
				new int[]{R.id.fragment_detail_textview_word, R.id.fragment_detail_textview_meaning, R.id
						.fragment_detail_textview_example});

		ListView list = (ListView) findViewById(R.id.lstSearchResultWords);

		list.setAdapter(adapter);
	}
}
