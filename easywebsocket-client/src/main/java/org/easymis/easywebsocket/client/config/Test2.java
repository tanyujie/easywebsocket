package org.easymis.easywebsocket.client.config;

import java.io.IOException;
import java.net.URI;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
public class Test2 {
    private static String uri = "ws://39.97.169.104:8012/web/socket/20";
    private static Session session;
    private void start() {
        WebSocketContainer container = null;
        try {
            container = ContainerProvider.getWebSocketContainer();
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
        try {
            URI r = URI.create(uri);
            session = container.connectToServer(Client.class, r);
        } catch (DeploymentException | IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {	
    	
    	
    	
        Test2 client = new Test2();
        client.start();
      //  client.session.getAsyncRemote().sendText("vpageNo=1=pageSize=1");
        client.session.getBasicRemote().sendText("vpageNo=1=pageSize=1");       
                for(int i=1;i<2;i++) {
    				
    		        String input = "vpageNo="+i+"=pageSize=1";
    		       
			
                }
    }

}