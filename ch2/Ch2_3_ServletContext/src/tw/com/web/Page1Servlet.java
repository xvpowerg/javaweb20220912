package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter  out =   resp.getWriter();
		out.println("page1");
		
		String acc = "qwer";
		String pwd = "123456";
	     ServletContext application = 
	    		 this.getServletContext();
	     application.setAttribute("dbacc", acc);
	     application.setAttribute("dbpwd", pwd);
	}
}
