package tw.com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import tw.com.db.DbTools;

@WebListener
public class MyDbInitListener implements ServletContextListener{
		@Override
		public void contextInitialized(ServletContextEvent sce) {
			
		ServletContext context = sce.getServletContext();
		String url = context.getInitParameter("db_url");
		String account = context.getInitParameter("db_account");
		String password = context.getInitParameter("db_password");
			DbTools.setUrl(url);
			DbTools.setAccount(account);
			DbTools.setPassword(password);
		}
}
