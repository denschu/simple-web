package de.denschu.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SimpleWebApplication.class)
@WebAppConfiguration
public class SimpleWebApplicationTests {

	@Test
	public void contextLoads() {
		// http://localhost:8080/?name=User
	}

}