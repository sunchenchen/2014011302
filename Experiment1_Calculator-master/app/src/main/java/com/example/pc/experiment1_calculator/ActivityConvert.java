package com.example.pc.experiment1_calculator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ActivityConvert extends AppCompatActivity
{

	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_convert);
		final EditText input=(EditText)findViewById(R.id.editText2);
		final EditText result=(EditText)findViewById(R.id.editText3);
		final Button btn_change=(Button)findViewById(R.id.btn_change);
		final int[] num = {0};
		final int[]nums={0};
		Spinner spinner=(Spinner)findViewById(R.id.spinner);
		Spinner spinner1=(Spinner)findViewById(R.id.spinner2);
		ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(
				this,R.array.items,android.R.layout.simple_spinner_dropdown_item
		);
		spinner.setAdapter(adapter);
		spinner1.setAdapter(adapter);
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				switch (position){
					case 0:
						//String spinnerTest= MainActivity.this.getResources().getStringArray(R.array.items)[position];
						num[0] =0;
						break;
					case 1:
						num[0] =1;
						break;
					case 2:
						num[0]=2;
						break;
					case 3:
						num[0]=3;
						break;
				}
			}


			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});

		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				switch (position){
					case 0:
						nums[0]=0;
						break;
					case 1:
						nums[0]=1;
						break;
					case 2:
						nums[0]=2;
						break;
					case 3:
						nums[0]=3;
						break;
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});
		btn_change.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String text;
				try {
					switch (num[0]) {
						case 0:
							switch (nums[0]) {
								case 0:
									text = input.getText().toString();
									double num = Double.valueOf(text);
									result.setText(String.valueOf(num));
									break;
								case 1:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 0.1));
									break;
								case 2:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 0.001));
									break;
								case 3:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 0.000001));
									break;
							}
							break;
						case 1:
							switch (nums[0]) {
								case 0:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 10));
									break;
								case 1:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text)));
									break;
								case 2:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 0.01));
									break;
								case 3:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 0.00001));
									break;
							}
							break;
						case 2:
							switch (nums[0]) {
								case 0:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 1000));
									break;
								case 1:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 10));
									break;
								case 2:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text)));
									break;
								case 3:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 0.001));
									break;
							}
							break;
						case 3:
							switch (nums[0]) {
								case 0:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 1000000));
									break;
								case 1:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 100000));
									break;
								case 2:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text) * 1000));
									break;
								case 3:
									text = input.getText().toString();
									result.setText(String.valueOf(Double.valueOf(text)));
									break;
							}
							break;
					}
				}catch (Exception e){
					e.printStackTrace();
					result.setText("输入有错，请重新输入");
				}

			}
		});
		/*Spinner spinner=(Spinner)findViewById (R.id.sp_fromlist);
		ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource (this,
				R.array.items, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource (android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter (adapter);
		spinner.setOnItemClickListener (new AdapterView.OnItemClickListener () {
			@Override
			public void onItemClick (AdapterView<?> adapterView, View view, int i, long l)
			{
				//在这更改指针
			}
		});
		Spinner spinnerto=(Spinner)findViewById (R.id.sp_tolist);
		ArrayAdapter<CharSequence> adapterto=ArrayAdapter.createFromResource (this,R.array.items,
				android.R.layout.simple_spinner_item);
		adapterto.setDropDownViewResource (android.R.layout.simple_spinner_dropdown_item);
		spinnerto.setAdapter (adapterto);
*/
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.menu_convert, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		int id = item.getItemId();
		switch (id)
		{
			case R.id.action_main:
				finish ();
				break;
			case R.id.action_about:
				AlertDialog.Builder builder=new AlertDialog.Builder (ActivityConvert.this);
				builder.setMessage (R.string.about_message)
						.setTitle (R.string.about_title);
				builder.setPositiveButton (R.string.add1s,new DialogInterface.OnClickListener ()
				{
					@Override
					public void onClick (DialogInterface dialog,int which) {}
				});
				builder.show ();
				break;
		}
		return super.onOptionsItemSelected(item);
	}

}
