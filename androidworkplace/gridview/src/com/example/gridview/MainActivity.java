package com.example.gridview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		GridView gridView=(GridView) findViewById(R.id.gridView1);
		
		int[] images=new int[]{
				R.drawable.a1,
				R.drawable.a2,
				R.drawable.a3,
				R.drawable.a1,
				R.drawable.a2,
				R.drawable.a3,
				R.drawable.a1,
				R.drawable.a2,
				R.drawable.a3,
				R.drawable.a1,
				R.drawable.a2,
				R.drawable.a3,
				R.drawable.a1,
				R.drawable.a2,
				R.drawable.a3,
				R.drawable.a1,
				R.drawable.a2,
				R.drawable.a3,
				R.drawable.a1,
				R.drawable.a2,
				R.drawable.a3,
				R.drawable.a1,
				R.drawable.a2,
				R.drawable.a3,
		};
		
		final String[] bookNames=new String[]{
				"java",
				"struct2",
				"spring",
				"java",
				"struct2",
				"spring",
				"java",
				"struct2",
				"spring",
				"java",
				"struct2",
				"spring",
				"java",
				"struct2",
				"spring",
				"java",
				"struct2",
				"spring",
				"java",
				"struct2",
				"spring",
				"java",
				"struct2",
				"spring"
		};
		gridView.setAdapter(new MyAdapter(images, bookNames,this));
		
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				
				Toast.makeText(MainActivity.this, "ƒ˙—°‘Ò¡À"+bookNames[position], 0).show();
			}
		});
	}
	
	private class MyAdapter extends BaseAdapter{

		private int[] images;
		private Context context;
		private String[] ss;
		
		public MyAdapter() {
			// TODO Auto-generated constructor stub
		}
		
		public MyAdapter(int[] images, String[] ss,Context context) {
			super();
			this.images = images;
			this.context = context;
			this.ss=ss;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return images.length;
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

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			int resId=images[position];
			String bookName=ss[position];

			ViewGroup group=(ViewGroup) getLayoutInflater().inflate(R.layout.book_item, null);
			ImageView imageView=(ImageView) group.findViewById(R.id.imageView1);
			imageView.setImageResource(resId);
			
			TextView textView=(TextView) group.findViewById(R.id.textView1);
			textView.setText(bookName);
			
			return group;
		}
		
	}
}
