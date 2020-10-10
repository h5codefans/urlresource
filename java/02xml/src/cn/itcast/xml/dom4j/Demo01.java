package cn.itcast.xml.dom4j;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;


public class Demo01 {
	
	//读取xml文档第二本书的：<书名>javascript网页开发</书名>
    @Test
	public void read() throws Exception{
		
      SAXReader reader=new SAXReader();
      Document document=reader.read(new File("src/book.xml"));
      
      Element root=document.getRootElement();
      Element book=(Element) root.elements("书").get(1);
      String value=book.element("书名").getText();
      System.out.println(value);
	}
    

    
    //在第一本书添加一个新的售价
    @Test
    public void add() throws Exception{
    	SAXReader reader=new SAXReader();
    	Document document=reader.read(new File("src/book.xml"));
    	
    	Element book=document.getRootElement().element("书");
        book.addElement("售价").setText("209.00元");
        
        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        
        
        XMLWriter writer=new XMLWriter(new FileOutputStream("src/book.xml"),format);
        writer.write(document);
        writer.close();
        
    }
    
	//读取xml文档第二本书的属性：<书名 name="xxx">javascript网页开发</书名>
    @Test
	public void readAttr() throws Exception{
		
      SAXReader reader=new SAXReader();
      Document document=reader.read(new File("src/book.xml"));
      
      Element root=document.getRootElement();
      Element book=(Element) root.elements("书").get(1);
      String value=book.element("书名").attributeValue("name");
      System.out.println(value);
	}
    
    //在第一本书指定位置添加一个新的售价                更改保存了所有孩子的list集合顺序
    @Test
    public void add2() throws Exception{
    	SAXReader reader=new SAXReader();
    	Document document=reader.read(new File("src/book.xml"));
    	
    	Element book=document.getRootElement().element("书");
        List list=book.elements();  //[书名，作者，售价，售价]
        
        Element price=DocumentHelper.createElement("售价");
        price.setText("309.00元");
        
        list.add(2, price);
        
        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        
        
        XMLWriter writer=new XMLWriter(new FileOutputStream("src/book.xml"),format);
        writer.write(document);
        writer.close();
    }
    
    //删除上面添加的售价节点
    @Test
    public void delete() throws Exception{
    	SAXReader reader=new SAXReader();
    	Document document=reader.read(new File("src/book.xml"));
    	
    	Element price=document.getRootElement().element("书").element("售价");
        price.getParent().remove(price);
        
        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        
        
        XMLWriter writer=new XMLWriter(new FileOutputStream("src/book.xml"),format);
        writer.write(document);
        writer.close();
    }
    
    @Test
    public void update() throws Exception{
    	SAXReader reader=new SAXReader();
    	Document document=reader.read(new File("src/book.xml"));
    	
    	Element book=(Element) document.getRootElement().elements("书").get(1);
    	book.element("作者").setText("黎活明");
    	
        OutputFormat format=OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        
        
        XMLWriter writer=new XMLWriter(new FileOutputStream("src/book.xml"),format);
        writer.write(document);
        writer.close();
    }
}
