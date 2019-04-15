package springcloud.helloworld.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.logging.Logger;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    private static final Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
        logger.info("eurekaServer starting");
    }
}
