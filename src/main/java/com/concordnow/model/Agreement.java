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

	@Override
	public String toString() {
		return "Agreement{" +
				"uid='" + uid + '\'' +
				", content='" + content + '\'' +
				", users=" + users +
				'}';
	}

	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(final Set<User> users) {
		this.users = users;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(final String uid) {
		this.uid = uid;
	}
}
