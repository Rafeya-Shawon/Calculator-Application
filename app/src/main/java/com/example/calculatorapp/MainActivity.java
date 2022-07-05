package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMul,btnDiv,btnDot,btnClear,btnEqual;
    EditText eT;
    float res1, res2;
    boolean add, sub, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btn0=(Button)findViewById(R.id.button0);
        btnDot=(Button)findViewById(R.id.buttonDot);
        btnClear=(Button)findViewById(R.id.buttonClear);
        btnDiv=(Button)findViewById(R.id.buttonDiv);
        btnMul=(Button)findViewById(R.id.buttonMul);
        btnSub=(Button)findViewById(R.id.buttonSub);
        btnAdd=(Button)findViewById(R.id.buttonAdd);
        btnEqual=(Button)findViewById(R.id.buttonEqual);
        eT=(EditText)findViewById(R.id.editText);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText(eT.getText()+".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eT==null) {
                    eT.setText("");
                }
                else{
                    res1=Float.parseFloat(eT.getText()+"");
                    add=true;
                    eT.setText(null);
                }

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eT==null) {
                    eT.setText("");
                }
                else{
                    res1=Float.parseFloat(eT.getText()+"");
                    sub=true;
                    eT.setText(null);
                }

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eT==null) {
                    eT.setText("");
                }
                else{
                    res1=Float.parseFloat(eT.getText()+"");
                    mul=true;
                    eT.setText(null);
                }

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eT==null) {
                    eT.setText("");
                }
                else{
                    res1=Float.parseFloat(eT.getText()+"");
                    div=true;
                    eT.setText(null);
                }

            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2=Float.parseFloat(eT.getText()+"");
                if(add==true){
                    eT.setText(res1+res2+"");
                    add=false;
                }
                else if(sub==true){
                    eT.setText(res1-res2+"");
                    sub=false;
                }
                else if(mul==true){
                    eT.setText(res1*res2+"");
                    mul=false;
                }
                else if(div==true){
                    eT.setText(res1/res2+"");
                    div=false;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eT.setText("");
            }
        });


    }
}