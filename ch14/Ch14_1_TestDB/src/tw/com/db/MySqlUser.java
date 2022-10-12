package tw.com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tw.com.bean.User;

public class MySqlUser implements UserDao{

	@Override
	public boolean login(String account, String password) {
		// TODO Auto-generated method stub
			User user = this.findUserByAccount(account);
			if (user.testPassword(password)) {
				return true;
			}
		return false;
	}

	@Override
	public boolean regisrter(String account, String password) {
		String sql = "INSERT INTO user_info(account,password) VALUES(?,?)";
			
		try(Connection conn = DbTools.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);){
			stm.setString(1, account);
			stm.setString(2, password);
			int count = stm.executeUpdate();
			return count > 0;
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findUserByAccount(String account) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM user_info WHERE account = ?";
		try(Connection conn = DbTools.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql)	){
			stm.setString(1, account);
			ResultSet result = stm.executeQuery();
			if (result.next()) {
				int id = result.getInt(1);
				String accountStr = result.getString(2);
				String passStr = result.getString(3);
				User user = new User(id,accountStr,passStr);
				return user;
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		
		return null;
	}

}
