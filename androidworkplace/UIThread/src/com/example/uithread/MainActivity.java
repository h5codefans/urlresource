package com.example.uithread;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button=(Button) findViewById(R.id.button1);
		
		TranslateAnimation animation=new TranslateAnimation(0, 150, 0, 0);
		animation.setRepeatCount(30);
		animation.setDuration(2000);
		button.setAnimation(animation);
		
		Button button2=(Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(final View v) {
				new Thread(new Runnable(){
					@Override
					public void run() {
						// TODO Auto-generated method stub
						try {
							// TODO Auto-generated method stub
							Thread.sleep(5000);
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						int sum=0;
						v.post(new Runnable(){  //方法一：在线程中更改ui组件post
							@Override
							public void run() {
								// TODO Auto-generated method stub
								TextView view=(TextView) v;
								view.setText(""+10);
							}
						});
						
					}
				}).start();
			}
		});
		
		
	}
}
