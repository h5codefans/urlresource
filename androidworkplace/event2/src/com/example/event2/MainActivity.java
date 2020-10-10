package com.example.event2;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button button=(Button)findViewById(R.id.button1);
		
		ViewGroup viewGroup=(ViewGroup) findViewById(R.id.layout01);
		
//		viewGroup.setOnTouchListener(new OnTouchListener() {
//			
//			@Override
//			public boolean onTouch(View v, MotionEvent event) {
//				// TODO Auto-generated method stub
//				int actionType=event.getAction();
//				if(actionType==MotionEvent.ACTION_DOWN){
//					System.out.println("touch 按下..");
//				}else if(actionType==MotionEvent.ACTION_MOVE){
//					System.out.println("touch 移动..");
//					button.setX(event.getX());
//					button.setY(event.getY());
//				}else if(actionType==MotionEvent.ACTION_UP){
//					System.out.println("touch 松开..");
//				}
//				return true;
//			}
//		});
//		button.setOnLongClickListener(new OnLongClickListener() {
//			
//			@Override
//			public boolean onLongClick(View v) {
//				// TODO Auto-generated method stub
//				System.out.println("长按事件。。。");
////				return true;
//				return false;
//			}
//		});
		
		button.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				
				System.out.println(keyCode);
				
				if(keyCode==29){
					button.setX(button.getX()-10);
				}else if(keyCode==32){
					button.setX(button.getX()+10);
				}else if(keyCode==51){
					button.setY(button.getY()-10);
				}else if(keyCode==47){
					button.setY(button.getY()+10);
				}
				return false;
			}
		});
//		button.setOnFocusChangeListener(new OnFocusChangeListener() {
//			
//			@Override
//			public void onFocusChange(View arg0, boolean arg1) {
//				// TODO Auto-generated method stub
//				System.out.println("角度事件。。。");
//			}
//		});
//		button.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//				System.out.println("点击事件。。。。");
//			}
//		});
		
		//元事件：action_down,action_move,anction_up
//		button.setOnTouchListener(new OnTouchListener() {
//			
//			@Override
//			public boolean onTouch(View v, MotionEvent event) {
//				// TODO Auto-generated method stub
//				
//				int actionType=event.getAction();
//				if(actionType==MotionEvent.ACTION_DOWN){
//					System.out.println("touch 按下..");
//				}else if(actionType==MotionEvent.ACTION_MOVE){
//					System.out.println("touch 移动..");
//				}else if(actionType==MotionEvent.ACTION_UP){
//					System.out.println("touch 松开..");
//				}
//				return true;
//			}
//		});
	}
}
