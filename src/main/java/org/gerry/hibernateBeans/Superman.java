<<<<<<< HEAD
package org.gerry.hibernateBeans;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("superman")
public class Superman {
	private String name;
	private Integer sex;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer superId;
//	private String type;
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getSuperId() {
		return superId;
	}
	public void setSuperId(Integer superId) {
		this.superId = superId;
	}

}
=======
package org.gerry.hibernateBeans;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("superman")
public class Superman {
	private String name;
	private Integer sex;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer superId;
//	private String type;
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getSuperId() {
		return superId;
	}
	public void setSuperId(Integer superId) {
		this.superId = superId;
	}

}
>>>>>>> 20180829 commit;
