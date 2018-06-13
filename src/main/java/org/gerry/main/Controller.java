package org.gerry.main;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gerry.beans.UserBean;
import org.gerry.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class Controller {

	@Resource(name = "userMapper")
	private UserMapper um;

	@RequestMapping("/list")
	public ModelAndView listAllUsers(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<UserBean> users = um.selectAllUser();
		ModelAndView mdv = new ModelAndView("Hello");
		mdv.addObject("Users", users);
		return mdv;
	}
}
