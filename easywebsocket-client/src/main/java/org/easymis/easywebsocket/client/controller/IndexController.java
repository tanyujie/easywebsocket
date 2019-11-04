package org.easymis.easywebsocket.client.controller;

import org.easymis.easywebsocket.client.socket.ScoketClient;
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

	@GetMapping("/sendMessage")
	public String sendMessage(String message) {
		webScoketClient.groupSending(message);
		return message;
	}

}
