package com.example.cah_ngganteng.absensikaryawan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

        public void diklik (View view) {
            Intent i = new Intent(this, Home.class);
            startActivity(i);
    }
}
