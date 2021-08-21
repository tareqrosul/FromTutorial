package com.example.fromtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    CheckBox harry,rings,matrix;
    RadioGroup status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main4);

        harry=findViewById(R.id.harry);
        rings=findViewById(R.id.lord);
        matrix=findViewById(R.id.matrix);

        status=findViewById(R.id.status);
        int checked=status.getCheckedRadioButtonId();
        status.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.married:
                        Toast.makeText(MainActivity2.this, "Marrid", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.single:
                        Toast.makeText(MainActivity2.this, "Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.inrel:
                        Toast.makeText(MainActivity2.this, "In a relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        if(harry.isChecked()){
            Toast.makeText(this, "yee you've watched harry potter", Toast.LENGTH_SHORT).show();
        }

        rings.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               if(b){
                   Toast.makeText(MainActivity2.this, "Good Boy have wathced the LOR", Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(MainActivity2.this, "You Gotta see this man", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}