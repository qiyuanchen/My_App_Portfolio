package com.android.qiyuan.my_app_portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void spotify(View view){
        Toast.makeText(this, "This will launch my Spotify app", Toast.LENGTH_LONG).show();
    }
    public void score(View view){
        Toast.makeText(this,"This will launch my Scores app",Toast.LENGTH_LONG).show();
    }
    public void lib(View view){
        Toast.makeText(this,"This will launch my Library app",Toast.LENGTH_LONG).show();
    }
    public void bigger(View view){
        Toast.makeText(this,"This will launch my Make it Bigger app",Toast.LENGTH_LONG).show();
    }
    public void bacon(View view){
        Toast.makeText(this,"This will launch my Bacon Reader app",Toast.LENGTH_LONG).show();
    }
    public void capstone(View view){
        Toast.makeText(this,"This will launch my Capstone app",Toast.LENGTH_LONG).show();
    }
}
