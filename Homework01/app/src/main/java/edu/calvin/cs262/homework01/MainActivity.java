package edu.calvin.cs262.homework01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView value1, value2, operator, result;
    EditText number1, number2;
    Button calculate;
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        operator = findViewById(R.id.operator);
        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        calculate = findViewById(R.id.calculate);
        spinner1 = findViewById(R.id.spinner1);

        //creating spinner options
        String[] operators = new String[] {"+","-","*","/"};
        //binding options to spinner via an adapter
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, operators);
        spinner1.setAdapter(myAdapter);
    }

    //Calculate Function
    public void calculate(View view){
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        float final_result;
        String option = spinner1.getSelectedItem().toString();

        switch (option){
            case "+":
                final_result = num1 + num2;
                break;
            case "-":
                final_result = num1 - num2;
                break;
            case "*":
                final_result = num1 * num2;
                break;
            default:
                final_result = num1 / num2;
                break;
        }
        result.setText(String.valueOf(final_result));
    }
}