package generation.italy.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private  String marca;
	private int prezzo;
	static final int iva = 20;

	public Prodotto(String marca, int prezzo) {
		
		this.marca = marca;
		this.prezzo = prezzo;
		setCodice();
		
	}

	public int getCodice() {
		return codice;
	}

	final private void setCodice() {
		Random rnd = new Random();
		this.codice = rnd.nextInt(999999);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public int getPriceWithIva() {
		return prezzo + (prezzo * iva / 100);
	}
	
	
	
}
