package com.capgemini.xyz.dao;

import java.util.Map;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public interface IloanDAO {
public Map<Integer, Customer>customerEntry(Customer cust);
public Map<Integer, Loan>loanEntry(Loan loan);
public long applyLoan(Loan loan);
public long insertCust(Customer cust);
}
