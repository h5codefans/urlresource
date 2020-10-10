package com.example.alarmmanage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

public class AlarmTestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		AlarmManager am=(AlarmManager) getSystemService(ALARM_SERVICE);
		
		PendingIntent pi=PendingIntent.getBroadcast(this, 0, new Intent(this, ActionBroadCast.class), Intent.FLAG_ACTIVITY_NEW_TASK);
		long now=System.currentTimeMillis();
		am.setInexactRepeating(AlarmManager.RTC_WAKEUP, now, 3000, pi);
		
	}
}
