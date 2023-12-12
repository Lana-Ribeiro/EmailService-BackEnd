package com.ribeiro.emailservice.core.Exceptions;

import com.ribeiro.emailservice.aplication.EmailSenderService;

public class EmailServiceException extends RuntimeException {

    public  EmailServiceException(String message){
        super(message);
    }

    public EmailServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
