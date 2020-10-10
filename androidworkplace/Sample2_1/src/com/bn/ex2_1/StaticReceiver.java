package com.bn.ex2_1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
public class StaticReceiver extends BroadcastReceiver {
	@Override		//静态广播接收器执行的方法
	public void onReceive(Context context, Intent intent) {
		String msg = intent.getStringExtra("msg");
		Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
}}