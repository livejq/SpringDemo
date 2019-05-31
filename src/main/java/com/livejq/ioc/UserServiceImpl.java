package com.livejq.ioc;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

    /**
     * 通过setter方法实现依赖注入
     * @param userDao
     */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void addUser() {
		// TODO Auto-generated method stub

		this.userDao.save();
		System.out.println("spring: hello User Service ");
	}

}
