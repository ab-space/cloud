package indi.wm.cloud.euerka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuerkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuerkaApplication.class, args);
    }
}
