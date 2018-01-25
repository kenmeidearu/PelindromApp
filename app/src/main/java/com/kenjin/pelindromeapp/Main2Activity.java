package com.kenjin.pelindromeapp;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextInputEditText text;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.editText);
        Button button=findViewById(R.id.button);
        result=findViewById(R.id.resultText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertPolindrom(text.getEditableText().toString());
            }
        });
    }
    private  void  convertPolindrom(String word){
        int firstPosition = 0;
        int lastPosition = word.length() - 1; boolean isAPalindrome = true; while(firstPosition < lastPosition){
            if(word.charAt(firstPosition)!=word.charAt(lastPosition)) isAPalindrome = false;
            firstPosition++;
            lastPosition--; }
        if(isAPalindrome)
            result.setText("The word is a Palindrome");
        else
            result.setText("The word is not a Palindrome");
    }
}