package generation.italy.shop;

public class Catalogue {

	public static void main(String[] args) {
		
		Tv tv = new Tv("Samsung", 259, 32, true);
		Headphones hp = new Headphones("Xiaomi", 19, "white", true);
		Smartphone sm = new Smartphone("Nokia", 289, 64);
		
		System.out.println(tv);
		System.out.println("------------------------------");
		System.out.println(hp);
		System.out.println("------------------------------");
		System.out.println(sm);
		
	}
	
}
