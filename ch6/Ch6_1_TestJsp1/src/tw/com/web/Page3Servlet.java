package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.Item;
import tw.com.beans.Product;
@WebServlet("/page3")
public class Page3Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			ServletContext app = req.getServletContext();
			app.setAttribute("appValue", "AppValue!");
			HashSet<Product> set = new HashSet();
			Product p1 = new Product("A",100);
			Product p2 = new Product("B",200);
			Product p3 = new Product("C",300);
			set.add(p1);
			set.add(p2);
			set.add(p3);
			app.setAttribute("pSet", set);
			
			HttpSession  session=  req.getSession();
			ArrayList<Item> list = new ArrayList<>();
			Item it1 = new Item(1,"Item1");
			Item it2 = new Item(2,"Item2");
			Item it3 = new Item(3,"Item3");
			Item it4 = new Item(4,"Item4");
			Item it5 = new Item(5,"Item5");
			list.add(it1);
			list.add(it2);
			list.add(it3);
			list.add(it4);
			list.add(it5);
			session.setAttribute("itemList", list);
			
			req.setAttribute("reqAtte","MyReqAttr");			
			req.getRequestDispatcher("page3.jsp").
			forward(req, resp);
			
		}
}
