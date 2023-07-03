package org.project.main;

import java.util.Hashtable;

import org.project.domain.Customer;
import org.project.domain.Fertilizer;
import org.project.domain.Pesticide;
import org.project.domain.Product;
import org.project.test.FertilizerMapTest;
import org.project.test.PesticideMapTest;

public class Program {
	
	public static void main(String[] args) {
		int choice;
		int subChoice;
		double[] contactNumber = new double[1];
		FertilizerMapTest test = new FertilizerMapTest();
		test.setMap(new Hashtable<>());
		PesticideMapTest test1 = new PesticideMapTest();
		test1.setMap(new Hashtable<>());
		Fertilizer[] values;
		Customer[] keys = null;
		Pesticide[] values1 = null;
		Utils.showName();
		while ((choice = Utils.subMenuList()) != 0) {
			switch (choice) {
			case 1: // For Ferilizers Records
				while ((subChoice = Utils.menuList()) != 0) {
					switch (subChoice) {
					case 1:
						keys = Utils.getArray();
						Utils.acceptRecord(keys);
						values = Utils.getFertilizerArray();
						Utils.acceptRecord(values);
						test.addEntries(keys, values);
						break;
					case 2:
						Utils.acceptCustomerNumber(contactNumber);
						Fertilizer findFertilizer = test.findFertilizerPurchase(contactNumber[0]);
						if (findFertilizer == null)
							System.out.println("Customer NoT Found ");
						else
							System.out.println(findFertilizer);
						break;
					case 3:
						Utils.acceptCustomerNumber(contactNumber);
						boolean status = test.removeCustomer(contactNumber[0]);
						Utils.printStatus(status);
						break;
					case 4:
						test.calculatePrice();
						break;
					case 5:
						test.availableQuantity();
						break;
					case 6:
						test.printEntries();
						break;
					}
				}
			case 2: // For Pesticides Details 1

				while ((subChoice = Utils.menuList()) != 0) {
					switch (subChoice) {
					case 1:
						keys = Utils.getArray();
						Utils.acceptRecord(keys);

						values1 = Utils.getPesticideArray();
						Utils.acceptRecord(values1);
						test1.addEntries(keys, values1);
						break;
					case 2:
						Utils.acceptCustomerNumber(contactNumber);
						Pesticide findPesticide = test1.findPesticidePurchase(contactNumber[0]);
						if (findPesticide == null)
							System.out.println("Customer NoT Found ");
						else
							System.out.println(findPesticide);
						break;
					case 3:
						Utils.acceptCustomerNumber(contactNumber);
						boolean status = test1.removeCustomer(contactNumber[0]);
						Utils.printStatus(status);
						break;
					case 4:
						test1.calculatePrice();
						break;
					case 5:
						test1.availableQuantity();
						break;
					case 6:
						test1.printEntries();
						break;
					}
				}
			}
		}
	}
}
