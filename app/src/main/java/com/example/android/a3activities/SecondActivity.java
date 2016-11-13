package com.example.android.a3activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class SecondActivity extends AppCompatActivity {

    EditText e3;
    EditText e4;
    Button b2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        b2 = (Button) findViewById(R.id.button2);

        Intent i1 = getIntent();
        Bundle b = i1.getExtras();
        final String s =b.getString("Name");
        final String s1 = b.getString("Email");

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(SecondActivity.this,ThirdActivity.class);
                i2.putExtra("Mobile",e3.getText().toString());
                i2.putExtra("City",e4.getText().toString());
                i2.putExtra("Name",s);
                i2.putExtra("Email",s1);
                startActivity(i2);
            }
        });
    }
}
