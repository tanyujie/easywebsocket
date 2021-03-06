package org.easymis.easywebsocket.client.controller;

import org.easymis.easywebsocket.client.socket.ScoketClient;
import org.java_websocket.client.WebSocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags = "WebSocket测试首页加载API")
@RestController
@RequestMapping("/websocket")
public class IndexController {

	@Autowired
	private ScoketClient webScoketClient;
    @Autowired
    private WebSocketClient webSocketClient;
	@GetMapping("/sendMessage")
	public String sendMessage(String message) {
        //message="vpageNo=1=pageSize=1";
		//for(int i=1;i<2;i++)
		webScoketClient.groupSending(message);
		
		
		return message;
	}

}
