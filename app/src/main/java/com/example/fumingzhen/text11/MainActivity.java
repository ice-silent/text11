package com.example.fumingzhen.text11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.buttonSartAnother);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent=new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("name", "Zhangsan");
                intent.putExtra("age",20);
                startActivityForResult(intent,0);

            }
        });
        Button button1=(Button)findViewById(R.id.buttonSartAnother2);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent1=new Intent(MainActivity.this,AnotherActivity2.class);
                intent1.putExtra("sex","男");
                intent1.putExtra("NO","2014011396");
                startActivityForResult(intent1,1);

            }
        });
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0&&resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        }
        else if(requestCode==1&&resultCode==1){
            String str1=data.getStringExtra("result5");
            Toast.makeText(this, str1, Toast.LENGTH_LONG).show();
        }

    }
}
