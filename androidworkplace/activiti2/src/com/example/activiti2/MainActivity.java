package com.example.activiti2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void test(View view){
		Intent intent=new Intent();
		intent.setClass(this, SecActivity.class);
		
		this.startActivityForResult(intent, 1);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		
		String value=data.getStringExtra("msg");
		
		EditText editText=(EditText) findViewById(R.id.editText1);
		editText.setText(value);
	}
}
