package com.cpt202.team.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cpt202.team.services.SmsService;

@RestController
public class SmsController {
    @Autowired
    private SmsService smsService;

    @PostMapping("/sendSms")
    public ResponseEntity<String> sendSms(@RequestParam String phone, @RequestParam String message) {
        try {
            smsService.sendSms(phone, message);
            return ResponseEntity.ok("短信发送成功");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("短信发送失败: " + e.getMessage());
        }
    }
}

