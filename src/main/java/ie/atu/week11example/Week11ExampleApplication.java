package ie.atu.week11example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week11ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week11ExampleApplication.class, args);
    }

}
