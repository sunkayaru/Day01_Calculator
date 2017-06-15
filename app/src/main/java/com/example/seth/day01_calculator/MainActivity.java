package com.example.seth.day01_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int opt1,opt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView resultshow = (TextView)findViewById(R.id.result);
        final EditText first = (EditText) findViewById(R.id.no_first);
        final EditText second = (EditText) findViewById(R.id.no_second);
//        opt1 = Integer.parseInt(first.getText().toString());
//        opt2 = Integer.parseInt(second.getText().toString());


        Button add = (Button) findViewById(R.id.btn_add);
        Button sub = (Button) findViewById(R.id.btn_sub);
        Button mul = (Button) findViewById(R.id.btn_mul);
        Button dev = (Button) findViewById(R.id.btn_dev);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(first.getText().toString())+Integer.parseInt(second.getText().toString());
                resultshow.setText(result+"");
                //Toast.makeText(v.getContext(),Integer.toString(result),Toast.LENGTH_SHORT).show();

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(first.getText().toString())-Integer.parseInt(second.getText().toString());
                resultshow.setText(result+"");
               // Toast.makeText(v.getContext(),Integer.toString(result),Toast.LENGTH_SHORT).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(first.getText().toString())*Integer.parseInt(second.getText().toString());
                resultshow.setText(result+"");
                //Toast.makeText(v.getContext(),Integer.toString(result),Toast.LENGTH_SHORT).show();

            }
        });
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = (float)Integer.parseInt(first.getText().toString())/(float) Integer.parseInt(second.getText().toString());
                resultshow.setText(result+"");
               // Toast.makeText(v.getContext(),Double.toString(result),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
