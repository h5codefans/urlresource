package com.bjsxt.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 自定义文件系统类加载器
 * @author Administrator
 *
 */
public class FileSystemClassLoader extends ClassLoader {
      //com.bjsxt.test.User   -->f/myjava/          com/bjsxt/test/User.class
	  private String rootDir;
	  
	  public FileSystemClassLoader(String rootDir){
		  this.rootDir=rootDir;
	  }
	  
	  @Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
          Class<?> c=findLoadedClass(name);
          
          
          if(c!=null){
        	  return c;
          }else {
			ClassLoader parent=this.getParent();
			try {
				c = parent.loadClass(name); //委托给父类加载
			} catch (Exception e) {
				//e.printStackTrace();
			}
			if(c!=null){
				return c;
			}else{
				byte[] classData=getClassData(name);
				if(classData==null){
					throw new ClassNotFoundException();
				}else{
					c=defineClass(name, classData, 0,classData.length);
				}
			}
		}
          return c;
	}
	  private byte[] getClassData(String classname){
		  String path=rootDir+"/"+classname.replace(".","/")+".class";
		  InputStream is=null;
		  ByteArrayOutputStream baos=new ByteArrayOutputStream();
		  try {
			 is = new FileInputStream(path);
			
			 byte[] buffer=new byte[1024];
			 int temp=0;
			 while(-1!=(temp=is.read(buffer))){
				 baos.write(buffer,0,temp);
				 
			 }
			 return baos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			try {
				if (baos != null) {
					baos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	  }
}
