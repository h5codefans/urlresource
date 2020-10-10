package com.example.notification;

import android.animation.AnimatorSet.Builder;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void test(View view){
		NotificationManager manager=(NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
//		manager.notify(id, notification);   发送通知
//		manager.cancel(id);   取消通知
		
		android.app.Notification.Builder mBuilder=new Notification.Builder(this);
		mBuilder.setSmallIcon(R.drawable.ic_launcher);
		mBuilder.setContentTitle("My notification");
		mBuilder.setContentText("Hello World");
		mBuilder.setTicker("消息来了。。");
				
		manager.notify(1, mBuilder.getNotification());						
		
			
	}
}
