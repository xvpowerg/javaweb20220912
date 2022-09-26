package tw.com.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/f1/*",
dispatcherTypes = {DispatcherType.FORWARD})
public class Page3Filter implements Filter{

	@Override
	public void doFilter(ServletRequest req, 
			ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter!!");
		resp.setContentType("text/html;charset=utf-8");
		chain.doFilter(req, resp);
	}

}
