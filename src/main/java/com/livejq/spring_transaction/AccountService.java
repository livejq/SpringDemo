package com.livejq.spring_transaction;

public interface AccountService {
    public void transfer(String outUser, String inUser, int money);
}
