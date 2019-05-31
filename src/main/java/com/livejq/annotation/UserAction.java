package com.livejq.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
public class UserAction {

	@Resource(name="userService")
	private UserService userService;

    /**
     * 尝试后发现 上面的注解是通过调用这个setter方法来实现依赖注入的，因此不能省略此方法
     * 尽管当前并没有对象调用
     * @param userService
     */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void save() {
		this.userService.save();
		System.out.println("UserAction 调用 save 方法成功!");
	}
}
