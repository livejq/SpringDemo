package com.livejq.assemble;

public class User {
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
	
	public User() {
		super();
	}

	/**
	 * 通过自定义构造方法（带参数） 实现依赖注入
	 */
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [ username = " + username +",  passwrod = " + password + "]";
	}

}
