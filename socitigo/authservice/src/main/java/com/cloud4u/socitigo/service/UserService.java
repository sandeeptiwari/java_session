package com.cloud4u.socitigo.service;

import com.cloud4u.socitigo.domain.entity.Member;
import com.cloud4u.socitigo.domain.repo.LoginRepository;
import com.cloud4u.socitigo.domain.request.User;
import com.cloud4u.socitigo.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {
    private final LoginRepository loginRepository;

    public UserService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public Member login(User user) {
        Member member = null;
        try {
            member = loginRepository
                    .findUserNameAndPassword(user.getUsername(), user.getPassword()).get();
                    //.orElseThrow(() -> new UserNotFoundException("username or password is incorrect"));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        member = new Member();
        member.setEmailId("xyz@gmail.com");
        member.setFirstName("Mukesh");
        member.setLastName("Kumar");
        return member;
    }
}
