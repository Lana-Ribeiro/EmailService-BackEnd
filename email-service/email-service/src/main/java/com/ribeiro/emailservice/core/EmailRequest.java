package com.ribeiro.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
}
