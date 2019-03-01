package com.capgemini.xyz.bean;

public class Customer {
	private long custId,mobile;
	private String custName,address,email;
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	private Loan loan;
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", mobile=" + mobile + ", custName=" + custName + ", address=" + address
				+ ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (custId ^ (custId >>> 32));
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (mobile ^ (mobile >>> 32));
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mobile != other.mobile)
			return false;
		return true;
	}
	public Customer(long mobile, String custName, String address, String email) {
		super();
		this.mobile = mobile;
		this.custName = custName;
		this.address = address;
		this.email = email;
	}
	public Customer() {
		super();}
	public Customer(long custId, long mobile, String custName, String address, String email) {
		super();
		this.custId = custId;
		this.mobile = mobile;
		this.custName = custName;
		this.address = address;
		this.email = email;
	}
	
	

}
