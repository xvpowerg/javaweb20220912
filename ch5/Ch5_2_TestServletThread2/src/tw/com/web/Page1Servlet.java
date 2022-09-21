package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
	private ExecutorService es;
		@Override
		public void init() throws ServletException {
			// TODO Auto-generated method stub
			es = Executors.newCachedThreadPool();
		}
		private void testWork(HttpServletResponse resp) {
			for (int i= 1; i <= 10;i++) {
				System.out.println("i:"+i);
				try {
					Thread.sleep(1000);
					System.out.println(i+"Finish");
					resp.getWriter().println(i+"Finish");
				}catch(Exception ex) {
					
				}
				
			}
		}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		es.execute(()->{testWork(resp);});
	}
}
