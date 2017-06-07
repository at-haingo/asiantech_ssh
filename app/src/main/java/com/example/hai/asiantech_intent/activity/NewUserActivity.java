package com.example.hai.asiantech_intent.activity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.hai.asiantech_intent.R;
import com.example.hai.asiantech_intent.model.Users;

/**
 * Created by Hai on 6/7/2017.
 */

public class NewUserActivity extends Fragment {
    public static final String KEY_USER = "KEY_USER";
    public static final String KEY_BUNDLE = "BUNDLE";
    private EditText mEdtUserName;
    private EditText mEdtAddress;
    private EditText mEdtPhone;
    private String mGender;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_new_user, container, false);
        Button btnSubmit = (Button) layout.findViewById(R.id.btnSubmit);
        mEdtUserName = (EditText) layout.findViewById(R.id.edtUserName);
        mEdtAddress = (EditText) layout.findViewById(R.id.edtAddress);
        mEdtPhone = (EditText) layout.findViewById(R.id.edtPhone);
        RadioGroup rgGenderGroup = (RadioGroup) layout.findViewById(R.id.rgRadioGroup);
        RadioButton rbMale = (RadioButton) layout.findViewById(R.id.rbMale);
        RadioButton rbFemale = (RadioButton) layout.findViewById(R.id.rbFemale);
        int isChecked = rgGenderGroup.getCheckedRadioButtonId();
        if (isChecked == R.id.rbMale) {
            mGender = rbMale.getText().toString();
        } else if (isChecked == R.id.rbFemale) {
            mGender = rbFemale.getText().toString();
        }
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mEdtUserName.getText().toString();
                String address = mEdtAddress.getText().toString();
                String phone = mEdtPhone.getText().toString();
                Users user = new Users(username, address, phone, mGender);

                Intent intent = new Intent(getContext(), InfomationActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable(KEY_USER, user);
                intent.putExtra(KEY_BUNDLE, bundle);
                startActivity(intent);
            }
        });
        return layout;
    }
}
