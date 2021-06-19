package com.example.userservice.vo;

import lombok.Data;

//가입 완료 후 사용자에게 반환하는 반환값
@Data
public class ResponseUser {
    private String email;
    private String name;
    private String userId;
}
