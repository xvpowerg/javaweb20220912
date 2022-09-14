package tw.com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyDBContextListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("DB init");
		ServletContext app =   sce.getServletContext();
		app.setAttribute("dbacc", "qwer");
		app.setAttribute("dbpwd", "12345");
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("DB Destroyed");
		ServletContext app =   sce.getServletContext();
		app.removeAttribute("dbacc");
		app.removeAttribute("dbpwd");
	}
}
