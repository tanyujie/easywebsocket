package org.easymis.easywebsocket.client.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
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
			WebSocketClient webSocketClient = new WebSocketClient(new URI("ws://localhost:8012/web/socket/20"),
					new Draft_6455()) {
				@Override
				public void onOpen(ServerHandshake handshakedata) {
					log.info("[websocket] 连接成功");
				}

				@Override
				public void onMessage(String message) {
					log.info("[websocket] 收到消息={}", message);
					String filePath = System.getProperty("user.dir") + "\\" + DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss").format(LocalDateTime.now()) + ".txt";
					log.info(filePath);
					try {
						File f = new File(filePath);
							f.createNewFile();
						FileWriter fw = new FileWriter(f, true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.append("我是程序猿");
						bw.write("我是");// 往已有的文件上添加字符串
						bw.write(message);
						bw.close();
						fw.close();
					} catch (Exception e) {
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
					log.info("[websocket] 连接错误={}", ex.getMessage());
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
