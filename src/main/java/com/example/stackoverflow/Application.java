package com.example.stackoverflow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

@Component
class MyRunner implements CommandLineRunner {

    @Value("${test.app.property}")
    private String prop;
    
    @Override
    public void run(String... arg0) throws Exception {
        System.out.println("This is the Test Property Value = " + prop);
    }
    
}
