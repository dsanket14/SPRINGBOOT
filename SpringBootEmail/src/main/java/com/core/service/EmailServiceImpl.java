package com.core.service;

import com.core.dao.DaoImpl;
import com.core.model.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class EmailServiceImpl {

    @Autowired
    DaoImpl emailDaoImpl;
    public void sendEmail(EmailDetails emailDetails) throws MessagingException {

        emailDaoImpl.sendEmail(emailDetails);

    }

}
