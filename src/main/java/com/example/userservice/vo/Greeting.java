package com.example.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Greeting {
    @Value("${greeting.message}") //yml 파일에서 그리팅 메세지를 찾아 아래의 message 스트링에 답는다.
    private String message;
}
