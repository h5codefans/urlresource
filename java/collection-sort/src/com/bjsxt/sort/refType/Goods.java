package com.bjsxt.sort.refType;
/**
 * 实体类
 * @author Administrator
 *
 */
public class Goods {
	//商品名
	private String name;
   //价格
	private double price;
	//收藏量
	private int fav;
	
	public Goods(){
		
	}
	public Goods(String name, double price, int fav) {
		super();
		this.name = name;
		this.price = price;
		this.fav = fav;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getFav() {
		return fav;
	}
	public void setFav(int fav) {
		this.fav = fav;
	}
	
	@Override
	public String toString(){
		return "商品名："+this.name+"，收藏量："+this.fav+"，价格："+this.price+"\n";
	}
}
