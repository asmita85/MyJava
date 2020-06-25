package MyJavaPractices;

public class shopping {


		public static void main(String[] args) {
			String[] items = {"phone","computer","tv"};
			double[] unitPrice = {599.99,1099.99,2149.99};
			double[] quantities = {1,2,2};
			int[] quantity = {1,2,2};

			showCart1(items, unitPrice, quantities);
			showCart2(items, unitPrice, quantity);

		
			}
		public static void showCart1(String[] items, double[] unitPrice, double[] quantities){
			double subTotal =0;
			double taxRate = 7.5;
			for(int i=0; i<unitPrice.length; i++){
				double itemTotal =unitPrice[i]*quantities[i];
			    subTotal = subTotal+(itemTotal);
			    System.out.printf("%-20s %.2f %-2s %.0f %-2s %.2f%n",items[i],unitPrice[i],"",quantities[i],"",itemTotal);
			}
			System.out.println();
		    System.out.printf("%-35s %.2f%n","   Sub-Total",subTotal);
	        double tax = (subTotal*taxRate)/100;
			System.out.printf("%-35s %.5f%n","   Tax",tax);
			double total = subTotal+tax;
			System.out.printf("%-35s %.5f%n","   Total",total);
		
		}
		
		public static void showCart2(String[] items, double[] unitPrices, int[] quantities){
			
			
			double subTotal =0;
			double taxRate = 6.5;
			
			//define column parameters
			int itemMax= 15;
			int priceMax = 8;
			int quantityMax = 8;
			int totalLength= itemMax+priceMax+quantityMax;
			
			for(int i=0; i<items.length; i++){
				String item = items[i];
				double unitPrice = unitPrices[i];
				int quantity = quantities[i];
				double itemTotal =unitPrice*quantity;
			    subTotal = subTotal+(itemTotal);
			    
			    
				System.out.print(item);
				addSpaces(itemMax,item.length());
				System.out.print(unitPrice);
				addSpaces(priceMax,String.valueOf(unitPrice).length());
				System.out.print(quantity);
				addSpaces(quantityMax,String.valueOf(quantity).length());
				System.out.print("$"+itemTotal);
				System.out.println();
			}
	        double tax = subTotal*(taxRate/100);
	        double total = subTotal+tax;
			System.out.println();
			 String sub = " Sub-Total:";
	        System.out.print(" Sub-Total:");
	        addSpaces(totalLength,sub.length());
	        System.out.print("$"+subTotal);       
	        String t1 = " Tax:";  
	        System.out.print("\n Tax:");
	        addSpaces(totalLength,t1.length());
	        System.out.print("$"+tax);
	        String t2 = " Total:";
	        System.out.print("\n Total:");
	        addSpaces(totalLength,t2.length());
	        System.out.print("$"+total);
	        
	        
		
		}

		//max is the length allocated for each column
		//occupied is length already used
		public static void addSpaces(int max , int occupied){
			for (int i=0; i<max-occupied; i++){
				System.out.print(" ");
			}
			
		

	}

}
