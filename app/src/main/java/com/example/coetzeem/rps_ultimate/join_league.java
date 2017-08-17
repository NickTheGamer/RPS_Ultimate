package com.example.coetzeem.rps_ultimate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class join_league extends AppCompatActivity {

    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.BC  )
        {
            Intent i = new Intent(join_league.this, Every_other_time.class);
            startActivity(i);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }
}
