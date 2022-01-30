package mk.finki.ukim.dians;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MapsMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapsMicroserviceApplication.class, args);
    }

}
