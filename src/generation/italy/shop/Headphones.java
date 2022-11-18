package generation.italy.shop;

public class Headphones extends Product{

	String color;
	boolean areWifi;
	
	public Headphones(String marca, int prezzo ,String color, boolean areWifi) {
		
		super(marca, prezzo);
		this.color = color;
		this.areWifi = areWifi;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAreWifi() {
		return areWifi;
	}

	public void setAreWifi(boolean areWifi) {
		this.areWifi = areWifi;
	}
	
	
	
}
