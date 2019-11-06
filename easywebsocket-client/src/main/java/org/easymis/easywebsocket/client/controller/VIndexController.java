package org.easymis.easywebsocket.client.controller;

import org.easymis.easywebsocket.client.socket.ScoketClient;
import org.java_websocket.client.WebSocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.Api;

@Api(tags = "WebSocket测试首页加载API")
@Controller
public class VIndexController {

	@Autowired
	private ScoketClient webScoketClient;
    @Autowired
    private WebSocketClient webSocketClient;
	@GetMapping("/index.html")
	public String sendMessage(String message) {
	
		
		return "/index";
	}

}
