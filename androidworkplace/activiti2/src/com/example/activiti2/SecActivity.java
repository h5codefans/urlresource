package com.example.activiti2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sec_activity);
	}
	
	public void test(View view){
		EditText editText=(EditText) findViewById(R.id.editText1);
		String msg=editText.getText().toString();
		
		Intent intent=getIntent();
		intent.putExtra("msg", msg);
		
		this.setResult(3,intent);
		this.finish();  //销毁当前的activity
	}
}
