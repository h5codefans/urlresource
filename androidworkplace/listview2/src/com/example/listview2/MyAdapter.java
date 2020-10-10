package com.example.listview2;

import java.util.List;

import com.bjsxt.po.User;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

	private Context context;
	
	private List<User> list;

	

	public MyAdapter(Context context, List<User> list) {
		super();
		this.context = context;
		this.list = list;
	}

	//getCount方法获取数据的个数
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	//getView 需要构建一个view对象，来展示数据源当中的信息。
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		User user=list.get(position);
		LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		
		ViewGroup group=(ViewGroup) inflater.inflate(R.layout.user, null);
		TextView textView1=(TextView) group.findViewById(R.id.editText1);
		textView1.setText(user.getName());
		TextView textView2=(TextView) group.findViewById(R.id.editText2);
		textView2.setText(user.getPhone());
		TextView textView3=(TextView) group.findViewById(R.id.editText3);
		textView3.setText(String.valueOf(user.getAge()));
		
		return group;
	}
	
	
}
