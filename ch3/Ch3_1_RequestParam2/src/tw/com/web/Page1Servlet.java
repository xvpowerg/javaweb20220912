package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

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
			  String p = req.getParameter("p");
			  PrintWriter out =   resp.getWriter();
			  int count =  0;
			  if (p != null) {
				  count = Integer.parseInt(p);
			  }
			  out.print("<html>");
			  //out.print("<ul>");
			  out.print("<ol>");
			  for (int i = 1; i <= count;i++) {
				  out.println("<li>");
				  out.println(i);
				  out.println("</li>");
			  }
			  out.print("</ol>");
			  //out.print("</ul>");
			  out.print("</html>");
		}
}
