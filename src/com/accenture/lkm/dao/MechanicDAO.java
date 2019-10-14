package com.accenture.lkm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.entity.MechanicEntity;

@RepositoryDefinition(idClass = Integer.class, domainClass = MechanicEntity.class)
@Transactional(value = "txManager")
// name of TransactionManger can be any thing
public interface MechanicDAO {
	String getMechanicType(int mechanicId);
	@Query(name="getAllMechanic")
	List<MechanicEntity> getAllMechanic();
	
	int updateNoOfVehicles(int update);
}
