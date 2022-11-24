package com.gm2.dev.api;


import com.gm2.dev.core.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gm2.dev.core"})
public class ApiApplication {

    public static void main(String[] args) {
        Message message = new Message();
        System.out.println(message.get());
        SpringApplication.run(ApiApplication.class, args);
    }

}
