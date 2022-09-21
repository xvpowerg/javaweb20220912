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
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out =   resp.getWriter();
		out.println(this.hashCode());		
		//out.println("name:"+Thread.currentThread().getName());
		System.out.println("name:"+Thread.currentThread().getName());
		
		Thread th1 = new Thread(()->{
			try {
				Thread.sleep(2000);
				System.out.println("งนฆจ!!");
				out.println("Finish");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		}) ;
		th1.start();
		
	}
}
