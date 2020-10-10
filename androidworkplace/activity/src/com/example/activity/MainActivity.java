package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * 1.继承Activity类
 * 2.重新onCreate
 * 3.在核心配置文件AndroidManifest.xml当中
 * Application节点下，配置activity的信息。
 *         <activity
            android:name=".MainActivity"
            android:label="@string/app_name" >
        </activity>
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void test(View view){
		
		EditText editText=(EditText) findViewById(R.id.editText1);
		String uname=editText.getText().toString();
		
		Intent intent=new Intent();
		intent.setClass(this, MyActivity.class);
		
		intent.putExtra("uname", uname);
		
		this.startActivity(intent);
	}
}
