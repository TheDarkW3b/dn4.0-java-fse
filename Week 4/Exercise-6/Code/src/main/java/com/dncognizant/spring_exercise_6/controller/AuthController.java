package com.dncognizant.spring_exercise_6.controller;

import java.util.Base64;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dncognizant.spring_exercise_6.util.JwtUtil;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthController {
    @Value("${application.user}")
    private String adminUsername;

    @Value("${application.password}")
    private String adminPassword;

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/auth")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            try {
                String base64Credentials = authHeader.substring("Basic ".length());
                byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
                String credentials = new String(credDecoded);
                String[] values = credentials.split(":", 2);

                if (values.length == 2 &&
                        adminUsername.equals(values[0]) &&
                        adminPassword.equals(values[1])) {

                    String token = jwtUtil.generateToken(values[0]);
                    return ResponseEntity.ok().body(Map.of("token", token));
                }
            } catch (IllegalArgumentException e) {
                return ResponseEntity.badRequest().body("Invalid Base64 encoding");
            }
        }

        return ResponseEntity
                .status(401)
                .header("WWW-Authenticate", "Basic realm=\"JWT Protected Area\"")
                .body("Invalid Credentials");
    }
}
