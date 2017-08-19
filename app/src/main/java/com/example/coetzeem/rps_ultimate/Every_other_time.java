package com.example.coetzeem.rps_ultimate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Display;

public class Every_other_time extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_every_other_time);
    }

    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.BD2){
            Intent i = new Intent(Every_other_time.this, First_Screen.class);
            startActivity(i);
        }
    }
    public void OCB (View v)
    {
        if (v.getId() == R.id.BDJAL){
            Intent i = new Intent(Every_other_time.this, First_Screen.class);
            startActivity(i);
        }
    }
}