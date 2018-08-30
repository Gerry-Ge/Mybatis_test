<<<<<<< HEAD
package org.gerry.main;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gerry.beans.UserBean;
import org.gerry.mappers.UserMapper;
import org.gerry.mybatisPagePlugin.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class Controller {

	// @Resource(name = "UserMapper")
	// private UserMapper um;

	@Autowired
	UserMapper um;

	@Value("#{prop.test}")
	public String dbUrl;

	@RequestMapping("/list")
	public ModelAndView listAllUsers(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<UserBean> users = um.selectAllUser();
		ModelAndView mdv = new ModelAndView("Hello");
		mdv.addObject("Users", users);
		mdv.addObject("DBUrl", dbUrl);
		return mdv;
	}

	@RequestMapping("/userPages")
	public ModelAndView pageList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int currentPage = request.getParameter("page") == null ? 1 : Integer
				.parseInt(request.getParameter("page"));
		int pageSize = 3;
		if (currentPage <= 0) {
			currentPage = 1;
		}
		int currentResult = (currentPage - 1) * pageSize;

		System.out.println(request.getRequestURI());
		System.out.println(request.getQueryString());

		Page page = new Page();
		page.setShowCount(pageSize);
		page.setCurrentResult(currentResult);

		List<UserBean> users = um.getUserListPage(page);

		System.out.println("Current page =>" + page);

		int totalCount = page.getTotalResult();

		int lastPage = 0;
		if (totalCount % pageSize == 0) {
			lastPage = totalCount / pageSize;
		} else {
			lastPage = 1 + totalCount / pageSize;
		}

		int firstPageNo = (currentPage - 1) <= 0 ? 0 : (currentPage - 1);
		int lastPageNo = (currentPage + 1) >= lastPage ? lastPage
				: (currentPage + 1);

		String pageStr = String.format(
				"<a href=\"%s\">上一页</a>    <a href=\"%s\">下一页</a>",
				request.getRequestURI() + "?page=" + firstPageNo,
				request.getRequestURI() + "?page=" + lastPageNo);
		// 制定视图，也就是list.jsp
		ModelAndView mav = new ModelAndView("user");
		mav.addObject("Users", users);
		mav.addObject("page", pageStr);
		return mav;
	}
}
=======
package org.gerry.main;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gerry.beans.UserBean;
import org.gerry.mappers.UserMapper;
import org.gerry.mybatisPagePlugin.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class Controller {

	// @Resource(name = "UserMapper")
	// private UserMapper um;

	@Autowired
	UserMapper um;

	@Value("#{prop.test}")
	public String dbUrl;

	@RequestMapping("/list")
	public ModelAndView listAllUsers(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<UserBean> users = um.selectAllUser();
		ModelAndView mdv = new ModelAndView("Hello");
		mdv.addObject("Users", users);
		mdv.addObject("DBUrl", dbUrl);
		return mdv;
	}

	@RequestMapping("/userPages")
	public ModelAndView pageList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int currentPage = request.getParameter("page") == null ? 1 : Integer
				.parseInt(request.getParameter("page"));
		int pageSize = 3;
		if (currentPage <= 0) {
			currentPage = 1;
		}
		int currentResult = (currentPage - 1) * pageSize;

		System.out.println(request.getRequestURI());
		System.out.println(request.getQueryString());

		Page page = new Page();
		page.setShowCount(pageSize);
		page.setCurrentResult(currentResult);

		List<UserBean> users = um.getUserListPage(page);

		System.out.println("Current page =>" + page);

		int totalCount = page.getTotalResult();

		int lastPage = 0;
		if (totalCount % pageSize == 0) {
			lastPage = totalCount / pageSize;
		} else {
			lastPage = 1 + totalCount / pageSize;
		}

		int firstPageNo = (currentPage - 1) <= 0 ? 0 : (currentPage - 1);
		int lastPageNo = (currentPage + 1) >= lastPage ? lastPage
				: (currentPage + 1);

		String pageStr = String.format(
				"<a href=\"%s\">上一页</a>    <a href=\"%s\">下一页</a>",
				request.getRequestURI() + "?page=" + firstPageNo,
				request.getRequestURI() + "?page=" + lastPageNo);
		// 制定视图，也就是list.jsp
		ModelAndView mav = new ModelAndView("user");
		mav.addObject("Users", users);
		mav.addObject("page", pageStr);
		return mav;
	}
}
>>>>>>> 20180829 commit;
