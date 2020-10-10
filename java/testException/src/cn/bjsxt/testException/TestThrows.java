package cn.bjsxt.testException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestThrows {
   public static void main(String[] args) {
	   String str=null;
	  try {
		str=new TestThrows().openFile();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	  System.out.println(str);
 }
   
   String openFile() throws FileNotFoundException,IOException {
	  FileReader reader=new FileReader("F:/mycode/a.txt");
	  char c=(char)reader.read();
	  return ""+c;
   }
}
