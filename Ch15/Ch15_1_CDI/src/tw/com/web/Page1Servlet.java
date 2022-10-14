package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.beans.MyApple;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	
	@Inject
	@Named("redApple")
	private MyApple myApple;
	
	@Inject
	@Named("QueryApples")
	private List<MyApple> myAppleList;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = 	 resp.getWriter();
		out.println(myApple);
		out.println(myAppleList);
	}
}
