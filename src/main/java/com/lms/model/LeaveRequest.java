package com.lms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="leaverequest")

public class LeaveRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
     @Column(name="leaverequestid")
     private int leaverequestId;	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @PrimaryKeyJoinColumn
     private Employee emp;	 
	
	 @Column(name="appoverid")
     private int appoverId;
	 
	 @Column (name = "fromDate")
     private Date fromDate;
	 
	 @Column (name = "ToDate")
     private Date toDate;
	 
	 @Column (name = "noOfLeaves")
     private int noOfLeaves;
	 
	 @Enumerated(EnumType.STRING)
     private LeaveStatus status;
	 
	 @ManyToOne(cascade = CascadeType.PERSIST)
	 @PrimaryKeyJoinColumn
     private LeaveType leaveType;

	public int getLeaverequestId() {
		return leaverequestId;
	}

	public void setLeaverequestId(int leaverequestId) {
		this.leaverequestId = leaverequestId;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public int getAppoverId() {
		return appoverId;
	}

	public void setAppoverId(int appoverId) {
		this.appoverId = appoverId;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getNoOfLeaves() {
		return noOfLeaves;
	}

	public void setNoOfLeaves(int noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}

	public LeaveStatus getStatus() {
		return status;
	}

	public void setStatus(LeaveStatus status) {
		this.status = status;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}	 
	 
	 
	

}
