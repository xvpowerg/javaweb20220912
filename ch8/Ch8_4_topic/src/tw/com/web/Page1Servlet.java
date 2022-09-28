package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.beans.Food;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	private String[] foodsStr = {"","雞腿","排骨","叉燒"};
	private  int[] price = {0,100,80,75};
		@Override
		protected void doPost(HttpServletRequest req, 
				HttpServletResponse resp) throws ServletException, IOException {
			List<Food> foodList = new ArrayList();
			// TODO Auto-generated method stub
			String[] foods = req.getParameterValues("food");
			for (String v : foods) {
				String fCountStr = req.getParameter("fcount"+v);
				fCountStr = fCountStr==null ||
						fCountStr.isEmpty() ?"0":fCountStr;
				int fCount = Integer.parseInt(fCountStr);
				int index = Integer.parseInt(v);
				String food = foodsStr[Integer.parseInt(v)];
				foodList.add(new Food(food,
						price[index],
						fCount));				
				//System.out.println(food+":"+price[index]+":"+fCount);
			}
			req.setAttribute("foodList", foodList);
			req.getRequestDispatcher("/page1.jsp").
			forward(req, resp);
			
			
			
		}
	//顯示選擇的餐點
	//1 雞腿
	//2 排骨
	//總金額
	//如果都沒選 顯示請選擇餐點
	
}
