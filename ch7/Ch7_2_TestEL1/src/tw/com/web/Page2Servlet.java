package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.Item;
import tw.com.beans.User;
@WebServlet("/page2")
public class Page2Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Item item1 = new Item("Item1",100);
		 User user1 = new User("User1",25);
		 req.setAttribute("item1", item1);
		 HttpSession session = req.getSession();
		 session.setAttribute("user1", user1);
		 
		 List<User> arrayList = new ArrayList();
		 arrayList.add(new User("User2",21));
		 arrayList.add(new User("User3",18));
		 arrayList.add(new User("User4",16));
		 arrayList.add(new User("User5",30));
		 session.setAttribute("userList", arrayList);
		 
		 
		 Map<String,User> myUserMap = new HashMap();
		 myUserMap.put("user1", new User("user1",17));
		 myUserMap.put("user2", new User("user2",25));
		 myUserMap.put("@XXX user3", new User("user3",900));
		 session.setAttribute("userMap", myUserMap);
		 
		 
		req.getRequestDispatcher("/page2.jsp").
			forward(req, resp);
	}
}
