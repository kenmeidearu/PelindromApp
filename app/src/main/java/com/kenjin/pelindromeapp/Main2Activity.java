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
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);

        result=findViewById(R.id.resultText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertPolindrom(text.getEditableText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otherPelindrom(text.getEditableText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPalindrom(text.getEditableText().toString());
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

    private void otherPelindrom(String sc){
        String strOrigin = sc.replace(" ", "");
        String strReversed = "";

        char[] charOrigin = strOrigin.toCharArray();

        for(int i = strOrigin.length() - 1; i >= 0; i--){
            strReversed+= charOrigin[i];
        }

        if(strOrigin.toLowerCase().equals(strReversed.toLowerCase())){
            result.setText("Palindrom");
        } else {
            result.setText("Bukan Palindrom");
        }
    }

    private void isPalindrom(String word){
        String feed=word.replaceAll("\\s+","");
        String rev=new StringBuffer(feed).reverse().toString();
        if(rev.equalsIgnoreCase(feed)){
            result.setText("Is Palindrom");
        }else{
            result.setText("Not Palindrom");
        }
    }
}
