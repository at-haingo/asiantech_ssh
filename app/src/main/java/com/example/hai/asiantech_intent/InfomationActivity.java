package com.example.hai.asiantech_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Hai on 6/6/2017.
 */

public class InfomationActivity extends Activity {

    private TextView mTvUserName, mTvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infomation_activity);

        mTvUserName = (TextView) findViewById(R.id.tvUserName);
        mTvAge = (TextView) findViewById(R.id.tvAge);

        Intent intent = getIntent();
        Bundle getInfomation = intent.getBundleExtra("Infomation");

        String username = getInfomation.getString(MainActivity.KEY_USER_NAME);
        String age = getInfomation.getString(MainActivity.KEY_AGE);

        mTvUserName.setText("Wellcome " +username);
        mTvAge.setText("Age: " +age);

    }
}
