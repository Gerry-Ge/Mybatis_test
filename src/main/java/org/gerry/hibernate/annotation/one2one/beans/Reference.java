package org.gerry.hibernate.annotation.one2one.beans;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Reference {
	@Id
	@GenericGenerator(name="foreignGenerator", strategy="foreign", 
	parameters={@Parameter(value="customer", name="property")})
    @GeneratedValue(generator="foreignGenerator")
	private int id;
	private String Name;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Customer customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
=======
package org.gerry.hibernate.annotation.one2one.beans;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Reference {
	@Id
	@GenericGenerator(name="foreignGenerator", strategy="foreign", 
	parameters={@Parameter(value="customer", name="property")})
    @GeneratedValue(generator="foreignGenerator")
	private int id;
	private String Name;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Customer customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
