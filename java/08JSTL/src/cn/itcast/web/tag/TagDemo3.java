package cn.itcast.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

//控制标签体执行5次
public class TagDemo3 extends TagSupport {
    int x=5;
	@Override
	public int doStartTag() throws JspException {
		
		return Tag.EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		x--;
		if(x>0){
			return IterationTag.EVAL_BODY_AGAIN;
		}
		return IterationTag.SKIP_BODY;
	}
}
