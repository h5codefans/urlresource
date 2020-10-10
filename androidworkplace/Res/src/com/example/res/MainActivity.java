package com.example.res;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

import android.app.Activity;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
//	public void test(View view){
//		this.getWindow().setBackgroundDrawableResource(R.color.bg_color);
//	}
	
	public void test(View view) throws XmlPullParserException, IOException{
		String text="";
		
		XmlResourceParser xrp=this.getResources().getXml(R.xml.users);
		//sax
		
		while(xrp.getEventType()!=XmlResourceParser.END_DOCUMENT){
			if(xrp.getEventType()==XmlResourceParser.START_TAG){
				
				String tagname=xrp.getName();
				if(tagname.equals("user")){
					String uname=xrp.getAttributeValue(0);
					String phone=xrp.getAttributeValue(1);
					
					text+="ÐÕÃû£º"+uname+";µç»°:"+phone+";\n";
					
				}
			}
			xrp.next();
		}
		
		TextView textView=(TextView) findViewById(R.id.textView1);
		textView.setText(text);
	}
}
