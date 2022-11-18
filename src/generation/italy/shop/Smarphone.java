package generation.italy.shop;

import java.util.Random;

public class Smarphone extends Prodotto{

	String IMEI;
	int memoria;
	
	public Smarphone(String marca, int prezzo, int memoria) {
		
		super(marca, prezzo);
		this.memoria = memoria;
		setIMEI();
	}

	public String getIMEI() {
		return IMEI;
	}

	private void setIMEI() {
		Random rnd = new Random();
		IMEI = rnd.nextInt(999999999) + "" + rnd.nextInt(99999);
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	
	
}
