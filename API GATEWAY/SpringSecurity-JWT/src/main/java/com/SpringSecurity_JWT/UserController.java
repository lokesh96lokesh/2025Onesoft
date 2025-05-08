package com.SpringSecurity_JWT;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/profile")
    public String profile() {
        return "Accessed secure profile!";
    }
}

