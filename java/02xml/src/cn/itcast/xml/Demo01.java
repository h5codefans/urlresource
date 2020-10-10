package cn.itcast.xml;

/**
 * 调整jvm内存大小
 * 默认64M，改为90M
 * 右键->Run configurations->arguments->在VM arguments中写  -Xmx90m
 * @author Administrator
 *
 */
public class Demo01 {

	//默认64M
	public static void main(String[] args) {
		
       byte b[]=new byte[1024*1024*55];
	}

}
