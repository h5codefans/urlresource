package com.bjsxt.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 求每个班级的总分和平均分，有姓名，班号，成绩等属性
 * @author Administrator
 *
 */
public class MyDemo03 {
     public static void main(String[] args) {
		 List<Student>  list=new ArrayList();
		 exam(list);
		 
		 //统计
		 Map<String, ClassRoom> rooms=new HashMap<String, ClassRoom>();
		 count(rooms,list);
		 
	     //打印
		 printScore(rooms);
		 
	}
	 //打印总分与平均分
     public static void printScore(Map<String, ClassRoom> rooms){
    	 Set<Map.Entry<String, ClassRoom>> entrySet=rooms.entrySet();
    	 Iterator<Map.Entry<String, ClassRoom>> it=entrySet.iterator();
    	 while(it.hasNext()){
    		 Map.Entry<String, ClassRoom> entry=it.next();
    		 ClassRoom room=entry.getValue();
    		 double avg=room.getTotal()/room.getStus().size();
    		 System.out.println("班号为："+room.getNo()+",总分："+room.getTotal()+",平均分："+avg);
    	 }
     }
     
     //统计总分
    public static void count(Map<String, ClassRoom> rooms,List<Student> list){
    	for(Student stu:list){
    		String no=stu.getNo();
    		double score=stu.getScore();
    		//根据班级编号 查看Map是否存在该班级 分拣思路
    		ClassRoom room=rooms.get(no);
    		if(null==room){   //第一次
    			room= new ClassRoom(no);
    			rooms.put(no, room);
    		}
    		
    		//存储总分
    		room.setTotal(room.getTotal()+score);
    		room.getStus().add(stu);   //加入学生
    	}
    }
    
    public static void exam(List<Student> list){
    	list.add(new Student("a","001",80));
    	list.add(new Student("b","001",80));
    	list.add(new Student("c","002",80));
    	list.add(new Student("d","003",80));
    	list.add(new Student("e","003",80));
    }
}
