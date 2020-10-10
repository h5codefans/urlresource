package cn.bjsxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
   public static void main(String[] args){
	   DateFormat df=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss,属于本年的第几w周");
	   
	   Date d=new Date(1566543161276L);
	   String str=df.format(d);  //将时间对象按照格式化字符串，转化为字符串
	   System.out.println(str);
	   
	   System.out.println("############################");
	   String str2="1977-7-7";
	   DateFormat df2=new SimpleDateFormat("yyyy-mm-dd");
	   try{
		   Date d2=df2.parse(str2);
		   System.out.println(d2);
	   }catch(ParseException e){
		   e.printStackTrace();
	   }
	   
   }
}
