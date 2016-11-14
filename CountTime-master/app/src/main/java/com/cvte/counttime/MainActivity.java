package com.cvte.counttime;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mETInput;
    private Button mBtnGetTime;
    private Button mBtnStartTime;
    private Button mBtnStopTime;
    private TextView mTVTime;

    private int mCount = 0;

    private Timer mTimer = null;
    private TimerTask mTimerTask = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initView();
    }

    private void initView() {
        mETInput = (EditText) findViewById(R.id.inputtime);
        mBtnGetTime = (Button) findViewById(R.id.btn_get_time);
        mBtnStartTime = (Button) findViewById(R.id.btn_start_time);
        mBtnStopTime = (Button) findViewById(R.id.btn_stop_time);
        mTVTime = (TextView) findViewById(R.id.showtime);

        mBtnGetTime.setOnClickListener(this);
        mBtnStartTime.setOnClickListener(this);
        mBtnStopTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get_time:
                mTVTime.setText(mETInput.getText().toString());
                mCount = Integer.parseInt(mETInput.getText().toString());
                break;
            case R.id.btn_start_time:
                startTime();
                break;
            case R.id.btn_stop_time:
                stopTime();
                break;
        }
    }

    private android.os.Handler mHandler = new android.os.Handler() {

        public void handleMessage(Message msg) {
            mTVTime.setText(msg.arg1 + "");
            startTime();
        }
    };

    private void startTime() {
        mTimerTask = new TimerTask() {
            @Override
            public void run() {
                --mCount;

                Message message = mHandler.obtainMessage();
                message.arg1 = mCount;
                mHandler.sendMessage(message);
            }
        };

        mTimer = new Timer();
        mTimer.schedule(mTimerTask, 1000);
    }

    private void stopTime() {
        mTimer.cancel();
    }
}
