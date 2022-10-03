package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, 
				HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			HttpSession session =   req.getSession();
			String v = req.getParameter("logout");
			String change = req.getParameter("change");
			if (v != null) {
				session.removeAttribute("acc");	
			}else if(change != null){				
				session.setAttribute("pwd", "09876");								
			}else {
				session.setAttribute("acc", "ken");
				session.setAttribute("pwd", "12345");											
			}
			
		}
}
