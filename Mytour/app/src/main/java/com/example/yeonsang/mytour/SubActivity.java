package com.example.yeonsang.mytour;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.net.URI;

public class SubActivity extends Activity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sublayout);
    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.map1:
                Uri uri= Uri.parse("geo:37.551472,126.988426");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
            case R.id.info1:
                String url = "http://www.nseoultower.com";
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse(url));
                startActivity(intent2);
                break;
            case R.id.mainpage:
                Toast.makeText(getApplicationContext(), "남산을 보고 오셨습니다..", Toast.LENGTH_LONG).show();
                finish();
                break;
        }
    }
}