package com.ribeiro.emailservice.adapters;

import org.springframework.stereotype.Component;

@Component
public interface EmailSenderGateway {

    void sendEmail(String toEmail, String subject, String body);
}
