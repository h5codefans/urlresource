package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
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
		
		final ListView listview=(ListView) findViewById(R.id.listView1);
		
		ViewGroup group=(ViewGroup) getLayoutInflater().inflate(R.layout.footer, null);
//		listview.addFooterView(v);
		
		Button button=(Button) group.findViewById(R.id.button1);
		final EditText editText=(EditText) group.findViewById(R.id.editText1);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String indexString=editText.getText().toString();
				listview.setSelection(Integer.valueOf(indexString));
			}
		});
		
		listview.addHeaderView(group);
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ss);
		listview.setAdapter(adapter);
	}
}
