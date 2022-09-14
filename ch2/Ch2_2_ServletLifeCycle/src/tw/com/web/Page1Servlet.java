package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	private int[] values = new int[1000];
		//只會執行一次 Page1Servlet 建立之後
		@Override
		public void init() throws ServletException {
			System.out.println("page1 init!!");
			Random r = new Random();
			for (int i = 0; i < values.length;i++) {
				values[i] = r.nextInt();
			}
		}

		@Override
		protected void doGet(HttpServletRequest req,
				HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out = 
					resp.getWriter();
			out.println("Page1:"+values[1]);
		}
}
