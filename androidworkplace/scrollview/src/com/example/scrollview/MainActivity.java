package com.example.scrollview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private int count=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final LinearLayout layout01=(LinearLayout) findViewById(R.id.layout01);
		
		for(;count<30;count++){
			TextView textView=new TextView(this);
			textView.setText("textview"+count);
			textView.setTextSize(30);
			layout01.addView(textView);
		}
		
		//如何知道scrollview滚动到底部？？
		
		ScrollView scrollView=(ScrollView) findViewById(R.id.scrollView1);
		scrollView.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				
				if(event.getAction()==MotionEvent.ACTION_MOVE){
					int scrollY=v.getScrollY();  //scrollview以及向上滚动的长度
					int height=v.getHeight();    //scrollview显示高度。
					
					ScrollView view=(ScrollView)v;
					int linearHeight=view.getChildAt(0).getMeasuredHeight();
					if(scrollY+height==linearHeight){
						Toast.makeText(MainActivity.this, "达到底部", 0).show();
						int max=count+30;
						for(;count<max;count++){
							TextView textView=new TextView(MainActivity.this);
							textView.setText("textview"+count);
							textView.setTextSize(30);
							layout01.addView(textView);
						}
					}
				}
				return false;
			}
		});
	}
}
