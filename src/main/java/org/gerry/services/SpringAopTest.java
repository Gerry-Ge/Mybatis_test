package org.gerry.services;

import org.gerry.services.UserService;
import org.gerry.springboot.SpringBootApplicationT;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@SpringBootTest(classes=SpringBootApplicationT.class)
public class SpringAopTest {
	
	@Autowired
	public UserService userService;
	
	@Test
	public void test(){
		userService.SearchUsers();
	}
}
