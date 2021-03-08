package com.example.oliov7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextView text;
    TextInputEditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        input = (TextInputEditText) findViewById(R.id.textInputEditText);
        input.setOnEditorActionListener(editorActionListener);

    }

    public void helloWorld(View v){
        text.setText(input.getText());
        System.out.println("Hello world!");
    }

    private TextView.OnEditorActionListener editorActionListener = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            text.setText(input.getText());
            return false;
        }
    };

}