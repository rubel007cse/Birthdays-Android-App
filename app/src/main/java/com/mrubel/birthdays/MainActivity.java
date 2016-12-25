package com.mrubel.birthdays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.bday);

        b1 = (Button) findViewById(R.id.save);
        b2 = (Button) findViewById(R.id.show);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String _name = e1.getText().toString();
                String _bday = e2.getText().toString();

                Toast.makeText(getApplicationContext(), "Name: "+_name+", Bday: "+_bday, Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BirthdayOfFriends.class));
            }
        });



    }
}
