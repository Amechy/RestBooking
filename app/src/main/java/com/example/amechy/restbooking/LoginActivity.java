package com.example.amechy.restbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity  implements View.OnClickListener{

    Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSignIn:
                startActivity(new Intent(LoginActivity.this,NearRestaurantActivity.class));
        }
    }
}
