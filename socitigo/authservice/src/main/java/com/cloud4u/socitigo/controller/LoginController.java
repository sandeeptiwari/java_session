package com.cloud4u.socitigo.controller;

import com.cloud4u.socitigo.domain.request.User;
import com.cloud4u.socitigo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/socitigo/authservice/api/")
@CrossOrigin("http://localhost:4200")
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public String login1() {
        return "new ResponseEntity<>(userService.login(user), HttpStatus.OK)";
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        return new ResponseEntity<>(userService.login(user), HttpStatus.OK);
    }
}
