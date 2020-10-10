package cn.bjsxt.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo04 {
    public static void main(String[] args){
    	//1.建立联系
    	File src=new File("F:/mycode/a.txt");
    	File dest=new File("F:/mycode/f.txt");
    	
    	BufferedReader rd=null;
    	BufferedWriter wr=null;
    	
    	try {
			rd = new BufferedReader(new FileReader(src));
			wr = new BufferedWriter(new FileWriter(dest,true));
			
			String pp=null;
			while(null!=(pp=rd.readLine())){
				wr.write(pp);
				wr.newLine();
			}
			wr.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(wr!=null){
				try {
					wr.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if(rd!=null){
				try {
					rd.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
    }
}
