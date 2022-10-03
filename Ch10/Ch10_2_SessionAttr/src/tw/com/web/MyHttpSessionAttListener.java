package tw.com.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.time.LocalDateTime;
@WebListener
public class MyHttpSessionAttListener  implements HttpSessionAttributeListener{
			@Override
			public void attributeAdded(HttpSessionBindingEvent event) {
				// TODO Auto-generated method stub
				String name = event.getName();
				Object obj =   event.getValue();
				
				if (name.equals("acc")) {
					System.out.println("add:"+name+":"+obj); 
					LocalDateTime now = LocalDateTime.now();
					System.out.println("Login Time:"+now);
				}
			}
			@Override
			public void attributeRemoved(HttpSessionBindingEvent event) {
			// TODO Auto-generated method stub
				String name = event.getName();
				Object obj =   event.getValue();
				System.out.println("Removed:"+name+":"+obj);
				LocalDateTime now = LocalDateTime.now();
				System.out.println("µn¥X®É¶¡:"+now);
			}
			
			@Override
			public void attributeReplaced(HttpSessionBindingEvent event) {
			// TODO Auto-generated method stub
				String name = event.getName();
				Object obj =   event.getValue();
				System.out.println("Replaced:"+name+":"+obj);
			}
}
