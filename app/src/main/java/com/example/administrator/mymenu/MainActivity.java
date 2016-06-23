package com.example.administrator.mymenu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {
    private MainUI   mainUI;
    private Fragment leftMenu, rightMenu, mainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainUI = new MainUI(MainActivity.this);
        setContentView(mainUI);
        leftMenu = new LeftMenu();
        rightMenu = new RightMenu();
        mainMenu = new MainMenu();
        getSupportFragmentManager().beginTransaction().add(MainUI.MIDEELE_ID, mainMenu).commit();
        getSupportFragmentManager().beginTransaction().replace(MainUI.LEFT_ID, leftMenu).commit();
        getSupportFragmentManager().beginTransaction().replace(MainUI.RIGHT_ID, rightMenu).commit();

    }
}
