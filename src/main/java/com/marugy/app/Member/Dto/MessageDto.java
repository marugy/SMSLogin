package com.marugy.app.Member.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class MessageDto {
    private String to;
//    String content; //메시지를 담아서 전송한다면 content 사용
}
