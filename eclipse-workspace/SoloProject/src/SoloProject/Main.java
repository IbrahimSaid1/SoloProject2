package SoloProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sca= new Scanner(System.in);
		
		
		boolean condition =true;
		while(condition) {
			
			System.out.println("1. Shop Settings");
			System.out.println("2. Manage Shop Items");
			System.out.println("3. Create New Invoice");
			System.out.println("4. Report: Statistics");
			System.out.println("5. Report: All Invoices");
			System.out.println("6. Search");
			System.out.println("7. Program Statistics");
			System.out.println("8. Exit");
			
			int a= sca.nextInt();
			
			if(a==1) {
				boolean condition1= true;
				while(condition1) {
				System.out.println("1. Load Data");
				System.out.println("2. Set Shop Name");
				System.out.println("3. Set Invoice Header");
				System.out.println("4. Go Back");
				
				int b= sca.nextInt();
				if(b==1) {
					System.out.println("Enter number of items: ");
					int no= sca.nextInt();
					
					System.out.println("Enter items: ");
					for(int i=0; i<=no; i++) {
						String items= sca.next();
						
					}
				}
				
				if(b==2) {
					
				}
				
				if(b==3) {
					
				}
				
				if(b==4) {
					
					condition1= false;
				}
				}
			}

		}
		
		
	
		
		
	}

}




//System.out.print("Please enter customer name: ");
//String customerName= sca.next();
//System.out.print("Please enter customer phone number: ");
//int phoneNumber= sca.nextInt();
//System.out.print("Please enter invoice date: ");
//char invoiceDate= sca.next().charAt(0);
//
//ShopSetting obj1= new ShopSetting();
//
//
