package com.example.hai.asiantech_intent.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hai.asiantech_intent.R;
import com.example.hai.asiantech_intent.model.User;

/**
 * Created by Hai on 6/7/2017.
 */

public class InfomationActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomation);

        TextView tvUserName = (TextView) findViewById(R.id.tvUserName);
        TextView tvAddress = (TextView) findViewById(R.id.tvAddress);
        TextView tvPhone = (TextView) findViewById(R.id.tvPhone);
        TextView tvGender = (TextView) findViewById(R.id.tvGender);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra(NewUserActivity.KEY_BUNDLE);
        User user = (User) bundle.getSerializable(NewUserActivity.KEY_USER);
        tvUserName.setText(user.getName());
        tvAddress.setText(user.getAddress());
        tvPhone.setText(user.getPhone());
        tvGender.setText(user.getGender());
    }
}
