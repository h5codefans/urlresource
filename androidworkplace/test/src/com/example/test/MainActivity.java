package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
	private String[] ss=new String[]{
			"重庆",
			"万州",
			"上海",
			"北京",
			"广州",
			"深圳",
			"辽宁",
			"天津",
			"福建",
			"河南",
			"东北",
			"宜昌",
			"珠海",
			"厦门",
			"山西",
			"山东",
			"长沙",
			"湖南",
			"湖北",
			"海口",
			"长寿",
			"杭州",
			"江苏",
			"城口",
			"奉节",
			"忠县"
			
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		ListView listview=(ListView) findViewById(R.id.listView1);
	}
}
