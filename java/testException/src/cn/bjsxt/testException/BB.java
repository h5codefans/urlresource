package cn.bjsxt.testException;

import java.io.File;
import java.io.FileNotFoundException;

public class BB {
   public static void main(String[] args) {
	   File f = new File("c:/tt.txt");
		if (!f.exists())  {
			try {      //手动抛出异常
				throw new FileNotFoundException("File can't be found!"); 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
   }
}
