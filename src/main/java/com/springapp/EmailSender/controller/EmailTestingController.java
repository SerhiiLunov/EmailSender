package com.springapp.EmailSender.controller;

import com.springapp.EmailSender.service.EmailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailTestingController {
  private final EmailService emailService;

    public EmailTestingController(EmailService emailService) {
        this.emailService = emailService;
    }
    @RequestMapping("/send-test-email")
    public String sentEmailTest(){
        emailService.sendEmail("lunevlife@gmail.com", "Hello", "Hello, Serhii");
        return "Email send test successfully";
    }
}
