package tw.com.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	
	@NamedQuery(name="findMyUser",query="SELECT myUserObj FROM MyUser myUserObj WHERE "+
										"myUserObj.account=:account")		
})

@Entity
public class MyUser {
	@Id
	@GeneratedValue
	private int id;
	
	private String account;
	private String password;
	
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAccount() {
		return this.account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return id+":"+account+":"+password;
	}
	
	
	public boolean equals(Object obj) {
		if (obj == null) return false;
		MyUser myUser = (MyUser)obj;
		
		return this.getAccount().equals(myUser.getAccount()) && 
				this.getPassword().equals(myUser.getPassword());
	}
}
