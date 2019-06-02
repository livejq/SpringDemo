package com.livejq.spring_transaction;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int in(String inUser, int money) {
        return jdbcTemplate.update("update tb_account set money = money + ? where name = ?", money, inUser);
    }

    @Override
    public int out(String outUser, int money) {
        return jdbcTemplate.update("update tb_account set money = money - ? where name = ?", money, outUser);
    }
}
