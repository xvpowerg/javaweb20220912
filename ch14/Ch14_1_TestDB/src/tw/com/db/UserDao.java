package tw.com.db;

import tw.com.bean.User;

public interface UserDao {
	
	boolean login(String account,String password);
	boolean regisrter(String account,String password);
	User findUserByAccount(String account);

}
