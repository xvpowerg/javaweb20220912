package tw.com.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.tools.ImageTools;
@WebServlet("/view_images")
public class ViewImageServlet  extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
				List<String> fileNameList =  ImageTools.getImageFileNames();
				req.setAttribute("imageList", fileNameList);
				req.getRequestDispatcher("/view_images.jsp").forward(req, resp);
		}
		
}
