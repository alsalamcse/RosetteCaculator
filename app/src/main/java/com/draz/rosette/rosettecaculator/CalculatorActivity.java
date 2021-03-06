package com.draz.rosette.rosettecaculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnZa2d, btnNa2s, btnDrb, btn2smi, btnKowa, btnYsawi, btnClear;
    private TextView tvResult, etNum1, etNum2, tvQues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btnZa2d = (Button) findViewById(R.id.btnZa2d);
        btnNa2s = (Button) findViewById(R.id.btnNa2s);
        btnDrb = (Button) findViewById(R.id.btnDrb);
        btn2smi = (Button) findViewById(R.id.btn2smi);
        btnKowa = (Button) findViewById(R.id.btnKowa);
        btnYsawi = (Button) findViewById(R.id.btnYsawi);
        btnClear = (Button) findViewById(R.id.btnClear);
        tvQues=(TextView)findViewById(R.id.tvQues);
        tvResult = (TextView) findViewById(R.id.tvResult);
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        btnZa2d.setOnClickListener(this);
        btnNa2s.setOnClickListener(this);
        btnDrb.setOnClickListener(this);
        btn2smi.setOnClickListener(this);
        btnKowa.setOnClickListener(this);
        btnYsawi.setOnClickListener(this);
        btnClear.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        if (view == btnZa2d) {
            tvQues.setText("+");
        }
        if (view == btnNa2s) {
            tvQues.setText("-");
        }
        if (view == btnDrb) {
            tvQues.setText("x");
        }
        if (view == btn2smi) {
            tvQues.setText("/");
        }

        if (view == btnKowa) {
            tvQues.setText("^");
        }

        if (view == btnYsawi) {
            String stNum1 = etNum1.getText().toString();
            double num1 = Double.parseDouble(stNum1);

            String stNum2 = etNum2.getText().toString();
            double num2 = Double.parseDouble(stNum2);
            String stQues =tvQues.getText().toString();
            if (stQues.equals("+"))
            {
                tvResult .setText((num1+num2)+"");
            }
            if (stQues.equals("-"))
            {
                tvResult .setText((num1-num2)+"");
            }
            if (stQues.equals("/"))
            {
                tvResult .setText((num1/num2)+"");
            }
            if (stQues.equals("x"))
            {
                tvResult .setText((num1*num2)+"");
            }
            if (stQues.equals("^"))
            {
                tvResult.setText((Math.pow(num1,num2))+"");
            }
        }
        if (view == btnClear) {
            tvResult.setText(" ");
            etNum1.setText((" "));
            etNum2.setText(" ");
        }
        }

        }

