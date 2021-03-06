package com.prod.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.prod.entity.UserInfo;

public class UserDaoImpl implements UserDaoCustomize{
	
	@PersistenceContext(unitName = "JPA")
	private EntityManager em;

	public List<UserInfo> getAllUsers() {
		List<UserInfo> users = em.createQuery("SELECT user FROM UserInfo user").getResultList();
		return users;
	}


}
