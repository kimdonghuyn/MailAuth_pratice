package com.example.mailauth_practice.controller;

import com.example.mailauth_practice.dto.request.auth.CheckCertificationRequestDto;
import com.example.mailauth_practice.dto.request.auth.EmailCertificationRequestDto;
import com.example.mailauth_practice.dto.request.auth.IdCheckRequestDto;
import com.example.mailauth_practice.dto.request.auth.SignUpRequestDto;
import com.example.mailauth_practice.dto.response.auth.CheckCertificationResponseDto;
import com.example.mailauth_practice.dto.response.auth.EmailCertificationResponseDto;
import com.example.mailauth_practice.dto.response.auth.IdCheckResponseDto;
import com.example.mailauth_practice.dto.response.auth.SignUpResponseDto;
import com.example.mailauth_practice.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/id-check")
    public ResponseEntity<? super IdCheckResponseDto> idCheck(@RequestBody @Valid IdCheckRequestDto requestBody) {
        ResponseEntity<? super IdCheckResponseDto> response = authService.IdCheck(requestBody);

        return response;
    }

    @PostMapping("/email-certification")
    public ResponseEntity<? super EmailCertificationResponseDto> emailCertification(@RequestBody @Valid EmailCertificationRequestDto requestBody) {
        ResponseEntity<? super EmailCertificationResponseDto> response = authService.emailCertification(requestBody);

        return response;
    }

    @PostMapping("/check-certification")
    public ResponseEntity<? super CheckCertificationResponseDto> checkCertification(@RequestBody @Valid CheckCertificationRequestDto requestBody) {
        ResponseEntity<? super CheckCertificationResponseDto> response = authService.checkCertification(requestBody);
        return response;
    }

    @PostMapping("/sign-up")
    public ResponseEntity<? super SignUpResponseDto> signUp(@RequestBody @Valid SignUpRequestDto requestBody) {
        ResponseEntity<? super SignUpResponseDto> response = authService.signUp(requestBody);
        return response;
    }
}
