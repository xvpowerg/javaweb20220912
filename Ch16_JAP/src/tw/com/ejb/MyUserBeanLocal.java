package tw.com.ejb;

import javax.ejb.Local;

import tw.com.jpa.MyUser;

@Local
public interface MyUserBeanLocal {
		boolean login(MyUser myUser);
		boolean regisrter(MyUser myUser);
		MyUser findUserByAccount(String account);
		boolean detetUser(MyUser myUser);
		
}
