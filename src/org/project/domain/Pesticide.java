package org.project.domain;

public class Pesticide extends Product {
	private String type;
	private String targetPests;
	private int safetyDays;

	public Pesticide() {
		super();
	}

	public Pesticide(String name, float price, int quantity, int availableStock, String type, String targetPests,
			int safetyDays) {
		super(name, price, quantity, availableStock);
		this.type = type;
		this.targetPests = targetPests;
		this.safetyDays = safetyDays;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTargetPests() {
		return targetPests;
	}

	public void setTargetPests(String targetPests) {
		this.targetPests = targetPests;
	}

	public int getSafetyDays() {
		return safetyDays;
	}

	public void setSafetyDays(int safetyDays) {
		this.safetyDays = safetyDays;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Pesticide pesticide = (Pesticide) obj;
			if (this.type.equals(pesticide.type)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pesticide [ name + "+name+", price=" + price + ", quantity=" + quantity + ", availableStock=" + availableStock + ", type=" + type + ", targetPests=" + targetPests + ", safetyDays=" + safetyDays + "  ]";
	}
	

//	@Override
//	public String toString() {
//		return String.format("%-10s%-17.2f%-20d%-20d%-20s%-22s%-36d", this.name, this.price, this.quantity,
//				this.availableStock, this.type, this.targetPests, this.safetyDays);
//	}

}
