package org.gerry.hibernateBeans;

public class Staff {
	private int staffId;
	private String staffName;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Depertment getDepert() {
		return depert;
	}
	public void setDepert(Depertment depert) {
		this.depert = depert;
	}
	private Depertment depert;

}

