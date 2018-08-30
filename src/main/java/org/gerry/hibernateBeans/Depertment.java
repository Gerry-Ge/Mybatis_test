package org.gerry.hibernateBeans;

import java.util.List;

public class Depertment {
	private int deptId;
	private String deptName;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<String> getEmployee() {
		return employee;
	}
	public void setEmployee(List<String> employee) {
		this.employee = employee;
	}
	private List<String> employee;
	private List<Staff> staffs;
	public List<Staff> getStaffs() {
		return staffs;
	}
	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}
	

}
=======
package org.gerry.hibernateBeans;

import java.util.List;

public class Depertment {
	private int deptId;
	private String deptName;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<String> getEmployee() {
		return employee;
	}
	public void setEmployee(List<String> employee) {
		this.employee = employee;
	}
	private List<String> employee;
	private List<Staff> staffs;
	public List<Staff> getStaffs() {
		return staffs;
	}
	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}
	

}
