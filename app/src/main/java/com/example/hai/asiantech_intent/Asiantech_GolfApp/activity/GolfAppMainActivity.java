package com.example.hai.asiantech_intent.Asiantech_GolfApp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.hai.asiantech_intent.Asiantech_GolfApp.model.User;
import com.example.hai.asiantech_intent.R;

/**
 * Created by Hai on 6/8/2017.
 */

public class GolfAppMainActivity extends AppCompatActivity implements View.OnKeyListener, CompoundButton.OnCheckedChangeListener {

    public static String KEY_GET_INTENT = "1";
    public static String KEY_GET_BUNDLE = "2";
    private EditText mEdtEmail;
    private EditText mEdtPassword;
    private EditText mEdtName;
    private RadioButton mRbMale;
    private RadioButton mRbFemale;
    private String mGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.golfapp_acitivity_main);


        mEdtEmail = (EditText) findViewById(R.id.edtEmail);
        mEdtPassword = (EditText) findViewById(R.id.edtPassword);
        mEdtName = (EditText) findViewById(R.id.edtName);
        mRbMale = (RadioButton) findViewById(R.id.rbMaleGolf);
        mRbFemale = (RadioButton) findViewById(R.id.rbFemaleGolf);
        Button btnContinue = (Button) findViewById(R.id.btnContinue);

        mRbMale.setOnCheckedChangeListener(this);
        mRbFemale.setOnCheckedChangeListener(this);
        mEdtEmail.setOnKeyListener(this);
        mEdtPassword.setOnKeyListener(this);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mEdtEmail.getText().toString();
                String pass = mEdtPassword.getText().toString();
                String name = mEdtName.getText().toString();
                if (v.getId() == R.id.btnContinue) {
                    if (!email.isEmpty() && !pass.isEmpty() && !name.isEmpty()) {
                        User user = new User(email, pass, name, mGender);
                        Intent intent = new Intent(GolfAppMainActivity.this, InfomationGolfAppActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putSerializable(KEY_GET_BUNDLE, user);
                        intent.putExtra(KEY_GET_INTENT, bundle);
                        startActivity(intent);

                    }
                }
            }
        });
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (v.getId() == R.id.edtEmail) {
            if (keyCode == KeyEvent.KEYCODE_ENTER) {
                mEdtPassword.setEnabled(true);
            }
        }
        if (v.getId() == R.id.edtPassword) {
            if (keyCode == KeyEvent.KEYCODE_ENTER) {
                mEdtName.setEnabled(true);
            }
        }
        return false;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (mRbMale.isChecked()) {
            mGender = mRbMale.getText().toString();
            mRbMale.setBackgroundColor(getResources().getColor(R.color.radiobutton_color_selected));
            mRbFemale.setBackgroundColor(getResources().getColor(R.color.radiobutton_color_noselected));
        }
        if (mRbFemale.isChecked()) {
            mGender = mRbFemale.getText().toString();
            mRbFemale.setBackgroundColor(getResources().getColor(R.color.radiobutton_color_selected));
            mRbMale.setBackgroundColor(getResources().getColor(R.color.radiobutton_color_noselected));
        }
    }
}
