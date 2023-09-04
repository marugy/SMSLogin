package com.marugy.app.Member.Api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.marugy.app.Member.Dto.MessageDto;
import com.marugy.app.Member.Dto.response.SmsResponseDto;
import com.marugy.app.Member.Service.SmsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RequiredArgsConstructor
@RestController
@Slf4j
public class SmsApi {
    private final SmsService smsService;

    @PostMapping("/sms/send")
    public SmsResponseDto sendSms(@RequestBody MessageDto messageDto) throws UnsupportedEncodingException, URISyntaxException, NoSuchAlgorithmException, InvalidKeyException, JsonProcessingException {
        log.info(messageDto.getTo());
        System.out.print(messageDto.getTo());
        SmsResponseDto responseDto = smsService.sendSms(messageDto);
        return responseDto;
    }
}
