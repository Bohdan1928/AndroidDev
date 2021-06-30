package com.example.p0102_activitylistener;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOK;
    Button btnCancel;
    TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnOK = (Button) findViewById(R.id.btnOk);

        btnOK.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                tvOut.setText("Clicked OK");
                break;
            case R.id.btnCancel:
                tvOut.setText("Clicked Cancel");
                break;
        }
    }
}