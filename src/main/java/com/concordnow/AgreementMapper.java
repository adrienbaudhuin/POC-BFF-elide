package com.concordnow;

import java.util.Set;
import org.springframework.stereotype.Component;
import com.concordnow.model.Agreement;
import com.concordnow.model.User;
import com.yahoo.elide.core.EntityDictionary;

@Component
public class AgreementMapper {

	public AgreementMapper(final EntityDictionary dictionary) {
		dictionary.bindInitializer((agreement) -> {
			agreement.setContent("bonjour");
			User user = new User();
			user.setId("1");
			user.setName("Adrien");
			agreement.setUsers(Set.of(user));
		}, Agreement.class);
	}
}
