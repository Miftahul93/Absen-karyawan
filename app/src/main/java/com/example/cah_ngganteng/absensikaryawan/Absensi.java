package com.example.cah_ngganteng.absensikaryawan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Absensi extends Activity implements OnClickListener {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi);

        startButton = (Button) findViewById(R.id.buttonStart);
        startButton.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.buttonStart : Intent i = new Intent(this, QRScanner.class);
                startActivity(i);
        }
    }
}
