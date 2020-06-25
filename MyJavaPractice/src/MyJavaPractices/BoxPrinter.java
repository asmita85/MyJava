package MyJavaPractices;


public class BoxPrinter {

	public static void main(String[] args) {
		int height = 4;
		int width = 10;
		printBox(height,width);

	}
	public static void printBox(int height, int width){
		for (int i=0; i<width; i++ ){
			System.out.print("*");
			}
		
		System.out.println();
		    
		    
		for (int j = 0 ; j< height-2;j++){
			System.out.print("*");
				  for (int z=0; z<width-2; z++){
				      System.out.print(" ");
				      }
				      
		System.out.print("*");
	    System.out.println();	
			
		    }
			
		for (int i=0; i<width; i++ ){
				System.out.print("*");
				}
			
				
			
		
		 
		
	    
			
	}

}
