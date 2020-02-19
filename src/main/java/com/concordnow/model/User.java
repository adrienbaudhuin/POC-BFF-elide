package com.concordnow.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import com.yahoo.elide.annotation.Include;

@Include(type = "users", rootLevel = true)
@Entity
public class User {

	@Id
	private String id;

	private String name;

	@ManyToMany(mappedBy = "users")
	private Set<Agreement> agreements;

	public User(final String id, final String name, final Set<Agreement> agreements) {
		this.id = id;
		this.name = name;
		this.agreements = agreements;
	}

	public User() {
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Set<Agreement> getAgreements() {
		return agreements;
	}

	public void setAgreements(final Set<Agreement> agreements) {
		this.agreements = agreements;
	}
}
