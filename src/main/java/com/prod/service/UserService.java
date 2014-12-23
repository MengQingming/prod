package com.prod.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.prod.entity.AccountInfo;
import com.prod.entity.UserInfo;




public interface UserService {
	
    public AccountInfo createNewAccount(String username, String password, Integer initBalance);

    public void updateAccountInfo(Long accountId, UserInfo newInfo);
    
    public void deleteAccountInfo(Long accountId);
    
    public AccountInfo findAccountInfoById(Long id);

    public List<AccountInfo> findByBalanceGreaterThan(Integer balance,Pageable pageable);
    
    public List<AccountInfo> findAccountsByName(String name);
    
    public List<UserInfo> findAllUsers();
    
    public List<AccountInfo> findAccountInfo();
    
}
