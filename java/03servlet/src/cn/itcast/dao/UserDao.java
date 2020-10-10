package cn.itcast.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


//如果读取资源文件的程序不是servlet的话，就只能通过类转载器去读了
public class UserDao {
/*    private static Properties dbconfig=new Properties();
	static{
		try {
			InputStream in = UserDao.class.getClassLoader().getResourceAsStream("db.properties");
			dbconfig.load(in);
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}*/
	public void update() throws IOException{
/*		
        //以上代码虽然可以读取资源文件的数据，但是无法读取更新后的数据
        Properties dbconfig=new Properties();
		InputStream in = UserDao.class.getClassLoader().getResourceAsStream("db.properties");
		dbconfig.load(in);
	    System.out.println(dbconfig.getProperty("url"));*/
		
		
		//通过类装载的方式读取资源文件的位置，再通过传统的方式读取资源文件的数据，这样可以读取更新后的数据
		String path=UserDao.class.getClassLoader().getResource("db.properties").getPath();
		FileInputStream in=new FileInputStream(path);
		Properties dbconfig=new Properties();
		dbconfig.load(in);
	    System.out.println(dbconfig.getProperty("url"));
	}
}
