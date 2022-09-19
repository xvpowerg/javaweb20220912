package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
	private String[] names = {"","Java","Golang","Cpp"};
	private HashMap<String,String> map = new HashMap<>();
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		map.put("1", "Java");
		map.put("2", "Golang");
		map.put("3", "Cpp");
		
	}
		@Override
		protected void doGet(HttpServletRequest req, 
				HttpServletResponse resp) throws ServletException, IOException {
		//	String skill = req.getParameter("skill");
			//System.out.println(skill);
			PrintWriter out =   resp.getWriter();
			String[] skills = req.getParameterValues("skill");
			if (skills == null) {
				out.println("Empty");
				return;
			}
			//沒有勾選顯示Empty
			for (String s : skills) {
				out.println(map.get(s));
			}
//			for (String s : skills) {
//				int index = Integer.parseInt(s);
//				out.println(names[index]);
//				System.out.println(names[index]);
//			}
		}
}
