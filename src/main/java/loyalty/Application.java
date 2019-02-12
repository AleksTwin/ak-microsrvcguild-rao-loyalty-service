package loyalty;

import loyalty.service.LoyaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Autowired
    private LoyaltyService service;

    public Application(LoyaltyService service) {
        this.service = service;
        this.service.initialize();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}