package cn.itcast.web.tag.example;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class WhenTag extends SimpleTagSupport {

	private boolean test;

	public void setTest(boolean test) {
		this.test = test;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
	     ChooseTag parentChooseTag=(ChooseTag) this.getParent();
	     if(test&&!parentChooseTag.isDo()){
	    	 this.getJspBody().invoke(null);
	    	 parentChooseTag.setDo(true);
	     }
	}
}
