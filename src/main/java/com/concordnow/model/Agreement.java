package com.concordnow.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import com.yahoo.elide.annotation.Include;

@Include(type = "agreements", rootLevel = true)
@Entity
public class Agreement {

	@Id
	private String uid;

	private String content;

	@ManyToMany
	private Set<User> users;
}
