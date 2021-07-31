package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Sum,Sub,Mul;
    private Button Div;
    private EditText edittext1,edittext2;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sum=findViewById(R.id.Sum);
        Sub=findViewById(R.id.Sub);
        Mul=findViewById(R.id.Mul);
        Div =findViewById(R.id.Div);
        edittext1=findViewById(R.id.edittext1);
        edittext2=findViewById(R.id.edittext2);
        textView4=findViewById(R.id.textView4);


        Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=edittext1.getText().toString();
                int a1=Integer.parseInt(s1);
                String s2=edittext2.getText().toString();
                int a2=Integer.parseInt(s2);
                int ans;
                ans=a1+a2;
                textView4.setText("The Sum of given  2 Number is :"+ans);
                Toast.makeText(MainActivity.this, "Operation done successfully", Toast.LENGTH_SHORT).show();

            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=edittext1.getText().toString();
                int a1=Integer.parseInt(s1);
                String s2=edittext2.getText().toString();
                int a2=Integer.parseInt(s2);
                int ans;
                ans=a1-a2;
                textView4.setText("The Subtraction of given 2 number is :"+ans);
                Toast.makeText(MainActivity.this, "Operation done successfully", Toast.LENGTH_SHORT).show();


            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=edittext1.getText().toString();
                int a1=Integer.parseInt(s1);
                String s2=edittext2.getText().toString();
                int a2=Integer.parseInt(s2);
                int ans;
                ans=a1*a2;
                textView4.setText("The multiplication of 2 number is :"+ans);
                Toast.makeText(MainActivity.this, "Operation done successfully", Toast.LENGTH_SHORT).show();

            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=edittext1.getText().toString();
                int a1=Integer.parseInt(s1);
                String s2=edittext2.getText().toString();
                int a2=Integer.parseInt(s2);
                if(a2==0){
                    textView4.setText("Second number cant be zero");
                    Toast.makeText(MainActivity.this, "Second number cant be zero", Toast.LENGTH_SHORT).show();

                }
                else{
                    int ans;
                    ans=a1/a2;
                    textView4.setText("The division of the given 2 number is:"+ans);
                    Toast.makeText(MainActivity.this, "Operation done successfully", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
}