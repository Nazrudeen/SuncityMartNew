package com.suncitytechnoe.suncitymartnew.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.suncitytechno.suncitymartnew.R;

public class SigninActivity extends AppCompatActivity {

    TextView suncity, mart, skip;
    LinearLayout signup_layout;
    Button login_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        /*suncity = (TextView) findViewById(R.id.suncity);
        mart = (TextView) findViewById(R.id.mart);
        skip = (TextView) findViewById(R.id.skip);*/

        /*Typeface arialround = Typeface.createFromAsset(getAssets(), "fonts/arialround.ttf");
        suncity.setTypeface(arialround);
        mart.setTypeface(arialround);
        skip.setTypeface(arialround);*/

        skip = (TextView) findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        login_btn = (Button) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        signup_layout = (LinearLayout) findViewById(R.id.signup_layout);
        signup_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SigninActivity.this, SignupActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
