package generation.italy.shop;

public class Televisori extends Prodotto{

	int pollici;
	boolean isSmartTv;
	
	public Televisori(String marca, int prezzo, int pollici, boolean isSmartTv) {
		
		super(marca, prezzo);
		this.pollici = pollici;
		this.isSmartTv = isSmartTv;
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public boolean isSmartTv() {
		return isSmartTv;
	}

	public void setSmartTv(boolean isSmartTv) {
		this.isSmartTv = isSmartTv;
	}
	
	
	
}
