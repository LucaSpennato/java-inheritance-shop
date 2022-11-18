package generation.italy.shop;

public class Headphones extends Product{

	String color;
	boolean areWifi;
	
	public Headphones(String brand, int price ,String color, boolean areWifi) {
		
		super(brand, price);
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
	
	private String areWifiOrWired() {
		return areWifi ? "Wifi" : "Wired";
	}
	
	@Override
	public String toString() {

		return super.toString()
				+ "\nColor: " + color
				+ "\nType: " +  areWifiOrWired();
	}
	
}
