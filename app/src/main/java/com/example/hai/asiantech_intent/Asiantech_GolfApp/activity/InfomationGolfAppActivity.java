package com.example.hai.asiantech_intent.Asiantech_GolfApp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.hai.asiantech_intent.Asiantech_GolfApp.model.User;
import com.example.hai.asiantech_intent.R;

/**
 * Created by Hai on 6/8/2017.
 */

public class InfomationGolfAppActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomation_golf_app);

        TextView tvEmail = (TextView) findViewById(R.id.tvEmail);
        TextView tvPass = (TextView) findViewById(R.id.tvPassword);
        TextView tvName = (TextView) findViewById(R.id.tvName);
        TextView tvGender = (TextView) findViewById(R.id.tvGender_Golf_app);

        Intent getIntent = getIntent();
        Bundle bundle = getIntent.getBundleExtra(GolfAppMainActivity.KEY_GET_INTENT);
        User user = (User) bundle.getSerializable(GolfAppMainActivity.KEY_GET_BUNDLE);

        tvEmail.setText(user.getEmail());
        tvPass.setText(user.getPassword());
        tvName.setText(user.getName());
        tvGender.setText(user.getGender());
    }
}
