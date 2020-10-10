package com.example.spnner;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

	private String[] ss=new String[]{
			"北京",
			"上海",
			"深圳"
	};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Spinner spinner=(Spinner) findViewById(R.id.spinner1);
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,ss);
		spinner.setAdapter(adapter);
		//spinner-->adapter-->数据
	}
	
}
