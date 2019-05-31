package com.livejq.factory;

public class InstanceFactory {

	public InstanceFactory() {
		System.out.println("bean3 工厂实例化中...");
	}
	
	public Bean3 createBean() {
		return new Bean3();
	}
}
