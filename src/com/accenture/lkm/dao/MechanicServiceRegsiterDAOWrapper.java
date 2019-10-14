package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.business.bean.DummyBean;
import com.accenture.lkm.business.bean.MechanicBean;
import com.accenture.lkm.business.bean.ServiceRegisterBean;
import com.accenture.lkm.entity.DummyEntity;
import com.accenture.lkm.entity.MechanicEntity;
import com.accenture.lkm.entity.ServiceRegisterEntity;

@Repository
@Transactional(value = "txManager")
public class MechanicServiceRegsiterDAOWrapper {
	@Autowired
	private MechanicDAO mechanicDAO;

	@Autowired
	private ServiceRegisterDAO serviceRegisterDAO;

	@PersistenceContext
	private EntityManager entityManager;

	public MechanicServiceRegsiterDAOWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<MechanicBean> getAllMechanic() {
		List<MechanicBean> beans = new ArrayList<MechanicBean>();
		List<MechanicEntity> entities = mechanicDAO.getAllMechanic();
		for (MechanicEntity mechanicEntity : entities) {
			MechanicBean bean = convertEntityToBean(mechanicEntity);
			beans.add(bean);
		}
		return beans;
	}

	public Integer save(ServiceRegisterBean serviceRegisterBean) {
//		serviceRegisterBean
		entityManager.persist(convertBeanToEntity(serviceRegisterBean));
		return serviceRegisterBean.getServiceId();
	}

	public List<ServiceRegisterBean> getAllServices() {
		return null;

	}

	// Utility Methods.......
	public static MechanicBean convertEntityToBean(MechanicEntity entity) {
		MechanicBean mechanicBean = new MechanicBean();
		BeanUtils.copyProperties(entity, mechanicBean);
		return mechanicBean;
	}

	public static MechanicEntity convertBeanToEntity(MechanicBean bean) {
		MechanicEntity entity = new MechanicEntity();
		BeanUtils.copyProperties(bean, entity);
		return entity;
	}

	public static ServiceRegisterBean convertEntityToBean(ServiceRegisterEntity entity) {
		ServiceRegisterBean bean = new ServiceRegisterBean();
		BeanUtils.copyProperties(entity, bean);
		return bean;
	}

	public static ServiceRegisterEntity convertBeanToEntity(ServiceRegisterBean bean) {
		ServiceRegisterEntity entity = new ServiceRegisterEntity();
		BeanUtils.copyProperties(bean, entity);
		return entity;
	}

}
