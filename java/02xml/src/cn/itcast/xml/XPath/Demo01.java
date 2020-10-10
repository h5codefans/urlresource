package cn.itcast.xml.XPath;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;


public class Demo01 {
	/**
	 * 应用xpath提取xml文档的数据
	 * @author Administrator
	 * @throws Exception 
	 *
	 */
	public static void main(String[] args) throws Exception {
	      SAXReader reader=new SAXReader();
	      Document document=reader.read(new File("src/book.xml"));
	      
	      String value=document.selectSingleNode("//作者").getText();
	      System.out.println(value);
	}
}
