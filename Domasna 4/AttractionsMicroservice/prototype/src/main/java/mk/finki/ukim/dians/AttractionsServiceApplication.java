package mk.finki.ukim.dians;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class AttractionsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttractionsServiceApplication.class, args);
    }

//    @Bean
//    RestTemplate restTemplate(){
//        return new RestTemplate();
//    }

}
