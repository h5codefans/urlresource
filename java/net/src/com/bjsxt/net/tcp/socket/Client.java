package com.bjsxt.net.tcp.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 必须先启动服务器后连接客户端
 * 1.创建客服端   必须指定服务器端+端口  此时就在连接
 * Sokect(String host,int port)
 * @author Administrator
 *2.接收数据+发送数据
 */
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.创建客服端   必须指定服务器端+端口  此时就在连接
		Socket client=new Socket("localhost",9999);
        //2.接收数据
		/*
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		String echo=br.readLine();    //阻塞式方法
		System.out.println(echo);
		*/
		DataInputStream dis=new DataInputStream(client.getInputStream());
		String echo=dis.readUTF();
		System.out.println(echo);
	}

}
