package com.capgemini.xyz.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;
import com.capgemini.xyz.dao.ILoanDAO;
import com.capgemini.xyz.dao.LoanDAO;
import com.capgemini.xyz.exceptions.InvalidEmailAddressException;
import com.capgemini.xyz.exceptions.InvalidLoanAmountException;
import com.capgemini.xyz.exceptions.InvalidLoanDurationException;
import com.capgemini.xyz.exceptions.InvalidMobileNumberException;

public abstract class LoanService implements ILoanAmount {
	ILoanDAO dao=new LoanDAO();

	@Override
	public Map<Integer, Loan> applyLoan(Loan loan) {
		return dao.loanEntry(loan);
	}

	
	@Override
	public Customer validateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCust(Customer cust) {
		return dao.customerEntry(cust);

	}

	@Override
	public double calculateEMI(double amount, int duration) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> getCustomerDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> getLoanDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateLoanDuration(int duration) throws InvalidLoanDurationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateLoanAmount(double amount) throws InvalidLoanAmountException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validatePhoneNumber(BigInteger mobile) throws InvalidMobileNumberException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateEmailAddress(String email) throws InvalidEmailAddressException {
		// TODO Auto-generated method stub
		return false;
	}




	

}
