package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class MsgHelloTag extends TagSupport{
	private String message;
	//<xxx>body</xxx> body執行之後
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("doAfterBody");
		return super.doAfterBody();
	}
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
			 PageContext pageContext =  this.pageContext;
			 JspWriter out =   pageContext.getOut();
			 String msg = String.format("<font size='6' color='red'>%s 你好!!</font>",getMessage());
			 try {
				out.println(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			 
		return EVAL_PAGE;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
