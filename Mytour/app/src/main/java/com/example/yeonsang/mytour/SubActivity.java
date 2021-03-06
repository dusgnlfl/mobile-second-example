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
            case R.id.map1: //intent기능으로 구글지도를 사용하여 원하는 위치에 지도를 띄운다.
                Uri uri= Uri.parse("geo:37.551472,126.988426");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;
            case R.id.info1: //웹페이지가 새롭게 뜨는 기능을 사용한 코드
                String url = "http://www.nseoultower.com";
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse(url));
                startActivity(intent2);
                break;
            case R.id.mainpage: //어느 곳을 봤는지 toast메세지를 띄우고 전 페이지로 돌아간다.
                Toast.makeText(getApplicationContext(), "남산을 보고 오셨습니다..", Toast.LENGTH_LONG).show();
                finish();
                break;
        }
    }
}