package com.example.kidzjamz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        //add listener to onCreate to navigate to top preschool songs playlist
        Button btnPreschool = (Button) findViewById(R.id.btnPreschool);
        btnPreschool.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                goPreschool();
            }
        });

        //listener for naptime songs playlist
        Button btnNaptime = (Button) findViewById(R.id.btnNaptime);
        btnNaptime.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                goNaptime();
            }
        });

        //listener for disney songs playlist
        Button btnDisney = (Button) findViewById(R.id.btnDisney);
        btnDisney.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                goDisney();
            }
        });
    }
    private void goPreschool() {
        Intent intent = new Intent(MainActivity.this, PreschoolActivity.class);
        this.startActivity(intent);
    }
    private void goNaptime() {
        Intent intent = new Intent(MainActivity.this, NaptimeActivity.class);
        this.startActivity(intent);
    }

    private void goDisney() {
        Intent intent = new Intent(MainActivity.this, DisneyActivity.class);
        this.startActivity(intent);
    }

    public void musicpause(View view) {
    }

    public void musicplay(View view) {
    }

    public void musicstop(View view) {
    }

}