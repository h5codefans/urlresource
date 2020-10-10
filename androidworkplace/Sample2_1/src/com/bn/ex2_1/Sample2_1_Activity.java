package com.bn.ex2_1;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class Sample2_1_Activity extends Activity {
	private Button sendStaticButton;	//发送自定义静态注册广播的按钮
	private Button sendDynamicButton;	//发送自定义动态注册广播的按钮
	private static final String STATICACTION = "com.bn.pp2.staticreceiver";	//静态广播的Action字符串
	private static final String DYNAMICACTION = "com.bn.pp2.dynamicreceiver";	//动态广播的Action字符串
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		sendStaticButton = (Button) findViewById(R.id.send_static);		//获取Button按钮引用
		sendDynamicButton = (Button) findViewById(R.id.send_dynamic);
		sendStaticButton.setOnClickListener(new DIYOnClickListener());	//为Button按钮添加监听器
		sendDynamicButton.setOnClickListener(new DIYOnClickListener());
	}
	class DIYOnClickListener implements OnClickListener{		//内部类OnClick监听器
		public void onClick(View v) {
			if(v.getId() == R.id.send_static){		// 发送自定义静态注册广播消息
				Intent intent = new Intent();
				intent.setAction(STATICACTION);		//设置Action
				intent.putExtra("msg", "接收静态注册广播成功！");	//添加附加信息
				sendBroadcast(intent);				//发送Intent
			}
			else if(v.getId() == R.id.send_dynamic){	// 发送自定义动态注册广播消息
				Intent intent = new Intent();
				intent.setAction(DYNAMICACTION);		//设置Action
				intent.putExtra("msg", "接收动态注册广播成功！");		//添加附加信息
				sendBroadcast(intent);					//发送Intent
	}}}
	@Override
	protected void onStart() {
		super.onStart();
		IntentFilter dynamic_filter = new IntentFilter();
		dynamic_filter.addAction(DYNAMICACTION);			//添加动态广播的Action
		registerReceiver(dynamicReceiver, dynamic_filter);	// 注册自定义动态广播消息
	}
	
	private BroadcastReceiver dynamicReceiver 				//动态广播的Receiver
	= new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			if(intent.getAction().equals(DYNAMICACTION)){	//动作检测
				String msg = intent.getStringExtra("msg");
				Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
}}};}