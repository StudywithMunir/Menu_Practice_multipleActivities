package com.example.menu_practice_multipleactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class activity_2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Thread timer = new Thread(){

            public void run(){
                try {
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent MenuAct= new Intent("com.example.menu_practice_multipleactivities.Menu");
                    startActivity(MenuAct);
                }
            }

        };
        timer.start();



    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
