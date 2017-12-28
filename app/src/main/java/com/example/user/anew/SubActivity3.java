package com.example.user.anew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity3 extends AppCompatActivity {
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //이전페이지 전환
                Intent intent = new Intent(SubActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void addclick(View v){
        EditText NUMBER1 =(EditText)findViewById(R.id.NUMBER1);
        EditText NUMBER2 =(EditText)findViewById(R.id.NUMBER2);
        TextView RESULT = (TextView) findViewById(R.id.RESULT);
        int n1 = Integer.parseInt(NUMBER1.getText().toString());
        int n2 = Integer.parseInt(NUMBER2.getText().toString());
        RESULT.setText(Integer.toString(n1+n2));


    }

    public  void subclick(View v){
        EditText NUMBER1 =(EditText)findViewById(R.id.NUMBER1);
        EditText NUMBER2 =(EditText)findViewById(R.id.NUMBER2);
        TextView RESULT = (TextView) findViewById(R.id.RESULT);
        int n1 = Integer.parseInt(NUMBER1.getText().toString());
        int n2 = Integer.parseInt(NUMBER2.getText().toString());
        RESULT.setText(Integer.toString(n1-n2));


    }

    public  void mulclick(View v){
        EditText NUMBER1 =(EditText)findViewById(R.id.NUMBER1);
        EditText NUMBER2 =(EditText)findViewById(R.id.NUMBER2);
        TextView RESULT = (TextView) findViewById(R.id.RESULT);
        int n1 = Integer.parseInt(NUMBER1.getText().toString());
        int n2 = Integer.parseInt(NUMBER2.getText().toString());
        RESULT.setText(Integer.toString(n1*n2));


    }

    public  void divclick(View v){
        EditText NUMBER1 =(EditText)findViewById(R.id.NUMBER1);
        EditText NUMBER2 =(EditText)findViewById(R.id.NUMBER2);
        TextView RESULT = (TextView) findViewById(R.id.RESULT);
        int n1 = Integer.parseInt(NUMBER1.getText().toString());
        int n2 = Integer.parseInt(NUMBER2.getText().toString());
        RESULT.setText(Integer.toString(n1/n2));


    }

}
