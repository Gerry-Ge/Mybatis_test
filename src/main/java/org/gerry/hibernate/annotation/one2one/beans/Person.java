package org.gerry.hibernate.annotation.one2one.beans;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer personId;
	
	@Column(name="personName", unique=true)
	private String personName;

	@OneToOne(fetch = FetchType.LAZY, targetEntity = IdCard.class, 
			mappedBy = "person",cascade = CascadeType.ALL)
	private IdCard idCard;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}
	
}
