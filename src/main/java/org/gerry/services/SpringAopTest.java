package org.gerry.services;

import org.gerry.beans.UserBean;
import org.gerry.main.CodeUtils;
import org.gerry.mappers.UserMapper;
import org.gerry.springboot.SpringBootApplicationT;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@ContextConfiguration({"classpath:applicationContext.xml"})
@SpringBootTest(classes=SpringBootApplicationT.class)
public class SpringAopTest {
	
	@Autowired
	public UserMapper userMapper;
	
	@Test
	public void test(){
		try {
			UserBean user=userMapper.selectUserById(16);
			CodeUtils.prt(user.getUsername());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
