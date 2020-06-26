package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
double a,b,c;
EditText weight,height;
TextView result,category;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=(EditText)findViewById(R.id.weightInput);
        height=(EditText)findViewById(R.id.heightInput);
        b1=(Button)findViewById(R.id.b1);
        result=(TextView)findViewById(R.id.resltoutput);
        category=(TextView)findViewById(R.id.cat);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(weight.getText().toString());
                b=Double.parseDouble(height.getText().toString());
                c=a/(b*b);
                result.setText(Double.toString(c));
                if(c<15)
                {
                    category.setText("very Severely underweight");
                }
                else if(c<16)
                {
                    category.setText("severly uderweight");
                }
                else if(c<18.5)
                {
                    category.setText("underweight");
                }
                else if(c<25)
                {
                    category.setText("normal");
                }
                else if(c<30)
                {
                    category.setText("Overweight");
                }
                else if(c<35)
                {
                    category.setText("obese cat1");

                }
                else if(c<40)
                {
                    category.setText("obese cat 2");
                }
                else
                {
                    category.setText("obese cat 3");
                }


            }
        });

    }
}
