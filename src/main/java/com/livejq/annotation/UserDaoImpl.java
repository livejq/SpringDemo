package com.livejq.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		// TODO Auto-generated method stub

		System.out.println("spring: annotation 注解方式实现依赖注入!");
	}

}
