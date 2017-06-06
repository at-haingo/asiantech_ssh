package com.example.hai.asiantech_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String KEY_USER_NAME = "USER_NAME";
    public static final String KEY_AGE = "AGE";
    private EditText mEdtUserName, mEdtAge;
    private Button mBtnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtUserName = (EditText) findViewById(R.id.edtUserName);
        mEdtAge = (EditText) findViewById(R.id.edtAge);
        mBtnIntent = (Button) findViewById(R.id.btnIntent);

        mBtnIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnIntent){

            String username = mEdtUserName.getText().toString();
            String age = mEdtAge.getText().toString();

            if(!username.equals("") && !age.equals("")){
                Intent intent = new Intent(MainActivity.this, InfomationActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString(KEY_USER_NAME, username);
                bundle.putString(KEY_AGE, age);

                intent.putExtra("Infomation", bundle);
                startActivity(intent);
                mEdtUserName.setText(null);
                mEdtAge.setText(null);
            }else{
                Toast.makeText(this, "PLEASE INPUT YOUR INFOMATION", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
