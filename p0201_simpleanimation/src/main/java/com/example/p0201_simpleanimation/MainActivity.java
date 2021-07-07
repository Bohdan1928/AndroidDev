package com.example.p0201_simpleanimation;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    final int MENU_MYALPHA = 1;
    final int MENU_MYCOMBO = 2;
    final int MENU_MYROTATE = 3;
    final int MENU_MYSCALE = 4;
    final int MENU_MYTRANS = 5;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()){
            case R.id.tv:
                menu.add(0, MENU_MYALPHA, 0, "Alpha");
                menu.add(0, MENU_MYCOMBO, 0, "Combo");
                menu.add(0, MENU_MYROTATE, 0, "Rotate");
                menu.add(0, MENU_MYSCALE, 0, "Scale");
                menu.add(0, MENU_MYTRANS, 0, "Trans");
                break;
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Animation anim = null;
        switch (item.getItemId()){
            case MENU_MYALPHA:
                anim = AnimationUtils.loadAnimation(this, R.anim.myalpha);
                break;
            case MENU_MYCOMBO:
                anim = AnimationUtils.loadAnimation(this, R.anim.mycombo);
                break;
            case MENU_MYROTATE:
                anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
                break;
            case MENU_MYSCALE:
                anim = AnimationUtils.loadAnimation(this, R.anim.myscale);
                break;
            case MENU_MYTRANS:
                anim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
                break;
        }
        tv.startAnimation(anim);
        return super.onContextItemSelected(item);
    }
}