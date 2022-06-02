package com.core.dao;

import com.core.model.EmailDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Component
@Slf4j
public class DaoImpl {
    @Autowired
    private JavaMailSender mailSender;

    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail() throws MessagingException {

    }

    public void sendEmail(EmailDetails emailDetails) throws MessagingException {

        log.info("*************TO EMAIL*********"+ emailDetails.getToEmail());

        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setFrom("deshmukhsanket1998@gmail.com");
        mimeMessageHelper.setTo(emailDetails.getToEmail());

        mimeMessageHelper.setText(emailDetails.getEmailBoby());
        mimeMessageHelper.setSubject(emailDetails.getEmailSubject());

        FileSystemResource fileSystem
                = new FileSystemResource(new File(emailDetails.getAttachment()));

        mimeMessageHelper.addAttachment(fileSystem.getFilename(),
                fileSystem);

        mailSender.send(mimeMessage);
        System.out.println("Mail Send...Good");


    }
}
