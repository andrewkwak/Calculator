package example.org.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static example.org.calculator.R.id.firstNum;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button addBtn;
    private Button subBtn;
    private Button divBtn;
    private Button multBtn;
    private Button clrBtn;
    private TextView resultText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(firstNum);
        operand2 = (EditText) findViewById(R.id.secondNum);
        addBtn = (Button) findViewById(R.id.addButton);
        subBtn = (Button) findViewById(R.id.subButton);
        divBtn = (Button) findViewById(R.id.divButton);
        multBtn = (Button) findViewById(R.id.multButton);
        clrBtn = (Button) findViewById(R.id.clrButton);
        resultText = (TextView) findViewById(R.id.resultText);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() < 1 && operand2.getText().length() < 1){
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand field.", Toast.LENGTH_LONG).show();
                }else {
                    double firstNum = Double.parseDouble(operand1.getText().toString());
                    double secondNum = Double.parseDouble(operand2.getText().toString());
                    double result = firstNum + secondNum;
                    resultText.setText(Double.toString(result));
                }
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() < 1 && operand2.getText().length() < 1){
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand field.", Toast.LENGTH_LONG).show();
                }
                else {
                    double firstNum = Double.parseDouble(operand1.getText().toString());
                    double secondNum = Double.parseDouble(operand2.getText().toString());
                    double result = firstNum - secondNum;
                    resultText.setText(Double.toString(result));
                }
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() < 1 && operand2.getText().length() < 1){
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand field.", Toast.LENGTH_LONG).show();
                }
                else {

                    double firstNum = Double.parseDouble(operand1.getText().toString());
                    double secondNum = Double.parseDouble(operand2.getText().toString());
                    double result = firstNum / secondNum;
                    resultText.setText(Double.toString(result));
                }
            }

        });

        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() < 1 && operand2.getText().length() < 1){
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand field.", Toast.LENGTH_LONG).show();
                }
                else {
                    double firstNum = Double.parseDouble(operand1.getText().toString());
                    double secondNum = Double.parseDouble(operand2.getText().toString());
                    double result = firstNum * secondNum;
                    resultText.setText(Double.toString(result));
                }
            }
        });

        clrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operand1.setText("");
                operand2.setText("");
                resultText.setText("0.0");
                operand1.requestFocus();

            }

        });


    }
}
