package com.livejq.jdbctemplate;

public interface UserDao {

	public int addUser(User user);
	public int updateUser(User user);
	public int deleteUserById(int id);
}
