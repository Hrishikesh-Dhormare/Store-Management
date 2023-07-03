package org.project.domain;

public class Fertilizer extends Product {
	private String type;
	private double nitrogenPercentage;
	private double phosphorusPercentage;
	private double potassiumPercentage;

	public Fertilizer() {
		super();
	}

	public Fertilizer(String name, float price, int quantity, int availableStock, String type,
			double nitrogenPercentage, double phosphorusPercentage, double potassiumPercentage) {
		super(name, price, quantity, availableStock);
		this.type = type;
		this.nitrogenPercentage = nitrogenPercentage;
		this.phosphorusPercentage = phosphorusPercentage;
		this.potassiumPercentage = potassiumPercentage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getNitrogenPercentage() {
		return nitrogenPercentage;
	}

	public void setNitrogenPercentage(double nitrogenPercentage) {
		this.nitrogenPercentage = nitrogenPercentage;
	}

	public double getPhosphorusPercentage() {
		return phosphorusPercentage;
	}

	public void setPhosphorusPercentage(double phosphorusPercentage) {
		this.phosphorusPercentage = phosphorusPercentage;
	}

	public double getPotassiumPercentage() {
		return potassiumPercentage;
	}

	public void setPotassiumPercentage(double potassiumPercentage) {
		this.potassiumPercentage = potassiumPercentage;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Fertilizer fertilizer = (Fertilizer) obj;
			if (this.type.equals(fertilizer.type)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Fertilizer [ name=" + name + ", price=" + price + ", quantity=" + quantity + ", availableStock=" + availableStock + ", type=" + type + ", nitrogenPercentage=" + nitrogenPercentage + ", phosphorusPercentage="
				+ phosphorusPercentage + ", potassiumPercentage=" + potassiumPercentage + " ]";
	}
	
	

//	@Override
//	public String toString() {
//		return String.format("%-26s%-17.2f%-20d%-20d%-20s%-20.2f%-20.2f%-34.2f", this.name, this.price, this.quantity,
//				this.availableStock, this.type, this.nitrogenPercentage, this.phosphorusPercentage,
//				this.potassiumPercentage);
//	}
	
}
