package cn.edu.bistu.cs.se.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    //SharedPreferences文件名
    private final static String SharedPreferencesFileName="config";

    //键
    private final static String Key_ID="ID";//学号
    private final static String Key_Name="Name";//姓名


    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获得SharedPreferences实例
        preferences=getSharedPreferences(SharedPreferencesFileName, MODE_PRIVATE);
        editor=preferences.edit();

        Button btnWrite=(Button)findViewById(R.id.writebutton);
        Button btnRead=(Button)findViewById(R.id.readbutton);
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //写入键值对
                editor.putString(Key_ID, "2014011447");
                editor.putString(Key_Name, "刘绍颖");

                //提交修改，此处换成commit()也可以
                editor.apply();
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strID = preferences.getString(Key_ID, null);
                String strName = preferences.getString(Key_Name, null);

                if (strName != null && strID != null)
                    Toast.makeText(MainActivity.this, "学号:" + strID + "  姓名：" + strName, Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "无数据", Toast.LENGTH_LONG).show();
            }
        });
    }

}
