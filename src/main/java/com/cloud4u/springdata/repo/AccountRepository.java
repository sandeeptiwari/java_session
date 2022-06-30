package com.cloud4u.springdata.repo;

import com.cloud4u.springdata.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
