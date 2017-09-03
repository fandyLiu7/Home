package com.home.fandy.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * 测试来玩
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //手机语言获取
        String country = getResources().getConfiguration().locale.getCountry();
        Log.d("语言环境", "onCreate: " + country);
        if (country.equals("US")){
            Toast.makeText(MainActivity.this, "英语环境", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "中文环境", Toast.LENGTH_SHORT).show();
        }
    }
}
