package com.example.fromtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class next_activity extends AppCompatActivity {
    EditText edtx;
    TextView tv;
    Button nextBTn1;
    RelativeLayout RL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_next_activity);
        nextBTn1=findViewById(R.id.btnHello);
        nextBTn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RL = (RelativeLayout) findViewById(R.id.RL);
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(RL.getWindowToken(), 0);
                edtx=findViewById(R.id.editTxtName);
                tv=findViewById(R.id.textView22);
                tv.setText(edtx.getText().toString());
            }
        });
    }
}