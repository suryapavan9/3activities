package com.example.android.a3activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity
{

    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    Button b3;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent i2 = getIntent();
        Bundle b = i2.getExtras();
        final String s = b.getString("Name");
        final String s1 = b.getString("Email");
        final String s2 = b.getString("Mobile");
        final String s3 = b.getString("City");

        c1 = (CheckBox) findViewById(R.id.CheckBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        b3 = (Button) findViewById(R.id.button3);

        t1 = (TextView) findViewById(R.id.textView);

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                if(c1.isChecked() == true && c2.isChecked() == false && c3.isChecked() == false)
                {
                    t1.setText(s+ "\n" +s1+ "\n" +s2+ "\n" +s3+ "\n course is B.Tech");
                }
                else if(c1.isChecked() == false && c2.isChecked() == true && c3.isChecked() == false)
                {
                    t1.setText(s + "\n" + s1 + "\n" + s2 + "\n" + s3 + "\n course is MCA");
                }
                else if(c1.isChecked() == false && c2.isChecked() == false && c3.isChecked() == true)
                {
                    t1.setText(s + "\n" + s1 + "\n" + s2 + "\n" + s3 + "\n course is M.Tech");
                }
            }
        });

    }
}
