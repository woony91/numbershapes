package com.example.numbershapesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int num;
        boolean isSquare(){
            double squareRoot = Math.sqrt(num);
            if (squareRoot == Math.floor(squareRoot)){
                return true;
            } else {
                return false;
            }
        }

        boolean isTriangular() {
            int x = 1;
            int triangularNumber = 1;
            while (triangularNumber < num) {
                x++;
                triangularNumber = triangularNumber + x;
            }
            if (triangularNumber == num) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void clickFunction(View view){
        Log.i("Info", "Button pressed");

        EditText editText = (EditText) findViewById(R.id.et_number);

        String message;

        if (editText.getText().toString().isEmpty()){
            message = "Please enter a number";

        } else {

            Number myNumber = new Number();
            myNumber.num = Integer.parseInt(editText.getText().toString());

            System.out.println(myNumber.isSquare());

            if (myNumber.isSquare() && myNumber.isTriangular()) {
                message = myNumber.num + " is a triangular and square number";
            } else if (myNumber.isTriangular()) {
                message = myNumber.num + " is a triangular number";
            } else if (myNumber.isSquare()) {
                message = myNumber.num + " is a square number";
            } else {
                message = myNumber.num + " is neither a triangular nor square number";
            }
        }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
