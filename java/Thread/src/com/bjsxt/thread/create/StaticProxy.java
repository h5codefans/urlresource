package com.bjsxt.thread.create;
/**
 * 静态代理设计模式
 * 1.真实角色
 * 2.代理角色:持有真实角色的引用
 * 3.二者实现相同的接口
 * @author Administrator
 *
 */
public class StaticProxy {
   public static void main(String[] args){
	   //创建真实角色
	   You you=new You();
	   //创建代理角色+真实角色的引用
	  WeddingCompany company=new WeddingCompany(you);
	  company.marry();
   }
}
//接口
interface Marry{
	public abstract void marry();
}
//真实角色
class You implements Marry{
	public void marry(){
		System.out.println("you and 嫦娥结婚了");
	}
}
//代理角色
class WeddingCompany implements Marry{
	private Marry you;
	public WeddingCompany() {

	}
	public WeddingCompany(Marry you) {
		this.you = you;
	}
	private void before(){
		System.out.println("布置猪窝...");
	}
	public void after(){
		System.out.println("闹玉兔...");
	}
	public void marry(){
		before();
		you.marry();
		after();
	}
}
