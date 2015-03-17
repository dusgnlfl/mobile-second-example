package com.example.yeonsang.mytour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.namsan:
                Intent SubactivityIntent =
                        new Intent(MainActivity.this, SubActivity.class);
                startActivity(SubactivityIntent);
                break;
        }
    }
}