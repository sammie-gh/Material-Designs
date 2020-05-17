package com.gh.sammie.dashboarddesigns;



//https://www.youtube.com/watch?v=-YCUrHFUxlA&feature=youtu.be

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity {
CardView mycard ;
    Intent i ;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.bankcardId);
        i = new Intent(this,ae.class);
        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });

    }
}
