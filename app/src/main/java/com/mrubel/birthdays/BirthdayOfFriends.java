package com.mrubel.birthdays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayOfFriends extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_of_friends);

        tv = (TextView) findViewById(R.id.show_data);

        MyDBFunctions mf = new MyDBFunctions(getApplicationContext());

        String[] data = mf.my_data();

        String s = "";

        for(int i=0; i < data.length; i++){

            s = s+ data[i]+"\n\n";
        }

        tv.setText(s);


    }
}
