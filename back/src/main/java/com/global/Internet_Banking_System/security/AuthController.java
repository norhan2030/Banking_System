package com.global.Internet_Banking_System.security;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;


    @PostMapping("/login")
    public ResponseEntity<JWTResponseDto> login (@RequestBody LoginRequestDto loginRequest){

        JWTResponseDto jwtResponseDto = authService.login(loginRequest.getUserName(), loginRequest.getPassword());

        return ResponseEntity.ok(jwtResponseDto);
    }
    @PostMapping("/signUp")
    public ResponseEntity<?>signUp(@RequestBody SignUpRequestDto signupRequest){

        JWTResponseDto jwtResponseDto = authService.signUp(signupRequest.getFullName(),signupRequest.getUserName(),signupRequest.getNationalId(),signupRequest.getEmail(), signupRequest.getPassword());

        return ResponseEntity.ok(jwtResponseDto);
    }


    @PostMapping("/refresh-token")
    public ResponseEntity<AccessTokenDto> refreshAccessToken(@RequestParam String refreshToken) {

        AccessTokenDto dto = authService.refreshAccessToken(refreshToken);

        return ResponseEntity.ok(dto);
    }


    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestParam String refreshToken) {

        authService.logoutUser(refreshToken);

        return ResponseEntity.ok(null);
    }
}
