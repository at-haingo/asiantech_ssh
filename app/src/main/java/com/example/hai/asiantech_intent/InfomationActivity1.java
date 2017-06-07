package com.example.hai.asiantech_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Hai on 6/6/2017.
 */

public class InfomationActivity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomation_1);

        TextView tvUserName = (TextView) findViewById(R.id.tvUserName);
        TextView tvAge = (TextView) findViewById(R.id.tvAge);

        Intent intent = getIntent();
        Bundle getInfomation = intent.getBundleExtra("Infomation");

        String username = getInfomation.getString(MainActivity1.KEY_USER_NAME);
        String age = getInfomation.getString(MainActivity1.KEY_AGE);

        tvUserName.setText(getResources().getString(R.string.username, username));
        tvAge.setText(getResources().getString(R.string.age, age));

    }
}
