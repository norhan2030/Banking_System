package com.global.Internet_Banking_System.security;

import com.global.Internet_Banking_System.Entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class JWTResponseDto {

    private String accessToken;

    private String refreshToken;
    private User user;

}
