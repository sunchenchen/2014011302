package com.pjw.android.experiment2_dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity
{

	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);
		WordDetailFragment detailFragment = WordDetailFragment.newInstance (1);
		detailFragment.setArguments(getIntent().getExtras());
		getFragmentManager()
				.beginTransaction()
				//.add(android.R.id.content, detailFragment)
				.replace (android.R.id.content,detailFragment)
				.commit();
	}
}
