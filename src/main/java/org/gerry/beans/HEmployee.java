package org.gerry.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="HEmployee")
public class HEmployee {

	@Id
	private int empId;
	@Column(name="firstName")
	private String firstName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "HEmployee [empId=" + empId + ", firstName=" + firstName + "]";
	}
}
=======
package org.gerry.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="HEmployee")
public class HEmployee {

	@Id
	private int empId;
	@Column(name="firstName")
	private String firstName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "HEmployee [empId=" + empId + ", firstName=" + firstName + "]";
	}
}