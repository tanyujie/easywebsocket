package org.easymis.easywebsocket.client;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = "org.easymis.easywebsocket.client")
@ServletComponentScan
@EnableSwagger2
public class EasyWebSocketClientApplication {
	protected static final Logger logger = LoggerFactory.getLogger(EasyWebSocketClientApplication.class);

	public static void main(String[] args) {
		logger.info("EasyWebSocket开始加载");
		SpringApplication.run(EasyWebSocketClientApplication.class, args);
		logger.info("EasyWebSocket加载完毕");
	}

}
