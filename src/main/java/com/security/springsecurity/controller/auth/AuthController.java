package com.security.springsecurity.controller.auth;

import com.security.springsecurity.domain.AuthRequest;
import com.security.springsecurity.domain.AuthResponse;
import com.security.springsecurity.domain.RegisterRequest;
import com.security.springsecurity.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> authenticateUser(@RequestBody AuthRequest authRequest) {
        return ResponseEntity.ok(authService.authenticateUser(authRequest));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> registerUser(@RequestBody RegisterRequest registerRequest) {
        return ResponseEntity.ok(authService.registerUser(registerRequest));
    }
}
