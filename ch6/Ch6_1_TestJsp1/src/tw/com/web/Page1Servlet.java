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
		PrintWriter out = resp.getWriter();
		String title = req.getParameter("title");
		String count = req.getParameter("count");
		int countInt =  5;
		//¹w³]¶]5¦¸
		if (count != null) {
			try {
				countInt = Integer.parseInt(count);	
			}catch(Exception ex) {}				
		}
		
		
		out.print("<html>");
		out.print("<head>");
			out.print("<title>");
			out.print(title);
			out.print("</title>");
		out.print("</head>");
		
		out.print("<body>");
		out.println("<div>A</div>");
		out.println("B<br>");
		out.println("C");
		out.println("<ol>");
		char c1 = 'A';
		
		for (int i = 1;i <= countInt;i++) {
			out.print("<li>");
			out.print(c1++);
			out.print("</li>");
		}
		out.println("</ol>");
		out.print("</body>");
		out.print("</html>");
		
		}
}
