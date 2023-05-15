package com.gmail.maxenamiro.imageHub.email;

import org.springframework.context.annotation.Bean;


public interface EmailSender {
    void send(String to, String email);
}