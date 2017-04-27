package com.example.amit.hant;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    TextView t1,t2,t3,t4;
    EditText et1,et2;
    EditText et;
    FloatingActionButton f1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    double num1,num2,num3;
    boolean switchFocus=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView1);
        t3=(TextView)findViewById(R.id.textView2);
        t4=(TextView)findViewById(R.id.textView3);
        et1=(EditText)findViewById(R.id.editText);
        et1.setInputType(InputType.TYPE_NULL);
        et2=(EditText)findViewById(R.id.editText2);
        et2.setInputType(InputType.TYPE_NULL);
        f1=(FloatingActionButton)findViewById(R.id.fab);
        et=et1;
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //switchFocus=true;
                if(et1.hasFocus()){
                    if(et2.requestFocus()){
                        //Toast.makeText(getApplicationContext(),"Request Focuse on ET 2",Toast.LENGTH_LONG).show();
                        et=et2;
                    }
                }
                else if(et2.hasFocus()){

                    if(et1.requestFocus()){
                        et=et1;

                    }
                }
            }
        });


        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                num1=Double.parseDouble(et1.getText().toString());
                num2=Double.parseDouble(et2.getText().toString());
               // num3=(num1*num2)/100;
                num3=num1*2;
                t4.setText(Double.toString(num3));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"1");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });
       b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"8");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"9");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"0");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+".");
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=et.getText().toString();
                et.setText(temp.substring(0,temp.length()-1));
            }
        });
    }

    /*public EditText getRequestFocus(){
        if(!switchFocus){
            et1.requestFocus();
            return et1;
        }else{
            et2.requestFocus();
            return et2;
        }
    }*/

    @Override
    public void onClick(View v)
    {


    }

}
