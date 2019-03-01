package com.capgemini.xyz.bean;

public class Loan {
private long loanId,custId;
private double loanAmount;
private int duration;
public Loan() {
	super();}
public Loan(long loanId, long custId, double loanAmount, int duration) {
	super();
	this.loanId = loanId;
	this.custId = custId;
	this.loanAmount = loanAmount;
	this.duration = duration;
}
public Loan(double loanAmount, int duration) {
	super();
	this.loanAmount = loanAmount;
	this.duration = duration;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (custId ^ (custId >>> 32));
	result = prime * result + duration;
	long temp;
	temp = Double.doubleToLongBits(loanAmount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + (int) (loanId ^ (loanId >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Loan other = (Loan) obj;
	if (custId != other.custId)
		return false;
	if (duration != other.duration)
		return false;
	if (Double.doubleToLongBits(loanAmount) != Double.doubleToLongBits(other.loanAmount))
		return false;
	if (loanId != other.loanId)
		return false;
	return true;
}
@Override
public String toString() {
	return "Loan [loanId=" + loanId + ", custId=" + custId + ", loanAmount=" + loanAmount + ", duration=" + duration
			+ "]";
}

}


