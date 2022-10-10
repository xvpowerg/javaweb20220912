package tw.com.web;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class WebSocketServer {
	
	@OnMessage
	public void onMessage(String msg,Session session) throws IOException, InterruptedException {
		session.getBasicRemote().sendText("����T��:"+msg);
		for (int i = 1;i<=10;i++) {
			Thread.sleep(500);
			session.getBasicRemote().sendText("Server Send msg "+i +"��");
		}
		session.getBasicRemote().sendText("����!");
	}
}
