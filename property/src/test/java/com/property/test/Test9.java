package com.property.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.dao.UserDao;
import com.property.service.UserService;
import com.property.vo.UserVO;

public class Test9 {

	@Test
	public void t1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		UserService userDao = context.getBean(UserService.class);
		List<UserVO> list = userDao.selectByRoId(6);
		for (UserVO userVO : list) {
			System.out.println(userVO.getLoginname());
		}
		
		// System.out.println(roleDao.selectAll().size());
		// System.out.println(roleDao.selectById(2).getName());
		// Role role = new Role();
		// role.setName("小红红");
		// role.setId(7);
		// //System.out.println(roleDao.add(role));
		// //System.out.println(roleDao.update(role));
		// System.out.println(roleDao.delete(7));
	}
}
