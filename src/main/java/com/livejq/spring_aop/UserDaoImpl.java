package com.livejq.spring_aop;

import com.livejq.jdk_proxy.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("正在保存！");
    }

    @Override
    public void update() {
        System.out.println("正在更新！");
    }

    @Override
    public void delete() {
        System.out.println("正在删除！");
    }

    @Override
    public void find() {
        System.out.println("正在查找！");
    }
}
