package com.cloud4u.springdata.service;

import com.cloud4u.springdata.domain.Account;
import com.cloud4u.springdata.repo.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

   private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public double checkBalance(int accountNumber) {
        //check the balance
        Account account = accountRepository.getReferenceById(accountNumber);
        return account.getBalance();
    }
}
