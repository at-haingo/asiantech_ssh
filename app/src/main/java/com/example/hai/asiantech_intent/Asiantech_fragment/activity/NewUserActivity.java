package com.example.hai.asiantech_intent.Asiantech_fragment.activity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.hai.asiantech_intent.R;
import com.example.hai.asiantech_intent.Asiantech_fragment.model.User;

/**
 * Created by Hai on 6/7/2017.
 */

public class NewUserActivity extends Fragment implements CompoundButton.OnCheckedChangeListener {
    public static final String KEY_USER = "KEY_USER";
    public static final String KEY_BUNDLE = "BUNDLE";
    private EditText mEdtUserName;
    private EditText mEdtAddress;
    private EditText mEdtPhone;
    private String mGender;
    private RadioButton mRbMale;
    private RadioButton mRbFamale;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_new_user, container, false);
        Button btnSubmit = (Button) layout.findViewById(R.id.btnSubmit);
        mEdtUserName = (EditText) layout.findViewById(R.id.edtUserName);
        mEdtAddress = (EditText) layout.findViewById(R.id.edtAddress);
        mEdtPhone = (EditText) layout.findViewById(R.id.edtPhone);
        mRbMale = (RadioButton) layout.findViewById(R.id.rbMale);
        mRbFamale = (RadioButton) layout.findViewById(R.id.rbFemale);
        mRbMale.setOnCheckedChangeListener(this);
        mRbFamale.setOnCheckedChangeListener(this);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mEdtUserName.getText().toString();
                String address = mEdtAddress.getText().toString();
                String phone = mEdtPhone.getText().toString();
                User user = new User(username, address, phone, mGender);

                Intent intent = new Intent(getContext(), InfomationActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable(KEY_USER, user);
                intent.putExtra(KEY_BUNDLE, bundle);
                startActivity(intent);
            }
        });
        return layout;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (mRbMale.isChecked()) {
            mGender = mRbMale.getText().toString();
        }
        if (mRbFamale.isChecked()) {
            mGender = mRbFamale.getText().toString();
        }
    }
}
