package com.livejq.spring_transaction;

public interface AccountDao {
    public int in(String inUser, int money);
    public int out(String outUser, int money);
}
