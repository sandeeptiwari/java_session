package com.cloud4u.springdata.controller;

import com.cloud4u.springdata.domain.User;
import com.cloud4u.springdata.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountRestController {

    /**
     * URL - localhost:8081/api/account/balance/5
     * DI- dependency injection
     */
    //@Autowired
    private final AccountService accountService;

    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/balance/{accountNum}")
    public ResponseEntity<?> checkBalance(@PathVariable("accountNum") int accNo) {
        return new ResponseEntity<>(accountService.checkBalance(accNo), HttpStatus.OK);
    }

    @PostMapping("/balance")
    public void openAccount(@RequestBody User user){}
}
