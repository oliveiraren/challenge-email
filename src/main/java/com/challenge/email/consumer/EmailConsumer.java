package com.challenge.email.consumer;

import com.challenge.email.model.Email;
import com.challenge.email.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Component
public class EmailConsumer {

    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload Email email) throws MessagingException {
        emailService.sendEmail(email);
    }
}
