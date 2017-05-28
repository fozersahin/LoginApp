package com.example.fozersahin.loginapp;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import Adapter.UserAdapter;
import Models.User;
import Models.UserLogin;

public class RegisterActivity extends AppCompatActivity {

//    private EditText nameView;
//    private EditText surnameView;
//    private EditText phoneView ;
//    private EditText emailView ;
//    private EditText passwordView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

/*        User user = new User(usersRef.push().getKey().toString() , "Hilal" , "Bozkurt" , "5079939784" , "hillbzkrt@gmail.com" , "123456abcd");
        usersRef.setValue(user);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("User1");*/
        //databaseReference.updateChildren();
        Button registterButton =(Button) findViewById(R.id.register_button);
        registterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name =((EditText)findViewById(R.id.name_register)).getText().toString();
                final String surname = ((EditText)findViewById(R.id.surname_register)).getText().toString();
                final String number = ((EditText)findViewById(R.id.phone)).getText().toString();
                final String mail =  ((EditText) findViewById(R.id.email)).getText().toString();
                final String password = ((EditText)findViewById(R.id.password_register)).getText().toString();

                User user = new User(null , name ,surname,number,mail);

                if(createUser(user))
                {
                    Intent intent = new Intent(RegisterActivity.this ,LoginActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

    public boolean createUser(User user , UserLogin userLogin)
    {
        UserAdapter adapter = new UserAdapter();
        adapter.CreateUser(user , userLogin);

        return true;
    }







}
