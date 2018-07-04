package org.gerry.hibernateBeans;

import javax.persistence.*;

@Entity
@DiscriminatorValue("chinese")
public class ChineseSuperMan extends Superman{
	private String skills;

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
}
