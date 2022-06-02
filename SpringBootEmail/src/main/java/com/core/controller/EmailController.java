package com.core.controller;

import com.core.model.EmailDetails;
import com.core.service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/")
public class EmailController {

    @Autowired
    EmailServiceImpl emailServiceImpl;

    @PostMapping("/sendemail")
    public String sendMail(@RequestBody EmailDetails emailDetails) throws MessagingException {
        emailServiceImpl.sendEmail(emailDetails);
        return "Email Sent Successfully";
    }
}
