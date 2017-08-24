package com.lms.serviceImp;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.lms.dao.MasterDao;
import com.lms.service.MasterService;

@Service
public class MasterServiceImp implements MasterService{
	@Autowired
	private MasterDao masterDao;
	@Transactional
	@Override
	public List getRoles() {		
		return masterDao.getRoles();
	}
	@Override
	public Map getManagers() {
		return masterDao.getManagers();
	}
	@Override
	public Map getLeaveType() {
		return masterDao.getLeaveType();
	}
	
}
