package com.bjsxt.sort.refType;

import java.util.Comparator;

/**
 * 按价格排序的业务类(降序)
 * @author Administrator
 *
 */
public class GoodsPriceComp implements Comparator<Goods>{
   
	@Override
	public int compare(Goods o1,Goods o2){
		return -(o1.getPrice()-o2.getPrice()>0?1:(o1.getPrice()==o2.getPrice())?0:-1);
	}
}
