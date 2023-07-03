package org.project.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.project.domain.Customer;
import org.project.domain.Fertilizer;
import org.project.domain.Pesticide;

public class PesticideMapTest {
	private Map<Customer, Pesticide> map;

	public void setMap(Map<Customer, Pesticide> map) {
		this.map = map;
	}

	public void addEntries(Customer[] keys, Pesticide[] values) {
		if (this.map != null) {
			for (int i = 0; i < keys.length; ++i) {
				Customer key = keys[i];
				Pesticide value = values[i];
				this.map.put(key, value);
			}
		}
	}

	public Pesticide findPesticidePurchase(double contactNumber) {
		if (this.map != null) {
			Customer key = new Customer();
			key.setContactNumber(contactNumber);
			if (this.map.containsKey(key)) {
				Pesticide value = this.map.get(key);
				return value;
			}
		}
		return null;
	}

	public boolean removeCustomer(double contactNumber) {
		if (this.map != null) {
			Customer key = new Customer();
			key.setContactNumber(contactNumber);
			if (this.map.containsKey(key)) {
				this.map.remove(key);
				return true;
			}
		}
		return false;
	}

	
	public void printEntries() {
		if (this.map != null) {
			Set<Entry<Customer, Pesticide>> entries = this.map.entrySet();
			for (Entry<Customer, Pesticide> entry : entries) {
				Customer key = entry.getKey();
				Pesticide value = entry.getValue();
				System.out.println(key.toString() + "   " + value.toString());
			}
		}
	}

	public void calculatePrice() {
		if (this.map != null) {
			double sum = 0;
			for (Pesticide price : map.values()) {
				sum += (price.getPrice() * price.getquantity());
			}
			System.out.println("Total Sale in Rupees : " + sum);
		}
	}

	public void availableQuantity() {
		if (this.map != null) {
			int quantity = 0;
			int result = 0;
			for (Pesticide pesticide : map.values()) {
				quantity += (pesticide.getquantity());
				result = pesticide.getAvailableStock() - quantity;
			}
			System.out.println(" Total Availabe Stock : " + result);
		}

	}

	public Pesticide findCustomer(String name) {
		if (this.map != null) {
			Customer key = new Customer();
			key.setCustomerName(name);
			if (this.map.containsKey(key)) {
				Pesticide value = this.map.get(key);
				return value;
			}
		}
		return null;
	}

}





//
//public boolean removeProduct(String type) {
//	ArrayList<Customer> list = new ArrayList<Customer>();
//	Set<Customer> keys = this.map.keySet();
//	boolean deleteStatus;
//	for (Customer key : keys) {
//		System.out.println(key);
//		deleteStatus = this.map.containsKey(key);
//		if (deleteStatus) {
//			list.add(key);
//		}
//		for (Customer product : list) {
//			map.remove(product);
//			return true;
//		}
//	}
//	return false;
//}
