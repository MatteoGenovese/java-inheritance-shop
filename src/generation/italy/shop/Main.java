package generation.italy.shop;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		Random rnd = new Random();
		Product[] products= new Product[3];
		
		String optionStr;
		int option=0;


		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("cosa desideri fare:\n1-Inserimento di un nuovo prodotto\n2-Visualizzazione del catalogo");
			optionStr = sc.nextLine();
			option = Integer.parseInt(optionStr);
			
			if(option==1)
			{
				for(int i=0;i<products.length;i++) {
					
					
				
					System.out.println("che prodotto vuoi inserire:\n1-Smartphone\n2-Television\n3-Headphones");
					String productTypeStr = sc.nextLine();
					int productType = Integer.parseInt(productTypeStr);
					
				
					if(productType==1) {
						
						System.out.print("name of the product:");
						String name = sc.nextLine();
						
						System.out.print("name of the brand:");
						String brand = sc.nextLine();
						
						System.out.println("price:");
						String priceStr = sc.nextLine();
						float price = Float.parseFloat(priceStr);
						
						System.out.print("IMEI code:");
						String IMEICode = sc.nextLine();
						
						products[i]= new Smartphone(rnd.nextInt(10000-1000)+1000, name, brand, price, IMEICode);
						System.out.println(products[i]);
						
					}
					if(productType==2) {
						
						System.out.print("name of the product:");
						String name = sc.nextLine();
						
						System.out.print("name of the brand:");
						String brand = sc.nextLine();
						
						System.out.println("price:");
						String priceStr = sc.nextLine();
						float price = Float.parseFloat(priceStr);
						
						System.out.println("height:");
						String heightStr = sc.nextLine();
						int height = Integer.parseInt(heightStr);
						
						System.out.println("width:");
						String widthStr = sc.nextLine();
						int width = Integer.parseInt(widthStr);
						
						System.out.println("isSmart:");
						String isSmart = sc.nextLine();
						
						products[i]= new Television(rnd.nextInt(10000-1000)+1000, name, brand, price, height, width, isSmart);
						System.out.println(products[i]);
						
					}
					if(productType==3) {
						
						System.out.print("name of the product:");
						String name = sc.nextLine();
						
						System.out.print("name of the brand:");
						String brand = sc.nextLine();

						System.out.println("price:");
						String priceStr = sc.nextLine();
						float price = Float.parseFloat(priceStr);

						System.out.println("color:");
						String color = sc.nextLine();
						
						System.out.println("areWireless:");
						String areWireless = sc.nextLine();
						
						System.out.println("areCabled:");
						String areCabled = sc.nextLine();
				
						products[i]= new Headphones(rnd.nextInt(10000-1000)+1000, name, brand, price, color, areWireless, areCabled);
						System.out.println(products[i]);
						
					}
					if(productType!=1 && productType!=2 && productType!=3)
					{
						System.out.println("Scelta non corretta, ritorno al menu principale.....");
						System.out.println("");
						
					}
					
					
					
					
				}
				
				
				
				
			}
			
			if(option==2)
			{
				
				for(int i=0;i<products.length;i++) {
					System.out.println(products[i]);
					
				}
				
			}
			
//			sc.close();
			
			
			
			
		}
		
		


		
//		System.out.print("description: ");
//		String description = sc.nextLine();
//		
//		System.out.print("price: ");
//		float price = sc.nextFloat();
		

	}

}
