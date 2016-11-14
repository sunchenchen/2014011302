package com.example.pc.experiment1_calculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity
{
	private static boolean isdot=false;
	private static final String tag="Calculator";
	public class Calculator
	{
		public Calculator ()
		{
			{
				optr.push ("#");
				numbertemp="";
			}
		}
		public void evaluate()
		{
			final TextView et_iotext=(TextView)findViewById (R.id.editText);//变量名未改为EditText
			Button btn_0=(Button)findViewById (R.id.button0);
			Button btn_1=(Button)findViewById (R.id.button1);
			Button btn_2=(Button)findViewById (R.id.button2);
			Button btn_3=(Button)findViewById (R.id.button3);
			Button btn_4=(Button)findViewById (R.id.button4);
			Button btn_5=(Button)findViewById (R.id.button5);
			Button btn_6=(Button)findViewById (R.id.button6);
			Button btn_7=(Button)findViewById (R.id.button7);
			Button btn_8=(Button)findViewById (R.id.button8);
			Button btn_9=(Button)findViewById (R.id.button9);
			Button btn_plus=(Button)findViewById (R.id.buttonplus);
			Button btn_minus=(Button)findViewById (R.id.buttonminus);
			Button btn_times=(Button)findViewById (R.id.buttontimes);
			Button btn_divisor=(Button)findViewById (R.id.buttondivisor);
			Button btn_clear=(Button)findViewById (R.id.buttonclear);
			Button btn_dot=(Button)findViewById (R.id.buttondot);
			Button btn_equal=(Button)findViewById (R.id.buttonequal);
			Button btn_leftbracket=(Button) findViewById (R.id.buttonleftbracket);
			Button btn_rightbracket=(Button)findViewById (R.id.buttonrightbracket);
			Button btn_negative=(Button)findViewById (R.id.buttonnegative);
			btn_negative.setOnClickListener (new View.OnClickListener () {
				@Override
				public void onClick (View view)
				{
					numbertemp+="-";
					et_iotext.setText (et_iotext.getText ().toString ()+"-");
				}
			});
			View.OnClickListener actionPerformed=new View.OnClickListener () {
				@Override
				public void onClick (View view)
				{
					String theta2;
					theta2=((Button)view).getText ().toString ();
					if("0123456789".contains (theta2))
					{
						numbertemp+=theta2;
						et_iotext.setText (et_iotext.getText ().toString ()+theta2);
					}
					else if(".()+-*/".contains (theta2))
					{
						if(".".contains (theta2))
						{
							if(!isdot)
							{
								isdot=true;
								numbertemp += theta2;
								et_iotext.setText (et_iotext.getText ().toString () + theta2);
							}
						}
						else if("()+-*/".contains (theta2))
						{
							if(numbertemp!="")
							{
								float opnumber = Float.parseFloat (numbertemp);
								opnd.push (opnumber);
								isdot=false;
							}
							numbertemp="";
							String theta1=optr.peek ();
							if(rp (theta2.charAt (0))>lp (theta1.charAt (0)))
							{
								optr.push (theta2);
							}
							else if(rp (theta2.charAt (0))==lp (theta1.charAt (0)))
							{
								optr.pop ();
							}
							else if(rp (theta2.charAt (0))<lp (theta1.charAt (0)))
							{
								float b=opnd.pop ();
								float a=opnd.pop ();
								opnd.push (operate (a,optr.pop ().charAt (0),b));
								optr.push (theta2);
							}
							et_iotext.setText (et_iotext.getText ().toString ()+theta2);
						}
					}
					else if("=".contains (theta2))
					{
						if(numbertemp!="")
						{
							float opnumber = Float.parseFloat (numbertemp);
							opnd.push (opnumber);
							numbertemp="";
						}

						for(;optr.peek ()!="#";)
						{
							float b = opnd.pop ();
							float a = opnd.pop ();
							char operatorab=optr.pop ().charAt (0);
							opnd.push (operate (a, operatorab, b));
						}
						if(!opnd.isEmpty ())
						{
							et_iotext.setText (opnd.peek ().toString ());
						}
					}
					else
					{
						Toast.makeText (MainActivity.this,"错误：不合法的输入符",Toast.LENGTH_LONG).show ();
					}
				}
			};
			View.OnClickListener clearandback= new View.OnClickListener () {
				@Override
				public void onClick (View view)
				{
					String buttontext=((Button)view).getText ().toString ();
					if("C".contains (buttontext))
					{
						numbertemp="";
						et_iotext.setText ("");
						opnd.clear ();
						optr.clear ();
						optr.push ("#");
					}
				}
			};
			btn_0.setOnClickListener (actionPerformed);
			btn_1.setOnClickListener (actionPerformed);
			btn_2.setOnClickListener (actionPerformed);
			btn_3.setOnClickListener (actionPerformed);
			btn_4.setOnClickListener (actionPerformed);
			btn_5.setOnClickListener (actionPerformed);
			btn_6.setOnClickListener (actionPerformed);
			btn_7.setOnClickListener (actionPerformed);
			btn_8.setOnClickListener (actionPerformed);
			btn_9.setOnClickListener (actionPerformed);
			btn_plus.setOnClickListener (actionPerformed);
			btn_minus.setOnClickListener (actionPerformed);
			btn_times.setOnClickListener (actionPerformed);
			btn_divisor.setOnClickListener (actionPerformed);
			btn_dot.setOnClickListener (actionPerformed);
			btn_equal.setOnClickListener (actionPerformed);
			btn_rightbracket.setOnClickListener (actionPerformed);
			btn_leftbracket.setOnClickListener (actionPerformed);
			/*btn_backspace.setOnTouchListener (new View.OnTouchListener () {
				@Override
				public boolean onTouch (View view, MotionEvent motionEvent)
				{
					if(motionEvent.getAction ()==MotionEvent.ACTION_DOWN)
					{
						if(et_iotext.isFocused ())
						{
							int action= KeyEvent.ACTION_DOWN;
							int code=KeyEvent.KEYCODE_DEL;
							KeyEvent keyEvent=new KeyEvent (action,code);
							et_iotext.onKeyDown (KeyEvent.KEYCODE_DEL,keyEvent);
						}
					}
					return false;
				}
			});*/
			btn_clear.setOnClickListener (clearandback);
		}
		private Stack<Float> opnd=new Stack<Float> ();//操作数栈
		private Stack<String> optr=new Stack<String> ();//操作符栈
		private String numbertemp;//临时存储字符并转为操作数
		private float lp (char op)
		{
			switch (op)
			{
				case '+':
					return 3.f;
				case '-':
					return 3.f;
				case '*':
					return 5.f;
				case '/':
					return 5.f;
				case '(':
					return 1.f;
				case ')':
					return 6.f;
				case '#':
					return 0.f;
				default:
					return -1.f;
			}
		}
		private float rp (char op)
		{
			switch (op)
			{
				case'+':
					return 2.f;
				case'-':
					return 2.f;
				case'*':
					return 4.f;
				case'/':
					return 4.f;
				case'(':
					return 6.f;
				case')':
					return 1.f;
				case'#':
					return 0.f;
				default:
					return -1.f;
			}
		}

		private float operate (float a, char t, float b)
		{
			switch (t)
			{
				case'+':
					return a + b;
				case'-':
					return a - b;
				case'*':
					return a * b;
				case'/':
					return a / b;
				default:
					return 0.0f;
			}
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		int id = item.getItemId();
		switch (id)
		{
			/*case R.id.action_convert:
				Intent intent=new Intent (this,ActivityConvert.class);
				startActivity (intent);
				break;*/
			case R.id.action_about:
				AlertDialog.Builder builder=new AlertDialog.Builder (MainActivity.this);
				builder.setMessage (R.string.about_message)
						.setTitle (R.string.about_title);
				builder.setPositiveButton (R.string.add1s,new DialogInterface.OnClickListener ()
				{
					@Override
					public void onClick (DialogInterface dialog,int which) {}
				});
				builder.show ();
				break;
			case R.id.action_change:
				Intent intent=new Intent(MainActivity.this,ActivityConvert.class);
				startActivity(intent);
				break;
			case R.id.action_chg:
				Intent intent1=new Intent(MainActivity.this,Main2Activity.class);
				startActivity(intent1);
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_main);
		Calculator mycal=new Calculator ();
		mycal.evaluate ();
	}
}
