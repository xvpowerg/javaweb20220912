package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class MyBodyTagSupportHandler extends BodyTagSupport {
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		
		try{
			BodyContent bcont = this.getBodyContent();
			String body = bcont.getString();
			JspWriter out =  bcont.getEnclosingWriter();
			if (body != null) {
				out.print(body.toUpperCase());
			}
		}catch(IOException ex) {
			throw new JspException("Error:"+ex.getMessage());
		}
		return SKIP_BODY;
	}
}
