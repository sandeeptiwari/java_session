package com.cloud4u.socitigo.controller;

import com.cloud4u.socitigo.domain.request.Login;
import com.cloud4u.socitigo.domain.request.RegisterUser;
import com.cloud4u.socitigo.exception.UserNotFoundException;
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

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterUser user) {
        return new ResponseEntity<>(userService.register(user), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Login user) throws UserNotFoundException {
        return new ResponseEntity<>(userService.login(user), HttpStatus.OK);
    }
}
