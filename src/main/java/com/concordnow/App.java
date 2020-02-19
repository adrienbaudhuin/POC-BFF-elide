package com.concordnow;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.concordnow.model.Agreement;
import com.concordnow.model.User;
import com.yahoo.elide.core.DataStore;
import com.yahoo.elide.datastores.noop.NoopDataStore;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public DataStore buildDataStore() {
		return new NoopDataStore(Arrays.asList(Agreement.class, User.class, User.class));
	}

}
