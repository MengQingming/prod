package com.prod.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.prod.entity.AccountInfo;
import com.prod.entity.UserInfo;
import com.prod.service.UserService;


public class JPATest extends BaseTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void findAccountInfo(){
		
		List<AccountInfo> accountInfos = userService.findAccountInfo();
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println(accountInfos.size());
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
	}
	
	
	@Test
	public void getAccountInfo(){
		AccountInfo account = userService.findAccountInfoById(2L);
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println("Account 余额: " + account.getBalance());
		System.out.println("\n\n\n\n\n\n\n\n\n");
		UserInfo user = account.getUserInfo();
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println("账户所有人: " + user.getUsername());
		System.out.println("\n\n\n\n\n\n\n\n\n");
	}
	
	@Test
	public void createAccountInfo(){
		userService.createNewAccount("sam", "password", 999999999);
	}
	
	@Test
	public void updateAccountInfo(){
		UserInfo user = new UserInfo();
		user.setPassword("password");
		user.setUsername("david");
		userService.updateAccountInfo(1L, user);
	}
	
	@Test
	public void deleteAccountInfo(){
		userService.deleteAccountInfo(1L);
	}
	
	@Test
	public void customizeQuery(){
		List<AccountInfo> accounts = userService.findAccountsByName("sam");
		for(AccountInfo account : accounts){
			System.out.println( account.getUserInfo().getUsername() + " 's balance: " + account.getBalance());
		}
	}
	
	@Test
	public void customizeRepository(){
		List<UserInfo> users = userService.findAllUsers();
		for(UserInfo user : users){
			System.out.println(user.getUsername());
		}
	}

}
