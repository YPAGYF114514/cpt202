package com.cpt202.team.services;


import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService {
    @Autowired
    private PhoneNumber twilioPhoneNumber;

    public void sendSms(String toPhoneNumber, String message) {
        PhoneNumber to = new PhoneNumber(toPhoneNumber);
        Message.creator(to, twilioPhoneNumber, message).create();
    }
}

