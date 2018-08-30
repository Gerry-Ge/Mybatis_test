package org.gerry.test;

import org.gerry.main.CodeUtils;
import org.gerry.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@SpringBootTest
@TestExecutionListeners()
public class SpringAopTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void test(){
		userService.SearchUsers();
//		CodeUtils.prt("dsad");
	}
}
