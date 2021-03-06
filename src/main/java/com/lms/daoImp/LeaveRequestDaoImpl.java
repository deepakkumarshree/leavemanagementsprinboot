package com.lms.daoImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lms.bean.UserBean;
import com.lms.dao.LeaveRequestDao;
import com.lms.model.LeaveRequest;
@Repository
public class LeaveRequestDaoImpl implements LeaveRequestDao{
	@Autowired
	  private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<LeaveRequest> getAll() {
		try{
			return sessionFactory.getCurrentSession().createCriteria(LeaveRequest.class).list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	@Transactional
	public boolean save(LeaveRequest leaveType) {
		boolean status=false;
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(leaveType);
				status= true; 
			    
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return status;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public ArrayList<String> getHolyday() {
	
		ArrayList<String> holydayList=new ArrayList<String>();
		
		try{
		
			String sql = "SELECT DATE_FORMAT(date,'%d-%m-%Y') FROM HOLYDAY";
			
			
			SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql);
			
			holydayList = (ArrayList<String>)(query.list());
			
			
			
			    
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return holydayList;
	}
	public Map<String,String> getLeaveBalance(UserBean userBean) 
	{
		Map<String,String> leaveBalMap=new HashMap<String,String>();
		leaveBalMap.put("Casual Leave","12");
		leaveBalMap.put("Paid Leave","12");
		leaveBalMap.put("Optional Leave","2");
		
		
		
		return leaveBalMap;
	}
	

}
