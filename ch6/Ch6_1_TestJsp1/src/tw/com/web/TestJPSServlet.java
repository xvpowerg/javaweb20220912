package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page2")
public class TestJPSServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		runMethod(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		runMethod(req,resp);
	}
	
	private void runMethod(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String title = req.getParameter("title");
		String count = req.getParameter("count");
	    int counInt = count == null?0:Integer.parseInt(count);
	}
}
