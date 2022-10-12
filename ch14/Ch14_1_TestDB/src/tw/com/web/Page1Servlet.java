package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.User;
import tw.com.db.MySqlUser;
import tw.com.db.UserDao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter  out = 	 resp.getWriter();
			out.println("page1");
			UserDao  userDao = new MySqlUser();
			//boolean b1 = userDao.regisrter("Ken", "12345");
//			User user =   userDao.findUserByAccount("Ken");
//			System.out.println(user);
			boolean b1 = userDao.login("ken", "12345");
			System.out.println(b1);
			
		}
}
