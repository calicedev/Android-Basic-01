package com.example.user.anew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button IMAGE;
    Button btn_next2;
    Button btn_next3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IMAGE = (Button)findViewById(R.id.btn_IMAGE);
        IMAGE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //다음페이지로 전환 형태
                //화면 전환할 때 사용하는 클래스
                Intent intent = new Intent(MainActivity.this, SubActivity1.class);
                startActivity(intent);
            }
        });


        btn_next2 = (Button)findViewById(R.id.btn_next2);
        btn_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //다음페이지로 전환 형태
                //화면 전환할 때 사용하는 클래스
                Intent intent = new Intent(MainActivity.this, SubActivity2.class);
                startActivity(intent);
            }
        });

        btn_next3 = (Button)findViewById(R.id.btn_next3);
        btn_next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //다음페이지로 전환 형태
                //화면 전환할 때 사용하는 클래스
                Intent intent = new Intent(MainActivity.this, SubActivity3.class);
                startActivity(intent);
            }
        });



    }
}
