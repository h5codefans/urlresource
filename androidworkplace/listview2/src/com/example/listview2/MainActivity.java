package com.example.listview2;

import java.util.ArrayList;
import java.util.List;

import com.bjsxt.po.User;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	private String[] ss=new String[]{
			"北京1",
			"北京2",
			"北京3",
			"北京4"
	};
	
	private List<User> list=new ArrayList<User>();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
//		MyAdapter adapter=new MyAdapter(this, ss);
		ListView listview=(ListView) findViewById(R.id.listView1);
		
		for(int i=0;i<10;i++){
			User user=new User("gao"+i,"123342",33);
			list.add(user);
		}
		//BaseAdapter
		
		listview.setAdapter(new MyAdapter(this, list));
		
		/*
		 * for(int i=0;i<adapter.getCount();i++){
		 *    View view=adapter.getView();
		 *    listview.addView(view);
		 * }

		 */
	}
}
