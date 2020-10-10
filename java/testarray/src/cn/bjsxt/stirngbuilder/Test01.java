package cn.bjsxt.stirngbuilder;

/**String：不可变字符序列
 * 测试可变字符序列。StringBuilder（线程不安全，效率高）,StringBuffer(线程安全，效率低)
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args){
		   StringBuilder sb=new StringBuilder();   //字符数组初始长度为16
		   StringBuilder sb1=new StringBuilder(32);   //字符数组初始长度为32
		   StringBuilder sb2=new StringBuilder("abc");   //字符数组初始长度为3+16,value[]={'a','b','c',\u0000,\u0000...}
		   sb2.append("efg");
		   sb2.append(true).append(23).append("随便");  //通过return this实现方法链
		   
		   System.out.println(sb2);
		   
		   StringBuilder gh=new StringBuilder("a");
		   for(int i=0;i<100;i++){
			   gh.append(i);
		   }
		   System.out.println(gh);
	}
}
