package generation.italy.shop;

public class Cuffie extends Prodotto{

	String colore;
	boolean areWifi;
	
	public Cuffie(String marca, int prezzo ,String colore, boolean areWifi) {
		
		super(marca, prezzo);
		this.colore = colore;
		this.areWifi = areWifi;

	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isAreWifi() {
		return areWifi;
	}

	public void setAreWifi(boolean areWifi) {
		this.areWifi = areWifi;
	}
	
	
	
}
