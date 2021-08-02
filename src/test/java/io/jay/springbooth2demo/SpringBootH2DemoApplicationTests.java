package io.jay.springbooth2demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootH2DemoApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertData() {
		UserEntity user = UserEntity.builder()
				.name("John")
				.phone("010-1111-2222")
				.activated(true)
				.build();

		userRepository.save(user);
	}

}
