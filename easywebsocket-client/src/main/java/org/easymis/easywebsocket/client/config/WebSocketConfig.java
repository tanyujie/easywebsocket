package org.easymis.easywebsocket.client.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.URI;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
import org.joda.time.LocalDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author 谭宇杰
 *
 */
@Slf4j
@Component
public class WebSocketConfig {
	@Bean
    public WebSocketClient webSocketClient() {
    try {
        WebSocketClient webSocketClient = new WebSocketClient(new URI("ws://localhost:8012/web/socket/20"),new Draft_6455()) {
            @Override
            public void onOpen(ServerHandshake handshakedata) {
                log.info("[websocket] 连接成功");
            }

            @Override
            public void onMessage(String message) {
                log.info("[websocket] 收到消息={}",message);
                try {
                    File file = new File(LocalDateTime.now().toString());
                    PrintStream ps = new PrintStream(new FileOutputStream(file));
                    ps.println(message);// 往文件里写入字符串
                    ps.close();
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            @Override
            public void onClose(int code, String reason, boolean remote) {
                log.info("[websocket] 退出连接");
            }

            @Override
            public void onError(Exception ex) {
                log.info("[websocket] 连接错误={}",ex.getMessage());
            }
        };
        webSocketClient.connect();
        return webSocketClient;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
}
