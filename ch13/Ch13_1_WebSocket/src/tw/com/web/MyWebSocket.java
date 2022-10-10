package tw.com.web;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class MyWebSocket {
	@OnMessage
	public String message(String msg) {
		String upmsg = msg.toUpperCase();
		return "WebSocket!"+upmsg;
	}
	
}
