package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String acc = req.getParameter("acc");
		String pwd =  req.getParameter("pwd");
		PrintWriter out =   resp.getWriter();
		if (acc.equals("qwer") && pwd.equals("12345")) {
			out.println("Pass");
		}else {
			out.println("Fail");
		}
	}
}
