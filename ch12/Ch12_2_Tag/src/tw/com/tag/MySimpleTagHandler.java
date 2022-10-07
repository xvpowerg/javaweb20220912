package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MySimpleTagHandler extends SimpleTagSupport{
	private String url = "";
	private boolean showBorder = false;
	private boolean showUrl = false;
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setShowBorder(boolean showBorder) {
		this.showBorder = showBorder;
	}
	public void setShowUrl(boolean showUrl) {
		this.showUrl = showUrl;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		PageContext pageContext = (PageContext)this.getJspContext();
		JspWriter out =   pageContext.getOut();
		
		StringBuffer sb = new StringBuffer();
		if (showUrl) {
			sb.append("<h3>");
			sb.append(url);
			sb.append("</h3>\n");
		}
		sb.append("<img width='200px' height='200px' ");
		if (showBorder) {
			sb.append("border='1'");	
		}
		sb.append("alt='image' src='");
		sb.append(url);
		sb.append("'/>");
		out.println(sb.toString());
	}
}
