package generation.italy.shop;

import java.util.Random;

public class Smartphone extends Product{

	private String IMEI;
	private int storage;
	
	public Smartphone(String marca, int prezzo, int storage) {
		
		super(marca, prezzo);
		this.storage = storage;
		setIMEI();
	}

	public String getIMEI() {
		return IMEI;
	}

	private void setIMEI() {
		Random rnd = new Random();
		IMEI = rnd.nextInt(999999999) + "" + rnd.nextInt(99999);
	}

	public int getStorage() {
		return storage;
	}
	
	public void setStorage(int storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {

		return super.toString() 
				+ "\nIMEI code: " + getIMEI()
				+ "\nStorage: " + getStorage() + "gb";
	}
	
}
