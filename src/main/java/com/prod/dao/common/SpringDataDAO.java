package com.prod.dao.common;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;



@NoRepositoryBean
public interface SpringDataDAO <T> extends JpaRepository<T, Serializable>, JpaSpecificationExecutor<T>{

//	@Modifying
//	@Query("delete from  #{#entityName} t where t.id=:id ")
//	public void doDeleteById(@Param("id") Object id);
	
	
	//public List<T> findByIdIn(Object[] ids);
}
