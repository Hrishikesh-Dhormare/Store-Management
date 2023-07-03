package org.project.domain;

//Parent class for all products sold at the agriculture store
public class Product {
	protected String name;
	protected float price;
	protected int quantity;
	protected int availableStock;

	public Product() {

	}

	public Product(String name, float price, int quantity, int availableStock) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.availableStock = availableStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Product product = (Product) obj;
			if (this.price == product.price) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("%-25s%-8.2f%-10d%-10d", this.name, this.price, this.quantity, this.availableStock);
	}

}
