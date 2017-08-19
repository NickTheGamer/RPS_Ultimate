package com.example.coetzeem.rps_ultimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.content.Intent;

public class Confirm_Join_League extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm__join__league);
    }

    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.BD){
            Intent i = new Intent(Confirm_Join_League.this, Every_other_time.class);
            startActivity(i);
    }
    }
}
