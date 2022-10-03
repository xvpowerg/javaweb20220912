package tw.com.web;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.time.LocalDateTime;
public class MyUser implements HttpSessionBindingListener {
	private String name;
	
	public MyUser(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	
	public String toString() {
		return "MyUser:"+name;
	}
	

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName();
		Object obj = event.getValue();
		LocalDateTime now = LocalDateTime.now();
		System.out.println(obj+"�n�J�ɶ�:"+now);
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String name = event.getName();
		Object obj = event.getValue();
		LocalDateTime now = LocalDateTime.now();
		System.out.println(obj+"�n�X�ɶ�:"+now);
	}
	
}
