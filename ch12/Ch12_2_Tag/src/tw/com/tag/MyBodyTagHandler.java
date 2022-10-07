package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

public class MyBodyTagHandler implements BodyTag {
	private PageContext pageContext;
	private int counter =  1;

	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		if (counter >3) {
			return EVAL_PAGE;
		}else {
			counter++;
			return EVAL_BODY_AGAIN;
		}
		
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter writer =   this.pageContext.getOut();
		try {
			writer.print("<h1>結束標籤</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter writer = this.pageContext.getOut();
		try {
			writer.print("<h1>開始</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.EVAL_BODY_INCLUDE;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPageContext(PageContext pc) {
		// TODO Auto-generated method stub
		this.pageContext = pc;
	}

	@Override
	public void setParent(Tag t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doInitBody() throws JspException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBodyContent(BodyContent arg0) {
		// TODO Auto-generated method stub
		
	}

}
