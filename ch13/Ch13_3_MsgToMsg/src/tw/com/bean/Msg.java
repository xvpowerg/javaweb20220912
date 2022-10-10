package tw.com.bean;

public class Msg {
	private String msg;
	private String fromUser;
	private String toUser;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getFromUser() {
		return this.fromUser;
	}
	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}
	
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}

	public String toString() {
		return msg+":"+fromUser+":"+toUser;
	}
}
