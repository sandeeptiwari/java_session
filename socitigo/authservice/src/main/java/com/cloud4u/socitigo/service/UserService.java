package com.cloud4u.socitigo.service;

import com.cloud4u.socitigo.domain.entity.Member;
import com.cloud4u.socitigo.domain.repo.UserRepository;
import com.cloud4u.socitigo.domain.request.Login;
import com.cloud4u.socitigo.domain.request.RegisterUser;
import com.cloud4u.socitigo.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository loginRepository) {
        this.userRepository = loginRepository;
    }

    public Member login(Login user) throws UserNotFoundException {
        Member member = null;
        return userRepository
                .findUserNameAndPassword(user.getName(), user.getPassword())
                .orElseThrow(() -> new UserNotFoundException("username or password is incorrect"));
    }

    public RegisterUser register(RegisterUser user) {
        var member = new Member(
                user.getName(),
                user.getPassword(),
                user.getOrgId(),
                user.getEmailId());

        var savedMember = userRepository.save(member);
        return new RegisterUser(savedMember.getName(),
                savedMember.getPassword(),
                savedMember.getEmailId(),
                savedMember.getOrgId());
    }
}
