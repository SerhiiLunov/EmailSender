package com.springapp.EmailSender;

import com.springapp.EmailSender.service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EmailSenderApplication {

    public EmailSenderApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(EmailSenderApplication.class, args);
    }
}
