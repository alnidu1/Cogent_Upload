package product;

import java.util.Scanner;



public class main {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		Product products[]=new Product[10];
		ProductDAO pdao= new ProductDAO();
	
	
		int choice=0;
	
		do {
			System.out.println("========MENU=========");
			System.out.println("1.Create Record\n2.Read Record\n3.Update Record\n4.Delete Record\n5.Exit\n\n Please Enter Menu Option");
			choice=sc.nextInt();
			
			switch(choice) {
				case 1:
					
					for(int i=0;i< products.length;i++) {
						if(products[i]==null) {
							products[i]=pdao.create();
							System.out.println("Product "+ products[i].getName()+ " is added\n");
							break;
						}
						
					}
					
					break;
				case 2:
					pdao.read(products);
					break;
				case 3:
					pdao.update(products);
					break;
				case 4:
					pdao.delete(products);
					break;
				default:
					System.out.print("Enter valid option 1-5\n");

			}
		
			
		}while(choice!=5);
	}

}
