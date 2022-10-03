package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		MyUser myUser = new MyUser("Ken");
		String logout = req.getParameter("logout");
		if (logout != null) {
			req.getSession().removeAttribute("myuser");
		}else {
			req.getSession().setAttribute("myuser", myUser);	
		}
		
		
	}
}