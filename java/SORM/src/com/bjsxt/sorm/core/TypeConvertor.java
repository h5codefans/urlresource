package com.bjsxt.sorm.core;

/**
 * 负责java数据类型和数据库数据类型的相互转换
 * @author 余常鑫
 *
 */
public interface TypeConvertor {
   
	/**
	 * 将数据库数据类型转化成java的数据类型
	 * @param columnType  数据库指定的数据类型
	 * @return   java的数据类型
	 */
	public String databaseType2JavaType(String columnType);
    
	/**
	 * 将java数据类型转换成数据库数据类型
	 * @param javaDateType   java数据类型
	 * @return   数据库类型
	 */
	public String javaType2Database(String javaDateType);
}
