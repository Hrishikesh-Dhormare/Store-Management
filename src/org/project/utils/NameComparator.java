package org.project.utils;

import java.util.Comparator;

import org.project.domain.Customer;

public class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer main, Customer other) {
		return main.getCustomerName().compareTo(other.getCustomerName());
	}

}
