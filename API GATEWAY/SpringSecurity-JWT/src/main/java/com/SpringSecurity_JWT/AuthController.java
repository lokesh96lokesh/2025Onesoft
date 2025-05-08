package com.SpringSecurity_JWT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Hardcoded auth for demo
        if ("admin".equals(username) && "password".equals(password)) {
            return jwtUtil.generateToken(username);
        }
        return "Invalid credentials";
    }

    @GetMapping("/validate")
    public String validateToken(@RequestHeader("Authorization") String token) {
        token = token.replace("Bearer ", "");
        if (jwtUtil.isTokenValid(token)) {
            return "Token valid for user: " + jwtUtil.extractUsername(token);
        } else {
            return "Invalid or expired token";
        }
    }
}

