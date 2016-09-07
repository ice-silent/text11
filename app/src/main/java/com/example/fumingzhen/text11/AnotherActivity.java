package com.example.fumingzhen.text11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Button button=(Button)findViewById(R.id.buttonReturn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent=getIntent();
                String name=intent.getStringExtra("name");
                Integer age=intent.getIntExtra("age", 20);
                intent.putExtra("result", "姓名:"+name+"年龄:"+age);
                setResult(0,intent);
                finish();
            }
        });
        Button button1=(Button)findViewById(R.id.buttontoActivity2);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent=new Intent(AnotherActivity.this,AnotherActivity2.class);
                intent.putExtra("name", "李润发");
                intent.putExtra("age",22);
                startActivityForResult(intent,2);
            }
        });


    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2&&resultCode==2){
            String str=data.getStringExtra("result1");
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        }
    }

}

