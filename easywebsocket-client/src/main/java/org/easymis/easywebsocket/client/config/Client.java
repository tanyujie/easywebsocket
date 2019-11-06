package org.easymis.easywebsocket.client.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
@ClientEndpoint()
public class Client {
    @OnOpen
    public void onOpen(Session session) {}
    @OnMessage
    public void onMessage(String message) {
    	String filePath = System.getProperty("user.dir") + "\\" + DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now()) + ".txt";
        System.out.println("Client onMessage: " + message);
		try {
			File f = new File(filePath);
				f.createNewFile();
			FileWriter fw = new FileWriter(f, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append(message);
			bw.close();
			fw.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @OnClose
    public void onClose() {}
}
