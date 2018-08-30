<<<<<<< HEAD
package org.gerry.hibernate.annotation.one2one.beans;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="T_Generate_S")
	@TableGenerator(name="T_Generate_S",table="T_Customer_s",pkColumnName="GEN_NAME",
					valueColumnName="GEN_VALUE",pkColumnValue="customer",allocationSize=1)
	private int id;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Reference reference;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reference getReference() {
		return reference;
	}
	public void setReference(Reference reference) {
		this.reference = reference;
	}

}
=======
package org.gerry.hibernate.annotation.one2one.beans;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="T_Generate_S")
	@TableGenerator(name="T_Generate_S",table="T_Customer_s",pkColumnName="GEN_NAME",
					valueColumnName="GEN_VALUE",pkColumnValue="customer",allocationSize=1)
	private int id;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Reference reference;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reference getReference() {
		return reference;
	}
	public void setReference(Reference reference) {
		this.reference = reference;
	}

}
>>>>>>> 20180829 commit;
