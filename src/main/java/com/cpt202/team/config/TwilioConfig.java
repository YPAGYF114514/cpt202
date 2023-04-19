package com.cpt202.team.config;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioConfig {
    @Value("${twilio.account.sid}")
    private String accountSid;

    @Value("${twilio.auth.token}")
    private String authToken;

    @Value("${twilio.phone.number}")
    private String twilioPhoneNumber;

    @Bean
    public PhoneNumber twilioPhoneNumber() {
        return new PhoneNumber(twilioPhoneNumber);
    }

    @PostConstruct
    public void init() {
        Twilio.init(accountSid, authToken);
    }
}

