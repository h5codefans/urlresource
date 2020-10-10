package cn.itcast.web.simpletag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo5 extends SimpleTagSupport {

	private int count;
    private Date date;
    
    
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		
		JspFragment jf=this.getJspBody();
		this.getJspContext().getOut().write(date.toLocaleString()+"<br/>");
		for(int i=0;i<count;i++){
			jf.invoke(null);
		}
	}
}
