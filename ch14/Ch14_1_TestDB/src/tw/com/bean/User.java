package tw.com.bean;

public class User {
	private int id;
	private String account;
	private String password;
	public User(int id,String account,String password) {
		this.id = id;
		this.account = account;
		this.password  = password;
	}
	
	public boolean testPassword(String pass) {
		if (pass!= null && password.equals(pass)) return true;
		
		return false;
	}
	public String toString() {
		return this.id+":"+this.account+":"+this.password;
	}

}
