package com.example.windows10.yukmasak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //mengarahkan pada layout resep dan diary
    public void next(View view) {

        Intent inte = new Intent(MainActivity.this, ResepDanDiary.class);
        startActivity(inte);
    }
}
