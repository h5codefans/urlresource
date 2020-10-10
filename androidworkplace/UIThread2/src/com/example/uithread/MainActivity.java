package com.example.uithread;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button button2=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button=(Button) findViewById(R.id.button1);
		
		TranslateAnimation animation=new TranslateAnimation(0, 150, 0, 0);
		animation.setRepeatCount(30);
		animation.setDuration(2000);
		button.setAnimation(animation);
		
	    button2=(Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(final View v) {
				new DownloadImageTask().execute();
			}
		});
		
	}
	
	private class DownloadImageTask extends AsyncTask<String,Void,Integer>{
		protected Integer doInBackground(String... urls){
			
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			int sum=10;
			return sum;
		}
		
		protected void onPostExecute(Integer sum){
			button2.setText(""+sum);
		}
		
	}
}
