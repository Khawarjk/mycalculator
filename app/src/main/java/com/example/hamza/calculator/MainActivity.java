package com.example.hamza.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnAdd,btnMines,btnEqual,btndivide,btnmuliply;
    TextView Answer;
    double var1,var2;
    boolean  add,min,div,equal,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 =(Button)findViewById(R.id.btn0);
        btn1 =(Button)findViewById(R.id.btn1);
        btn2 =(Button)findViewById(R.id.btn2);
        btn3 =(Button)findViewById(R.id.btn3);
        btn4 =(Button)findViewById(R.id.btn4);
        btn5 =(Button)findViewById(R.id.btn5);
        btn6 =(Button)findViewById(R.id.btn6);
        btn7 =(Button)findViewById(R.id.btn7);
        btn8 =(Button)findViewById(R.id.btn8);
        btn9 =(Button)findViewById(R.id.btn9);
        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnMines =(Button)findViewById(R.id.btnMines);
        btnEqual =(Button)findViewById(R.id.btnEqual);
        btndivide =(Button)findViewById(R.id.btndivide);
        btnmuliply =(Button)findViewById(R.id.btnmultiply);
        btndot =(Button)findViewById(R.id.btndot);

        Answer = (TextView)findViewById(R.id.Answer);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Answer.setText(Answer.getText()+".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(Answer.getText()+"");
                add=true;
                Answer.setText(null);
            }
        });
        btnmuliply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(Answer.getText()+"");
                mul=true;
                Answer.setText(null);
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(Answer.getText()+"");
                div=true;
                Answer.setText(null);
            }
        });

        btnMines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(Answer.getText()+"");
                min=true;
                Answer.setText(null);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(Answer.getText()+"");
                if(add==true);
                {
                    Answer.setText(var1+var2+"");
                    add=false;
                }
                if(min==true);
                {
                    Answer.setText(var1-var2+"");
                    min=false;
                }
                if(mul==true);
                {
                    Answer.setText(var1+var2+"");
                    mul=false;
                }
                if(div==true);
                {
                    Answer.setText(var1/var2+"");
                    div=false;
                }

            }
        });
    }
}
