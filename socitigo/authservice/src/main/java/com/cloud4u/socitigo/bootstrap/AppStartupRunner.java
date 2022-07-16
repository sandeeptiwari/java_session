package com.cloud4u.socitigo.bootstrap;

import com.cloud4u.socitigo.domain.entity.Member;
import com.cloud4u.socitigo.domain.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements CommandLineRunner {

    private final UserRepository userRepository;

    public AppStartupRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        var user = new Member("admin", "admin", 1001l, "admin@socitigo.com");
        userRepository.save(user);
    }
}
