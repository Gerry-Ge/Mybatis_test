<<<<<<< HEAD
package org.gerry.hibernate.annotation.one2one.beans;

import javax.persistence.*;

@Entity
public class IdCard {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Integer idCardNo;
	@OneToOne(fetch=FetchType.LAZY,targetEntity=Person.class)
	@JoinColumn(name="personIId" ,referencedColumnName="personId",unique=true)
	private Person person;

	public Integer getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(int idCardNo) {
		this.idCardNo = idCardNo;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
=======
package org.gerry.hibernate.annotation.one2one.beans;

import javax.persistence.*;

@Entity
public class IdCard {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Integer idCardNo;
	@OneToOne(fetch=FetchType.LAZY,targetEntity=Person.class)
	@JoinColumn(name="personIId" ,referencedColumnName="personId",unique=true)
	private Person person;

	public Integer getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(int idCardNo) {
		this.idCardNo = idCardNo;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
>>>>>>> 20180829 commit;
