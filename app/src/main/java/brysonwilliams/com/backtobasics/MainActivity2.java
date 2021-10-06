package brysonwilliams.com.backtobasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClick(View view) {
        EditText num1TxtBox = findViewById(R.id.editTextNum1);
        EditText num2TxtBox = findViewById(R.id.editTextNum2);
        EditText operatorBox = findViewById(R.id.editTextOperator);
        TextView answer = findViewById(R.id.textViewAnswer);

        String num1String = num1TxtBox.getText().toString();
        int intNum1 = Integer.parseInt(num1String);

        String num2String = num2TxtBox.getText().toString();
        int intNum2 = Integer.parseInt(num2String);

        String operator = operatorBox.getText().toString();
        float PiNumber = (float) 3.14;

        float answerNumber = 0;

        if (operator.equals("+") || operator.equals("plus")) {
            answerNumber = intNum1 + intNum2;
        }

        else if (operator.equals("-") || operator.equals("minus")) {
            answerNumber = intNum1 - intNum2;
        }

        else if (operator.equals("/") || operator.equals("divide")) {
            answerNumber = intNum1 / intNum2;
        }

        else if (operator.equals("*") || operator.equals("multiply")) {
            answerNumber = intNum1 * intNum2;
        }

        else if (operator.equals("pi") || operator.equals("π")){
            answerNumber = intNum1 * PiNumber + intNum2 - intNum2;
        }

        else if (operator.equals("^")){
            answerNumber = intNum1 ^ intNum2;
        }

        else if (operator.equals("")){
            toastMsg("You are an idiot fam!");
        }
        answer.setText(Float.toString(answerNumber));
    }
}
