package cn.bjstx.string;

/**
 * String：不可变序列
 * 三个作业：
 * 1.练习String类的常用方法
 * 2.结合数组查看源码
 * 3.提高：按照老师的方法将String类中相关方法的源码看一看
 * @author Administrator
 *
 */
public class TestString {
     public static void main(String[] args){
    	 String str=new String("abcd");
    	 String str2=new String("abcd");
    	 System.out.println(str.charAt(2));
    	 System.out.println(str2.equals(str)); //equals比较内容是否相等
    	System.out.println(str2==str);        //false
    	
    	String str3="def";
    	String str4="def";
    	System.out.println(str3.equals(str4));  //true;
    	System.out.println(str3==str4);     //true;
    	
    	System.out.println(str3.indexOf('e'));
    	
    	System.out.println(str3.substring(1));
    	
    	System.out.println(str3.replace('e','*'));
    	
    	
    	String str5="abcde,rrtt,cccee";
    	String[] strArray=str5.split(",");
    	for(int i=0;i<strArray.length;i++){
    		System.out.println(strArray[i]);
    	}
    	
    	String str6=" aa  bb  cc  dd  ";
    	String str66=str6.trim();
    	System.out.println(str66);
    	
    	System.out.println("Abc".equalsIgnoreCase("abc"));
    	System.out.println("Abcbd".indexOf('b'));
    	System.out.println("Abcbd".lastIndexOf('b'));
    	System.out.println("Abcbd".startsWith("Ab"));
    	System.out.println("Abcbd".endsWith("bd"));
    	
    	System.out.println("Abcbd".toLowerCase());
    	System.out.println("Abcbd".toUpperCase());
    	
    	System.out.println("###################");
    	
    	
    	String gh=new String("a");
    	for(int i=0;i<3;i++){
    		gh+=i;
    	}
    	System.out.println(gh);
    	
    	
     }
}
