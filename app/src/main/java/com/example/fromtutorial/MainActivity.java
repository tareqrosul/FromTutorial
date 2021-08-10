package com.example.fromtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn1:
                Toast.makeText(this, "This is Using Switch case", Toast.LENGTH_SHORT).show();
                break;
            case R.id.next:
                Intent intent = new Intent(MainActivity.this, next_activity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }


    private  TextView txt;
    private Button btn,buttonSecond,buttonThird,nextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        buttonThird=findViewById(R.id.btn1);
        buttonThird.setOnClickListener(this);

        nextPage=findViewById(R.id.next);
        nextPage.setOnClickListener(this);

        buttonSecond = findViewById(R.id.hello);
        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt=findViewById(R.id.firsText);
                txt.setText("this is setOnClickListener");
                Toast.makeText(MainActivity.this, "This is second", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void sayHello(View view)
    {
        txt=findViewById(R.id.firsText);
        txt.setText("this is from xml");
        Toast.makeText(this, "This is first", Toast.LENGTH_SHORT).show();
    }
}