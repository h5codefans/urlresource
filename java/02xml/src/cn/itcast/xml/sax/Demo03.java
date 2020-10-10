package cn.itcast.xml.sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class Demo03 {

	/**
	 * sax解析xml文档
	 */
	public static void main(String[] args) throws Exception {
		//1.创建解析工厂
		SAXParserFactory factory=SAXParserFactory.newInstance();
		//2.得到解析器
		SAXParser sp=factory.newSAXParser();
		//3.得到读取器
		XMLReader reader=sp.getXMLReader();
		//4.设置内容处理器
		BeanListHandler handle=new BeanListHandler();
		reader.setContentHandler(handle);
		//5.读取xml文档内容
		reader.parse("src/book.xml");
		

		List<Book> list=handle.getList();
		list.iterator();
		
	}
}
//把每一本书封装到一个book对象，并把book对象
class BeanListHandler extends DefaultHandler{
	private List<Book> list=new ArrayList<Book>();
	public List<Book> getList() {
		return list;
	}

	private String currentTag;
	private Book book;
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		currentTag=qName;
		if("书".equals(currentTag)){
			book=new Book();
		}
	}
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if("书名".equals(currentTag)){
			book.setName(new String(ch,start,length));
		}
		if("作者".equals(currentTag)){
			book.setAuthor(new String(ch,start,length));
		}
		if("售价".equals(currentTag)){
			book.setPrice(new String(ch,start,length));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if(qName.equals("书")){
			list.add(book);
			book=null;
		}
		currentTag=null;//这句有必要
	}	
}
