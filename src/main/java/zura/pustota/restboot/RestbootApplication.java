package zura.pustota.restboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import zura.pustota.restboot.controller.Client;

@SpringBootApplication
public class RestbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RestbootApplication.class, args);
        Client bean = context.getBean(Client.class);
        bean.restCall().subscribe(e-> System.out.println("e = " + e));

    }

}
