package com.example.merofirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private CheckBox chkFootBall, chkvolleyBall,  chkTennis, chkLudo;
    private Button signUpButton1;
    private Toolbar toolbar;
    private EditText  phoneNumber, firstName, lastName, address, email, username, password;



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
        phoneNumber = findViewById(R.id.phonenumber);
        firstName = findViewById(R.id.firstname);
        lastName = findViewById(R.id.lastname);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        address = findViewById(R.id.address);
        email = findViewById(R.id.email);


        signUpButton1.setOnClickListener(new View.OnClickListener() {
            String phone1 = phoneNumber.getText().toString();
            String firstName1 = firstName.getText().toString();
            String lastName1 = lastName.getText().toString();
            String username1 = username.getText().toString();
            String password1 = password.getText().toString();
            String address1 = address.getText().toString();
            String email1 = email.getText().toString();
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
                    if(phone1.isEmpty() || firstName1.isEmpty() || lastName1.isEmpty() || username1.isEmpty() || password1.isEmpty() || address1.isEmpty() || email1.isEmpty()) {
//                        Toast.makeText(this, "Required field is empty", Toast.LENGTH_LONG);
                        Toast.makeText(SignUpActivity.this, " Required field is empty ", Toast.LENGTH_LONG).show();
                    }


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