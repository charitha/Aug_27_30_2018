package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AccountDaoImpl extends BaseDaoSupport implements AccountDao {
    public void deposit(int accountNumber,int amount) {
        String sql = "update accounts set balance = balance + ? where account_number = ?";
        getJdbcTemplate().update(sql,amount,accountNumber);
    }
    public void withdraw(int accountNumber,int amount){
        String sql = "update accounts set balance = balance - ? where account_number = ?";
        getJdbcTemplate().update(sql,amount,accountNumber);
    }
}
