package com.capgemini.xyz.service;

import java.util.List;
import java.util.Map;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;
import com.capgemini.xyz.exceptions.InvalidEmailException;
import com.capgemini.xyz.exceptions.InvalidLoanAmountException;
import com.capgemini.xyz.exceptions.InvalidLoanDurationException;

public interface ILoanService {
	//Map<Integer, Customer>applyLoan(Loan loan);
	public Loan applyLoan(Loan loan); 
	public Customer validateCustomer(Customer customer);
	public long insertCust(Customer cust);
	public double calculateEMI(double amount,int duration);	
		
	List<Customer>getCustomersDetails();
	List<Loan>getLoanDetails();
	public boolean validateEmail(String email)throws InvalidEmailException;
	public boolean validateLoanAmount(double loanAmount)throws InvalidLoanAmountException;
	public boolean validateLoanDuration(int duration)throws InvalidLoanDurationException;
	
	}


