package com.global.Internet_Banking_System.security;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignUpRequestDto {
    private String fullName;
    private String userName;
    private Long nationalId;
    private String email;
    private String password;
}
