package org.project.main;

import java.util.Scanner;

import org.project.domain.Customer;
import org.project.domain.Fertilizer;
import org.project.domain.Pesticide;
import org.project.domain.Product;

public class Utils {
	private static Scanner sc = new Scanner(System.in);

	public static Customer[] getArray() {
		Customer[] arr = new Customer[1];
		arr[0] = new Customer();
		return arr;
	}

	public static Fertilizer[] getFertilizerArray() {
		Fertilizer[] arr = new Fertilizer[1];
		arr[0] = new Fertilizer();
		return arr;
	}

	public static Pesticide[] getPesticideArray() {
		Pesticide[] arr = new Pesticide[1];
		arr[0] = new Pesticide();
		return arr;
	}

	public static void acceptRecord(Fertilizer[] fertilizer) {
		try {
			for (int i = 0; i < fertilizer.length; ++i) {
				System.out.println("Enter the product name :");
				sc.nextLine();
				fertilizer[i].setName(sc.nextLine());
				System.out.println("Enter the product price : ");
				fertilizer[i].setPrice(sc.nextFloat());
				System.out.println("Enter the product quantity : ");
				fertilizer[i].setquantity(sc.nextInt());
				System.out.println("Enter the available quantity : ");
				fertilizer[i].setAvailableStock(sc.nextInt());
				System.out.println("Enter type of Fertilizer type :");
				sc.nextLine();
				fertilizer[i].setType(sc.nextLine());
				System.out.println("Enter the Nitrogen Percentage : ");
				fertilizer[i].setNitrogenPercentage(sc.nextDouble());
				System.out.println("Enter the Phoshporous Percentage : ");
				fertilizer[i].setPhosphorusPercentage(sc.nextDouble());
				System.out.println("Enter the Potassium Percentage : ");
				fertilizer[i].setPotassiumPercentage(sc.nextDouble());
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void acceptRecord(Pesticide[] pesticide) {
		try {
			for (int i = 0; i < pesticide.length; ++i) {
				System.out.println("Enter the product name :");
				sc.nextLine();
				pesticide[i].setName(sc.nextLine());
				System.out.println("Enter the product price : ");
				pesticide[i].setPrice(sc.nextFloat());
				System.out.println("Enter the product quantity : ");
				pesticide[i].setquantity(sc.nextInt());
				System.out.println("Enter the available quantity : ");
				pesticide[i].setAvailableStock(sc.nextInt());
				System.out.println(" Enter the Pesticide type : ");
				sc.nextLine();
				pesticide[i].setType(sc.nextLine());
				System.out.println("Enter the Target(Useful) Pesticide");
				pesticide[i].setTargetPests(sc.nextLine());
				sc.nextLine();
				System.out.println("Enter the No. of Safety Days : ");
				pesticide[i].setSafetyDays(sc.nextInt());

			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void acceptRecord(Customer[] keys) {
		try {
			for (int i = 0; i < keys.length; ++i) {
				sc.nextLine();
				System.out.println("Enter Customer Name : ");
				keys[i].setCustomerName(sc.nextLine());
				System.out.println("Enter the Customer Number : ");
				keys[i].setContactNumber(sc.nextDouble());
				sc.nextLine();
				System.out.println("Enter the Customer Email Id : ");
				keys[i].setEmailId(sc.nextLine());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void acceptCustomerNumber(double[] contactNumber) {
			try {
				System.out.println("Enter the contact Number to find Customer :");
				contactNumber[0] = sc.nextDouble();
			} catch (Exception e) {
				// InputMisMatchedException 
				e.printStackTrace();
			}
	}

	public static void acceptCustomerName(String[] name) {
		if (name != null) {
			System.out.println("Enter the Cutomer Name :");
			sc.nextLine();
			name[0] = sc.nextLine();
		}
	}

	public static void printStatus(boolean status) {
		if (status)
			System.out.println(" Entry Removed Successful :");
		else
			System.out.println(" Invalid Entry Not Found !!!");
	}

	public static void showName() {
		System.out.println("=====================================================================================================================================================================\n"
				+ "                                         #  AGRICULTURE  STORE  MANAGEMENT  #\n"
				+ "=======================================================================================================================================================================\n"
				+ " ");
	
		
	}
	public static int menuList() {
		System.out.println("======================================================================================================================================================================");
		System.out.println();
		System.out.println("0. For Exit");
		System.out.println("1. To Add user and Product Purchase :");
		System.out.println("2. To find product purchase by Customer : ");
		System.out.println("3. To remove Entry of Customer :");
		System.out.println("4. To calculate  total price :");
		System.out.println("5. To display available stock :");
		System.out.println("6. To view all product by name :");
		System.out.print("Enter the choice :");
		return sc.nextInt();
	}

	public static int subMenuList() {
		System.out.println();
		System.out.println("0. To Exit : ");
		System.out.println("1. For Fertilizer : ");
		System.out.println("2. for Pesticides : ");
		System.out.println("Select choice :");
		return sc.nextInt();
	}
	
	

}





//public static void acceptProductType(String[] type) {
//	try {
//		System.out.println("Enter the Product type to be removed :");
//		sc.nextLine();
//		type[0] = sc.nextLine();
//	} catch (NumberFormatException e) {
//		// For NumberFormatException
//		e.printStackTrace();
//	}
//
//}




