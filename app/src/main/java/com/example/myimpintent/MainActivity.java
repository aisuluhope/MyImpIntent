package com.example.myimpintent;


import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonNumber;
    Button buttonWeb;
    Button buttonAddress;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWeb = (Button)findViewById(R.id.button4);
        buttonAddress = (Button)findViewById(R.id.button);
        buttonNumber = (Button)findViewById(R.id.button3);

        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/hannah.park.315428"));
                startActivity(intent);
            }
        });

        buttonAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo: 42.881662649999996, 74.63062572419622 "));
                startActivity(intent);
            }
        });
        buttonNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: +996703103055"));
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}