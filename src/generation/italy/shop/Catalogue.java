package generation.italy.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Select product type: ");
		String choice = sc.nextLine().toLowerCase();
		Product[] products = new Product[2];
		
		for (int i = 0; i < products.length; i++) {
			
			System.out.println("Brand: ");
			String brand = sc.next();
			System.out.println("Price: ");
			int price = sc.nextInt();
			
			if(choice.equals("phone")) {
				
				System.out.println("Storage: ");
				int storage = sc.nextInt();
				
				products[i] = new Smartphone(brand, price, storage);
				
			}else if(choice.equals("headphones")) {
				
				System.out.println("Color: ");
				String color = sc.next();
				
				System.out.println("Are wifi or wired? ");
				boolean areWifi = sc.nextBoolean();
				
				products[i] = new Headphones(brand, price, color, areWifi);
				
			}else if(choice.equals("tv")) {
				
				System.out.println("Inches: ");
				int inches = sc.nextInt();
				
				System.out.println("Is a smart tv? ");
				boolean isSmartTv = sc.nextBoolean();
				
				products[i] = new Tv(brand, price, inches, isSmartTv);
				
			}
			
		}
		sc.close();
		
		System.out.println(Arrays.toString(products));
		
	}
	
}
