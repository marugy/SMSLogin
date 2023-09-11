package com.marugy.app.domain.Member.Api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.marugy.app.domain.Member.Dto.MessageDto;
import com.marugy.app.domain.Member.Dto.response.SmsResponseDto;
import com.marugy.app.domain.Member.Service.SmsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
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

    //인증번호 발송
    @PostMapping("/sms/send")
    public SmsResponseDto sendSms(@RequestBody MessageDto messageDto) throws UnsupportedEncodingException, URISyntaxException, NoSuchAlgorithmException, InvalidKeyException, JsonProcessingException {
        log.info(messageDto.getTo());
        SmsResponseDto SmsResponseDto = smsService.sendSms(messageDto);
        return SmsResponseDto;
    }

    //인증 번호 검증
    @PostMapping("/sms/check")
    public ResponseEntity<Void> verifyCode(){
        return null;
    }


}
