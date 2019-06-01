package com.livejq.aspectj_aop;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("正在保存！");
//        int i = 10/0;
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
