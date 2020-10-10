package com.example.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void test1(View view){
//		Toast.makeText(this, "hello toast...", 1).show();
		Toast toast=Toast.makeText(this.getApplicationContext(), "hello toast...", 1);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
		
		//第一个参数activity context/application context(二者的生命周期不同)
		
		
	}
}
