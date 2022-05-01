package com.example.merofirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText editUsername, editPassword;
    private AppCompatButton   signUpButton, signInButton;

//    private CheckBox chkFootBall, chkvolleyBall,  chkTennis, chkLudo;
//    activity life cycle
//    1. onCreate  when activity crate
//    2. onStart   when activity launched
//    3. onPause   pause when the another activity is created or launched
//    4. onResume  after the activity start from the pause state
//    5. onDestroy  activity when the activity killed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        link between layout and activity file
        setContentView(R.layout.layout_login);
        initToolBar();
        findView();


    }

    private void findView(){

        editUsername = findViewById(R.id.username);
        editPassword = findViewById(R.id.password);
        signUpButton = findViewById(R.id.sign_up_button);
        signInButton = findViewById(R.id.sign_in_button);

//        chkFootBall = findViewById(R.id.chkfootball);
//        chkTennis = findViewById(R.id.chktennis);
//        chkLudo = findViewById(R.id.chkludo);
//        chkvolleyBall = findViewById(R.id.chkvolleyball);
//        chkFootBall.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//
//            }
//        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
//            String hobbies = "";
            @Override
            public void onClick(View view) {
//                if(chkFootBall.isChecked()){
//                    hobbies = hobbies + " "+ chkFootBall.getText().toString();
//                } else if(chkLudo.isChecked()) {
//                    hobbies = hobbies + " " + chkLudo.getText().toString();
//                } else if(chkTennis.isChecked()) {
//                    hobbies = hobbies + " " + chkTennis.getText().toString();
//                } else if(chkvolleyBall.isChecked()) {
//                    hobbies = hobbies+ " " + chkvolleyBall.getText().toString();

//                }

                if(view.getId()==R.id.sign_up_button){
                    Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
                    startActivity(i);
                }
            }


        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editUsername.getText().toString();
                String password = editPassword.getText().toString();
                if(view.getId() == R.id.sign_in_button){

                    Log.d("Data", username + " hello " + password);
                }

                if(!username.isEmpty() && !password.isEmpty()) {
                    // this object will navigate one activity ot another activity
                    Intent intent = new Intent(LoginActivity.this, DashBoardActivity.class);
                    // putting data into intent objec
                    intent.putExtra("Username", username);
                    intent.putExtra("Password", password);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Username and Password cannot be empty", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }

    // code for the tool bar
    private void initToolBar(){
        // R specify the resource file
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("New Mero First App");
        // display back bottom in the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowTitleEnabled(true);

    }
}