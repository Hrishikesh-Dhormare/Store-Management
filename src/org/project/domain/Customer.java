package org.project.domain;

import java.util.Objects;

public class Customer {
	private String customerName;
	private double contactNumber;
	private String emailId;

	public Customer() {

	}

	public Customer(String customerName, int contactNumber, String emailId) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(double contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public int hashCode() {
		final int prime = 17;
		int result = 1;
		result = prime * result + (int) contactNumber;
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
		if (contactNumber != other.contactNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", contactNumber=" + contactNumber + ", emailId=" + emailId
				+ "]";
	}

//	/*@Override
//	public String toString() {
//		return String.format("%-30s%-18.2f%-17s", this.customerName, this.contactNumber, this.emailId);
//	}
	
	
}
