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
}
