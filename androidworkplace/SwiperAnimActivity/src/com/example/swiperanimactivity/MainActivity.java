package com.example.swiperanimactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);   
	         
	        Button button = (Button)findViewById(R.id.button1);
	        button.setOnClickListener(new View.OnClickListener() {  
	            @Override
	            public void onClick(View v) {
	                Intent intent = new Intent();
	                intent.setClass(MainActivity.this, SlideSecondActivity.class);
	                System.out.println(intent.getType());
	                startActivity(intent);
	                //设置切换动画，从右边进入，左边退出
	                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);                
	            }
	        });
	    }
}
