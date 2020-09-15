package com.gizempalaslioglu.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    int value1;
    int value2;
    public String[] operationArray={"addition time","substraction time","multiplication time","division time"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView1=findViewById(R.id.textView1);//final dememin sebebi hata verdiği için(final yapmamı istedi)
        Button button5=findViewById(R.id.button5);
        setNewNumbers();
        button5.setOnClickListener(new View.OnClickListener() {//choose operation a tıklandığında textview1 de operation çeşidi değişir
            //random olarak(random class ile)
            @Override
            public void onClick(View v) {
                Random random = new Random();
                // you have also handle min to max index
                int index = random.nextInt(operationArray.length - 0) + 0;
                textView1.setText(operationArray[index]);
                //textView1.setText("");
            }
        });

    }

    public void addControlClick (View view){
        TextView Answer = findViewById(R.id.Answer);//Answer idli textview tanımlandı
        EditText Attempt = findViewById(R.id.Attempt);//Attempt idli edittext tanımlandı
        int userAnswer = Integer.parseInt(Attempt.getText().toString());
        //Attempt içeriği string e çevrildi sonra int e dönüştürüldü sonra int tipinde userAnswer a atandı
        if(userAnswer == value1+value2) {//userAnswer(yazılan cevap) value1+value2 ye eşitse...
            Answer.setText("Correct!");//Answer textview inde bu yazı çıkacak
        } else {//eşit değilse
            Answer.setText("Wrong, the correct answer was: " + (value1+value2));//Answer textview inde bu yazı çıkacak
        }
        setNewNumbers();
    }
    public void subControlClick(View view){
        TextView Answer = findViewById(R.id.Answer);//Answer idli textview tanımlandı
        EditText Attempt = findViewById(R.id.Attempt);//Attempt idli edittext tanımlandı
        int userAnswer = Integer.parseInt(Attempt.getText().toString());
        //Attempt içeriği string e çevrildi sonra int e dönüştürüldü sonra int tipinde userAnswer a atandı
        if(userAnswer == value1-value2) {//userAnswer(yazılan cevap) value1+value2 ye eşitse...
            Answer.setText("Correct!");//Answer textview inde bu yazı çıkacak
        } else {//eşit değilse
            Answer.setText("Wrong, the correct answer was: " + (value1-value2));//Answer textview inde bu yazı çıkacak
        }
        setNewNumbers();
    }

    public void mulControlClick(View view){
        TextView Answer = findViewById(R.id.Answer);//Answer idli textview tanımlandı
        EditText Attempt = findViewById(R.id.Attempt);//Attempt idli edittext tanımlandı
        int userAnswer = Integer.parseInt(Attempt.getText().toString());
        //Attempt içeriği string e çevrildi sonra int e dönüştürüldü sonra int tipinde userAnswer a atandı
        if(userAnswer == value1*value2) {//userAnswer(yazılan cevap) value1+value2 ye eşitse...
            Answer.setText("Correct!");//Answer textview inde bu yazı çıkacak
        } else {//eşit değilse
            Answer.setText("Wrong, the correct answer was: " + (value1*value2));//Answer textview inde bu yazı çıkacak
        }
        setNewNumbers();
    }
    public void divControlClick(View view){
        TextView Answer = findViewById(R.id.Answer);//Answer idli textview tanımlandı
        EditText Attempt = findViewById(R.id.Attempt);//Attempt idli edittext tanımlandı
        int userAnswer = Integer.parseInt(Attempt.getText().toString());
        //Attempt içeriği string e çevrildi sonra int e dönüştürüldü sonra int tipinde userAnswer a atandı
        if(userAnswer == value1/value2) {//userAnswer(yazılan cevap) value1+value2 ye eşitse...
            Answer.setText("Correct!");//Answer textview inde bu yazı çıkacak
        } else {//eşit değilse
            Answer.setText("Wrong, the correct answer was: " + (value1/value2));//Answer textview inde bu yazı çıkacak
        }
        setNewNumbers();
    }
    private void setNewNumbers () {
        Random r = new Random();//random class
        value1 = 10+r.nextInt(30);//10 ile 39
        value2=5+r.nextInt(6); // 5 ile 10

        TextView Number1 = findViewById(R.id.Number1);//Number1 idli textview ü tanımladık
        Number1.setText(""+value1);// value1 i Number1 textview üne koyduk
        TextView Number2 = findViewById(R.id.Number2);//Number2 idli textview ü tanımladık
        Number2.setText(""+value2);// value2 i Number2 textview üne koyduk
        EditText Attempt = findViewById(R.id.Attempt); //Attempt idli edittext i tanımladık
        Attempt.setText("");// orayı boş bıraktık

    }
}