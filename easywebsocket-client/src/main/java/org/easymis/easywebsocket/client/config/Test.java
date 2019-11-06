package org.easymis.easywebsocket.client.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
public class Test {
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
    public static void main(String[] args) {
        Test client = new Test();
        client.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            do {
                input = br.readLine();
                if (!input.equals("exit"))
                    client.session.getBasicRemote().sendText("javaclient"+input);
            } while (!input.equals("exit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}