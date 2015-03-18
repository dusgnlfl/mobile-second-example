package com.example.yeonsang.mytour;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SubActivity3 extends Activity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sublayout3);
    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.map1:
                Uri uri= Uri.parse("geo:37.519638,126.940178");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
            case R.id.info1:
                String url = "http://www.63.co.kr/home/63CITY/main.do";
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse(url));
                startActivity(intent2);
                break;
            case R.id.mainpage:
                Toast.makeText(getApplicationContext(), "63빌딩을 보고 오셨습니다..", Toast.LENGTH_LONG).show();
                finish();
                break;
        }
    }
}