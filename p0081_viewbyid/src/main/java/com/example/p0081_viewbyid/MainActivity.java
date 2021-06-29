package com.example.p0081_viewbyid;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.myText);
        Button btn1 = (Button) findViewById(R.id.btn1);
        CheckBox chb1 = (CheckBox) findViewById(R.id.chb1);

        myTextView.setText("New text in TextView");
        btn1.setText("My button");
        btn1.setEnabled(true);
        chb1.setChecked(false);
    }
}