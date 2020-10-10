package com.bjsxt.sorm.bean;

/**
 * 管理配置信息
 * @author Administrator
 *
 */
public class Configuration {
	/**
	 * 驱动类
	 */
	private String driver;    
	/**
	 * 扫描生成的java类的包（po的意思：Persisitence object）
	 */
	private String poPackage;
	/**
	 * 数据库的密码
	 */
	private String pwd;
	/**
	 * 项目的源码路径
	 */
	private String srcPath;
	/**
	 * jdbc的url
	 */
	private String url;
	/**
	 * 数据库的用户名
	 */
	private String user;
	/**
	 * 正在使用的数据库
	 */
	private String usingDB;

	public Configuration() {
		
	}

	public Configuration(String driver, String poPackage, String pwd,
			String srcPath, String url, String user, String usingDB) {
		this.driver = driver;
		this.poPackage = poPackage;
		this.pwd = pwd;
		this.srcPath = srcPath;
		this.url = url;
		this.user = user;
		this.usingDB = usingDB;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getPoPackage() {
		return poPackage;
	}

	public void setPoPackage(String poPackage) {
		this.poPackage = poPackage;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSrcPath() {
		return srcPath;
	}

	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUsingDB() {
		return usingDB;
	}

	public void setUsingDB(String usingDB) {
		this.usingDB = usingDB;
	}
	
	
}
