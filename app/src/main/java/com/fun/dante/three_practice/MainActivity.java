package com.fun.dante.three_practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.Text_Display);

        Button but = findViewById(R.id.but);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText()!=null)
                {
                    textView.setText("");
                }
                textView.setText("My Heart will Go On!");
            }
        });

        CheckBox checkBox_first = findViewById(R.id.first);
        checkBox_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText()!=null)
                {
                    textView.setText("");
                }
                textView.setText("Yes,u are right!");
            }
        });

        CheckBox checkBox_second = findViewById(R.id.Second);
        checkBox_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText()!=null)
                {
                    textView.setText("");
                }
                textView.setText("No,u are wrong!");
            }
        });

        CheckBox checkBox_Third = findViewById(R.id.Third);
        checkBox_Third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText()!=null)
                {
                    textView.setText("");
                }
                textView.setText("Nope,u are Killer!");
            }
        });

        RadioButton radioButton_first = findViewById(R.id.Rd_First);
        radioButton_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText()!=null)
                {
                    textView.setText("");
                }
                textView.setText("Yes.I love You.");
            }
        });


        RadioButton radioButton_second = findViewById(R.id.Rd_Second);
        radioButton_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText()!=null)
                {
                    textView.setText("");
                }
                textView.setText("No,I Hate You.");
            }
        });

        RadioButton radioButton_third = findViewById(R.id.Rd_Third);
        radioButton_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText()!=null)
                {
                    textView.setText("");
                }
                textView.setText("Nope,I'm Killer.");
            }
        });
    }
}
