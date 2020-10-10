package com.example.alarmmanage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ActionBroadCast extends BroadcastReceiver {

	private static int num=0;
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		Log.e("ActionBroadCast", "New Message!"+num++);
	}

}
