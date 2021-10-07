package com.example.koszykowka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView punktyTextView;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Integer punkty=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        punktyTextView = (TextView) findViewById(R.id.textView);
        button_1=(Button) findViewById(R.id.button3);
        button_2=(Button) findViewById(R.id.button2);
        button_3=(Button) findViewById(R.id.button);

        if(savedInstanceState !=null){
            punkty = savedInstanceState.getInt("zapisanepunkty");
            punktyTextView.setText(punkty.toString());
        }

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zwieksz(1);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zwieksz(2);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zwieksz(3);
            }
        });
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("zapisanepunkty", punkty);
    }

    private void zwieksz(int i){
        punkty+=i;
        punktyTextView.setText(punkty.toString());
    }
}