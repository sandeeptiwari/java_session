package com.cloud4u.socitigo.domain.repo;

import com.cloud4u.socitigo.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Member, Long> {

    @Query("select m From Member m where m.name= :username " +
            "AND m.password = :password")
    Optional<Member> findUserNameAndPassword(@Param("username") String username,
                                             @Param("password") String password);
}
