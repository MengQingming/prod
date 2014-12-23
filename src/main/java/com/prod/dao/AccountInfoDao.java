package com.prod.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.prod.dao.common.SpringDataDAO;
import com.prod.entity.AccountInfo;

public interface AccountInfoDao extends SpringDataDAO<AccountInfo>{
	
	@Query("from AccountInfo")
	public List<AccountInfo> findAccountInfo();
	
	
}
