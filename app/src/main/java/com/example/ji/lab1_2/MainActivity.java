package com.example.ji.lab1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public EditText edit_name;

    public Button btn_print;
    public Button btn_clear;

    public TextView view_print;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init()
    {
        btn_clear = (Button) findViewById(R.id.clearButton);
        btn_print = (Button) findViewById(R.id.printButton);
        edit_name = (EditText) findViewById(R.id.nameLine);

        view_print = (TextView) findViewById(R.id.listView);

        btn_print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printClicked(view);
            }
        });


        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearClicked(view);
            }
        });


    }

    public void clearClicked(View v)
    {
        edit_name.setText("");
        view_print.setText("");
    }

    public void printClicked(View v)
    {
        String text = " ";
        text = edit_name.getText().toString();
        view_print.setText(text);
    }

}
