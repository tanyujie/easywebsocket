package org.easymis.easywebsocket;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyWebSocketApplication {
	protected static final Logger logger = LoggerFactory.getLogger(EasyWebSocketApplication.class);

	public static void main(String[] args) {
		logger.info("EasyWebSocket开始加载");
		SpringApplication.run(EasyWebSocketApplication.class, args);
		logger.info("EasyWebSocket加载完毕");
	}

}
