package com.livejq.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

		this.userDao.save();
		System.out.println("spring annotation:  UserService 正在调用 save 方法 ....");
	}

}
