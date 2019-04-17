package org.katheer.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
    private String name;
    private String eid;
    private Account account;

    public Employee(String name, String eid,
                    @Autowired(required = true) @Qualifier("acc1") Account account) {
        this.name = name;
        this.eid = eid;
        this.account = account;
    }

    public void showEmployeeDetails() {
        System.out.println("*************************************************");
        System.out.println("Employee Details");
        System.out.println("Employee Name   : " + this.name);
        System.out.println("Employee ID     : " + this.eid);
        System.out.println();
        System.out.println("Account Details");
        System.out.println("Account Holder  : " + account.getAccName());
        System.out.println("Account No      : " + account.getAccNo());
        System.out.println("Account Bank    : " + account.getBank());
        System.out.println("Account Branch  : " + account.getBranch());
        System.out.println("Account Balance : " + account.getBalance());
        System.out.println("*************************************************");
    }
}
