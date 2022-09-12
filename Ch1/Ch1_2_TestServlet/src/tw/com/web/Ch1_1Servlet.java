package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.io.IOException;
@WebServlet("/page1")
public class Ch1_1Servlet extends HttpServlet  {
	public void doGet(HttpServletRequest req,
			HttpServletResponse respon)throws IOException {
		PrintWriter out  = respon.getWriter();
		out.print("Page1");
		
	}
}
