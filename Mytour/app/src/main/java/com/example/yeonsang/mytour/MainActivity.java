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
            case R.id.namsan://버튼 클릭시에 다른 액티비티가 작동되도록 intent사용
                Intent SubactivityIntent =
                        new Intent(MainActivity.this, SubActivity.class);
                startActivity(SubactivityIntent);
                break;
            case R.id.kyung:
                Intent Subactivity2Intent =
                        new Intent(MainActivity.this, SubActivity2.class);
                startActivity(Subactivity2Intent);
                break;
            case R.id.building:
                Intent Subactivity3Intent =
                        new Intent(MainActivity.this, SubActivity3.class);
                startActivity(Subactivity3Intent);
                break;
        }
    }
}