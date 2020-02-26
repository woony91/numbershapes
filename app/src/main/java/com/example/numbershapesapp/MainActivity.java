package com.example.numbershapesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    class Number {
        int num;
        public boolean isSquare(){
            double squareRoot = Math.sqrt(num);
            if (squareRoot == Math.floor(squareRoot)){
                return true;
            } else {
                return false;
            }
        }

        public boolean isTriangular() {
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
        EditText etNumber = (EditText) findViewById(R.id.et_number);
        int num = (int) Double.parseDouble(etNumber.getText().toString());
        Log.i("info", "clickFunction: works");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
