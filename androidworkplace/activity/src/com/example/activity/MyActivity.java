package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.myactivity);
		
		Intent intent=this.getIntent();
		
		String uname=intent.getStringExtra("uname");
		TextView textView=(TextView) findViewById(R.id.textView1);
		textView.setText(uname);
	}
}
