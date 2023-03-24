package product;

import java.util.Scanner;


public class ProductDAO {
	
	Scanner sc=new Scanner(System.in);
	public Product create() {
		Product b= new Product();
		
		System.out.println("Please enter Product id");
		b.setID(sc.nextInt());
		System.out.println("Please enter Product name");
		b.setName(sc.next());
		System.out.println("Please enter price");
		b.setPrice(sc.nextInt());
		
		
		return b;
		
	}
	
	public void read(Product products[] ) {
		System.out.println("\n");
		for(Product product:products) {
			if(product==null) {
				continue;
			}
			System.out.println("productID:" + product.getID()+ 
					" product Name:" + product.getName()+ " product Price:" + product.getPrice());
		}
		System.out.println("\n");

		
		
	}
	
	public void update(Product products[]) {
		System.out.println("Enter productID you wish to update");
		int uid= sc.nextInt();
		
		for(Product product: products) {
			if(uid==product.getID()) {
				String oldname= product.getName();
				int price= product.getPrice();
				System.out.println("product: " + product.getName() + " with a price of " + product.getPrice());
				System.out.println("Please new product name");
				product.setName(sc.next());
				System.out.println("Please enther new price");
				product.setPrice(sc.nextInt());
				
				System.out.println("\n"+oldname + " "+ price+" "+ " -> 4" + product.getName()+ " "+ product.getPrice()+ "\n");	
				break;
			}
		
		}
		
		
		
	}
	
	public void delete(Product products[]) {
		
		read(products);
		
		System.out.println("Please enter productid you wish to delete");
		int uid=sc.nextInt();
		
		for(int i=0;i< products.length;i++) {
			if(uid==products[i].getID()) {
				System.out.println("Delete this product?(Y/N)\n");
				System.out.println("Name:" + products[i].getName() + " " +products[i].getPrice());
				String yn= sc.next();
				if(yn.equals("Y")) {
					products[i]=null;
					break;
				}
				else {
					System.out.println("Returning to menu");
				}
			}
			
			
		}
	}

}
