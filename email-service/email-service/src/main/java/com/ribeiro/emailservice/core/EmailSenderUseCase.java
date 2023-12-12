package com.ribeiro.emailservice.core;

public interface EmailSenderUseCase {

        void sendEmail(String toEmail, String subject, String body);
    }