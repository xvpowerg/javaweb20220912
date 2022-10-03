package tw.com.web;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletAttrListener  implements ServletRequestAttributeListener {
			@Override
			public void attributeAdded(ServletRequestAttributeEvent srae) {
				// TODO Auto-generated method stub
				String name = srae.getName();
				Object obj =   srae.getValue();
				if (name.equals("acc")) {
					srae.getServletRequest().setAttribute(name,
							obj.toString().toUpperCase());	
				}
				
				System.out.println("add:"+name+":"+obj);				
			}
			
			@Override
			public void attributeRemoved(ServletRequestAttributeEvent srae) {
			// TODO Auto-generated method stub
				String name = srae.getName();
				Object obj = srae.getValue();
				System.out.println("Removed:"+name+":"+obj);
				
			}
			
			@Override
			public void attributeReplaced(ServletRequestAttributeEvent srae) {
			// TODO Auto-generated method stub
				String name = srae.getName();
				Object obj = srae.getValue();
				Object newValue =srae.getServletRequest().getAttribute(name);
				System.out.println("Replaced:"+name+":"+obj+":"+newValue);	
				
				
			}
}
