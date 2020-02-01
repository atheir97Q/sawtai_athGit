package com.example.sawtai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class Home extends AppCompatActivity {
    // define variables for start communication
private TextView Start_communication;
private ImageView Start_communication_image;
private LinearLayout StartCommunication ;
    // define variables for start get reply
    private TextView get_reply;
    private ImageView get_reply_image;
    private LinearLayout getreply ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Start_communication = findViewById(R.id.Start_communication);
        Start_communication_image = findViewById(R.id.Start_communication_image);
        StartCommunication = findViewById(R.id.startcommunication);
        get_reply = findViewById(R.id.get_reply);
        get_reply_image = findViewById(R.id.get_reply_image);
        getreply = findViewById(R.id.getreply);
        Start_communication_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Communication.class);
                startActivity(intent);
                finish();
            }//onClick
        });//onClickListener
        get_reply_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, GetReply.class);
                startActivity(intent);
                finish();
            }//onClick
        });//onClickListener

    }// on create
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}// end class
