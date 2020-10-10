package com.example.listview3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ListView listView=(ListView) findViewById(R.id.listView1);
		/*
		 * data参数：要求输入一个固定个数的数据集合。List<Map<String,Object>>
		 * resource参数：一个layout布局文件的索引
		 * from
		 * to
		 * 
		 */
		List<Map<String,String>> data=new ArrayList<Map<String,String>>();
		for(int i=0;i<10;i++){
			Map<String,String> map=new HashMap<String, String>();
			map.put("name", "gao"+i);
			map.put("phone","1233432");
			map.put("age", "11");
			
			data.add(map);
		}
		
		SimpleAdapter adapter=new SimpleAdapter(
				this, 
				data, 
				R.layout.user, 
				new String[]{"age","phone","name"},
				new int[]{R.id.editText1,R.id.editText2,R.id.editText3}
				);
		listView.setAdapter(adapter);
	}
}
