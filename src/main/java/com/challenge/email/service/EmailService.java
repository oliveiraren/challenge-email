package com.challenge.email.service;

import com.challenge.email.model.Email;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import static com.challenge.email.enumeration.EmailEnum.*;

@Service
@AllArgsConstructor
public class EmailService {

    private JavaMailSender javaMailSender;

    public void sendEmail(Email email) throws MessagingException{
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true);

        mimeMessageHelper.setFrom(email.getFrom());
        mimeMessageHelper.setTo(email.getTo());

        if (email.getType().equals(EMAIL_REGISTER.getText())) {
            mimeMessageHelper.setSubject(SUBJECT_REGISTER.getText());
            mimeMessageHelper.setText(TEXT_REGISTER.getText());
        }

        javaMailSender.send(message);
    }
}
