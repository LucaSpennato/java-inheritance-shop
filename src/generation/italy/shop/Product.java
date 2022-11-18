package generation.italy.shop;

import java.util.Random;

public class Product {

	private int serialCode;
	private String brand;
	private int price;
	static final int tax = 20;

	public Product(String brand, int price) {
		
		this.brand = brand;
		this.price = price;
		setSerialCode();
		
	}

	public int getSerialCode() {
		return serialCode;
	}

	private void setSerialCode() {
		Random rnd = new Random();
		this.serialCode = rnd.nextInt(999999);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTax() {
		return tax;
	}

	public int getPriceWithTax() {
		return price + (price * tax / 100);
	}
	
	@Override
	public String toString() {

		return "Serial code: " + getSerialCode()
				+ "\nBrand: " + getBrand()
				+ "\nPrice: " + getPrice() + "$"
				+ "\nTax: " + tax + "%"
				+ "\nPrice with tax: " + getPriceWithTax() + "$";
	}
}
