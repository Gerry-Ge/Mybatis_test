package org.gerry.hibernateBeans;

import javax.persistence.*;

@Entity
@DiscriminatorValue("marvel")
public class MarvelSuperMan extends Superman{

	private String nation;

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
}
=======
package org.gerry.hibernateBeans;

import javax.persistence.*;

@Entity
@DiscriminatorValue("marvel")
public class MarvelSuperMan extends Superman{

	private String nation;

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
}
