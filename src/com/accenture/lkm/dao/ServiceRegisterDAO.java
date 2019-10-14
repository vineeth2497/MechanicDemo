package com.accenture.lkm.dao;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.entity.ServiceRegisterEntity;

@RepositoryDefinition(idClass = Integer.class, domainClass = ServiceRegisterEntity.class)
@Transactional(value = "txManager")
// name of TransactionManger can be any thing
public interface ServiceRegisterDAO {
	ServiceRegisterEntity save(ServiceRegisterEntity serviceRegisterEntity);

	List<ServiceRegisterEntity> findAll();
}
