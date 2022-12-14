package generation.italy.shop;

public class Tv extends Product{

	int inches;
	boolean isSmartTv;
	
	public Tv(String brand, int price, int inches, boolean isSmartTv) {
		
		super(brand, price);
		this.inches = inches;
		this.isSmartTv = isSmartTv;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public boolean getIsSmartTv() {
		return isSmartTv;
	}

	public void setSmartTv(boolean isSmartTv) {
		this.isSmartTv = isSmartTv;
	}
	
	@Override
	public String toString() {

		return super.toString()
				+ "\nInches: " + getInches()
				+ "\nSmart tv: " + getIsSmartTv();
	}
	
}
