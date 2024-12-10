package ie.atu.week11example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="login-service", url = "http://localhost:8082/login")
public interface LoginClient {
    @PostMapping
    public String makeLogin(Person person);

}
