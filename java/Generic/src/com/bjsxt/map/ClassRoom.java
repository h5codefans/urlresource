package com.bjsxt.map;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String no;
    private List<Student> stus;  //学生列表
    private double total;    //总分
    
    public ClassRoom(){
    	stus=new ArrayList<Student>();
    }
	public ClassRoom(String no) {
		this();
		this.no = no;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public List<Student> getStus() {
		return stus;
	}

	public void setStus(List<Student> stus) {
		this.stus = stus;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
    
	
    
    
}
