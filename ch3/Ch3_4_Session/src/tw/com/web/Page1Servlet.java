package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =  resp.getWriter();
		 HttpSession session =   req.getSession();
		 
		int count = 1;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", count);
		}else {
			count = (Integer)session.getAttribute("count");
			count++;
			session.setAttribute("count",count);
		}
		out.println("Page1:"+count);	
	}
}
