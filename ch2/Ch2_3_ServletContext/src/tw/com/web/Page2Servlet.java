package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page2")
public class Page2Servlet  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("Page2");
		ServletContext application =   this.getServletContext();
		String dbacc = application.getAttribute("dbacc").toString();
		String dbpwd = application.getAttribute("dbpwd").toString();
		
		out.print(dbacc+":"+dbpwd);
	}
}
