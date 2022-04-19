package com.example.merofirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SignUpActivity extends AppCompatActivity {

    private CheckBox chkFootBall, chkvolleyBall,  chkTennis, chkLudo;
    private Button signUpButton1;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_layout);
        initToolBar();
        signUpView();


    }


    private void signUpView(){

        signUpButton1 = findViewById(R.id.sign_up_button);
        chkFootBall = findViewById(R.id.chkfootball);
        chkTennis = findViewById(R.id.chktennis);
        chkLudo = findViewById(R.id.chkludo);
        chkvolleyBall = findViewById(R.id.chkvolleyball);

        signUpButton1.setOnClickListener(new View.OnClickListener() {
            String hobbies = "";
            @Override
            public void onClick(View view) {
                if(chkFootBall.isChecked()){
                    hobbies = hobbies + " "+ chkFootBall.getText().toString();
                }
                if(chkLudo.isChecked()) {
                    hobbies = hobbies + " " + chkLudo.getText().toString();
                }
                if(chkTennis.isChecked()) {
                    hobbies = hobbies + " " + chkTennis.getText().toString();
                }
                if(chkvolleyBall.isChecked()) {
                    hobbies = hobbies+ " " + chkvolleyBall.getText().toString();
                }

                if(view.getId() == R.id.sign_up_button){

                    Log.d("Data","hobbies are   " + hobbies);
                }

            }
        });
    }

    private  void initToolBar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sign up Page");
        // display back bottom in the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }
}