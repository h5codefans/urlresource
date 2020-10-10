package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.VariableElement;

public class MyArrayList {
	

	public static void main(String[] args){
		
		Car car=new Car("bm");
		Car car2=new Car("bc");
		Car car3=new Car("ad");
		
		List<Car> list=new ArrayList<Car>();
		
		list.add(car);
		list.add(car2);
		list.add(car3);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName());
		}
		
		
	}
}
