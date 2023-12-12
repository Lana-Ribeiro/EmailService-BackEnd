package com.ribeiro.emailservice.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.ribeiro.emailservice.core.EmailSenderUseCase;
import com.ribeiro.emailservice.core.Exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SesEmailSender implements EmailSenderUseCase {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService){
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }
    @Override
    public void sendEmail(String toEmail, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("lana.carolinesribeiro@gmail.com")
                .withDestination(new Destination()
                        .withToAddresses(toEmail))
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
        );

        try{
            this.amazonSimpleEmailService.sendEmail(request);

        }catch (AmazonServiceException exception){
            throw new EmailServiceException("Falha ao mandar email");

        }


    }
}
