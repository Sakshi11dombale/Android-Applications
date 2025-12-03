package com.gatetestforallsubject.sakshiscalculator;

import android.os.Bundle;
//import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button add, subtract, multiply, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;

            etFirstValue = findViewById(R.id.etFirstValue);
            etSecondValue = findViewById(R.id.etSecondValue);

            tvAns = findViewById(R.id.tvAns);

            add = findViewById(R.id.btnAddition);
            subtract = findViewById(R.id.btnSubtract);
            multiply = findViewById(R.id.btnMultiply);
            divide = findViewById(R.id.btnDivision);

            add.setOnClickListener(v1 -> {

                int FirstValue, SecondValue, ans;

                FirstValue = Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = FirstValue + SecondValue;

                tvAns.setText(String.valueOf(ans));
            });


            subtract.setOnClickListener(v2 -> {

                int FirstValue, SecondValue, ans;

                FirstValue = Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = FirstValue - SecondValue;

                tvAns.setText(String.valueOf(ans));
            });

            multiply.setOnClickListener(v3 -> {

                int FirstValue, SecondValue, ans;

                FirstValue = Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt((etSecondValue.getText().toString()));

                ans = FirstValue * SecondValue;

                tvAns.setText(String.valueOf(ans));
            });

            divide.setOnClickListener(v4 -> {

                int FirstValue, SecondValue, ans;

                FirstValue = Integer.parseInt(etFirstValue.getText().toString());
                SecondValue = Integer.parseInt((etSecondValue.getText().toString()));

                ans = FirstValue / SecondValue;

                tvAns.setText(String.valueOf(ans));
            });

            return insets;
        });
    }
    }

//    private void onClick(View v1) {
//
//        int FirstValue, SecondValue, ans;
//
//        FirstValue = Integer.parseInt(etFirstValue.getText().toString());
//        SecondValue = Integer.parseInt((etSecondValue.getText().toString()));
//
//        ans = FirstValue + SecondValue;
//
//        tvAns.setText(ans);
//    }
//}