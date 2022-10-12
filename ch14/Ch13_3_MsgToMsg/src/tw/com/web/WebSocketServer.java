package tw.com.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.com.bean.Msg;

@ServerEndpoint("/websocket")
public class WebSocketServer {
	private static Map <String,Session> sessionMap = new HashMap<>();
	@OnMessage
	public void onMessage(String message,Session session) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objMap = new ObjectMapper();
		Msg msg = objMap.readValue(message, Msg.class);
		System.out.println(msg);
		
		session.getBasicRemote().sendText("我收到的訊息:"+message);
		sessionMap.putIfAbsent(msg.getFromUser(), session);
		
		if (sessionMap.containsKey(msg.getToUser())) {
			sessionMap.get(msg.getToUser()).getBasicRemote().sendText(msg.getMsg());
		}else {
			session.getBasicRemote().sendText("無法傳送!");
		}
	}
}
