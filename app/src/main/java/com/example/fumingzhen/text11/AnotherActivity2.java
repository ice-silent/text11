package com.example.fumingzhen.text11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnotherActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another2);
        Button button=(Button)findViewById(R.id.buttontoAnotherActivity);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent=getIntent();
                String name=intent.getStringExtra("name");
                Integer age=intent.getIntExtra("age", 22);
                intent.putExtra("result1", "姓名:"+name+"年龄:"+age);
                setResult(2,intent);
                finish();

            }
        });
        Button button1=(Button)findViewById(R.id.buttontoMainActivity);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent1=getIntent();
                String sex=intent1.getStringExtra("sex");
                Integer NO=intent1.getIntExtra("NO",2014011396);
                intent1.putExtra("result5","性别："+sex+"学号"+NO);
                setResult(1,intent1);
                finish();

            }
        });
    }

}

