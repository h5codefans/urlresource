package com.bjsxt.io.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件夹的拷贝
 * 1.文件复制  copyFile
 * 2.文件创建  mkdirs()
 * 3.递归查找子孙级
 * @author Administrator
 *
 */
public class CopyDir {
    public static void main(String[] args){
    	//源目录
    	String srcPath="F:/mycode/7";
    	//目标目录
    	String destPath="F:/mycode/parent";
    	File dest=new File(destPath);
    	File src=new File(srcPath);
        copyDir(src,dest);
    }
    /**
     * 拷贝文件夹
     * @param src 源File对象
     * @param dest 目标File对象
     */
    public static void copyDir(File src,File dest){
    	if(src.isDirectory()){  //文件夹
    	    dest=new File(dest,src.getName());	
    	    if(dest.getAbsolutePath().contains(src.getAbsolutePath())){
    	    	System.out.println("父目录不能拷贝到子目录中");
    	    	return ;
    	    }
    	}
    	copyDirDetail(src,dest);
    }
    /**
     * 拷贝文件夹细节
     * @param src
     * @param dest
     */
    public static void copyDirDetail(File src,File dest){
    	if(src.isFile()){  //文件
    	    try {
				FileUtil.copyFile(src,dest);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}else if(src.isDirectory()){   //文件夹
			//确保目标文件夹存在
			dest.mkdirs();
			//获取下一级目录|文件
			for(File sub:src.listFiles()){
				copyDirDetail(sub,new File(dest,sub.getName()));
			}
			
		}
    }
}
