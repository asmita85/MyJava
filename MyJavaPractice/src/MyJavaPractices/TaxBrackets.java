package MyJavaPractices;

public class TaxBrackets {

		public static void main(String[] args) {
	          double income = 400000;
	 	
	         System.out.print("Effective Rate: "+String.format("%.2f",findTax(income))+"%");
		}
	    public static double findTax(double income){
		       double tax = 0;
		       int rate1 = 20000;
		       int rate2 = 70000;
		       int rate3 = 150000;
		       int rate4 = 250000;
		       int rate5 = 400000;
		       int rate6 = 500000;
		    
		     
		         
		    if (income >= rate1){
	    		double tax1 = rate1*10/100;
	    		System.out.println("tax1: "+tax1);
	    		tax= tax1;
	    	}else{
	    		tax =  (income*10)/100;
	    		   
	    	}
	    	   	
	    	
	    	if (income>rate1){
	    		if ((income-rate1)<0 || (income-rate1)<(rate2-rate1)){
	    	    double tax2 = ((income- rate1)*20)/100;
	    		//System.out.println("tax2:<0 "+tax2);
	            tax=tax+tax2;
	    		}
	    		else {
	    			double tax2 =((rate2-rate1)*20)/100;
	        		//System.out.println("tax2:>0 "+tax2);
	        		tax = tax+tax2;
	    		}
	    	}
	    	
	    	
	    	if (income>=rate2){
	    		if ((income-rate2)<0||(income-rate2)<(rate3-rate2)){
	    		    double tax3 = ((income-rate2) *30)/100;
	    		   // System.out.println("tax3: <0 "+tax3);
	        		tax=tax+tax3;

	    		}
	            else {
	            	double tax3=((rate3-rate2)*25)/100;
	    		    //System.out.println("tax3: >0 "+tax3);
	        		tax=tax+tax3;

	    		}
	    	 }
	    		
	    		if (income>=rate3){
	    			if ((income-rate3)<0||(income-rate3)<(rate4-rate3)){
	        		    double tax4 = ((income-rate3) *35)/100;
	        		   // System.out.println("tax4: <0 "+tax4);
	            		tax=tax+tax4;

	        		}
	                else {
	                	double tax4=((rate4-rate3)*35)/100;
	        		   // System.out.println("tax4: >0 "+tax4);
	            		tax=tax+tax4;

	        		}
	        		
	    		}
	    		if (income>=rate4){
	    			if ((income-rate4)<0||(income-rate4)<(rate5-rate4)){
	        		    double tax5 = ((income-rate4) *40)/100;
	        		    //System.out.println("tax5: <0 "+tax5);
	            		tax=tax+tax5;

	        		}
	                else {
	                	double tax5=((rate5-rate4)*40)/100;
	        		    //System.out.println("tax5: >0 "+tax5);
	            		tax=tax+tax5;

	        		}
	        		
	    		}
	    		if (income>=rate5){
	    			if ((income-rate5)<0||(income-rate5)<(rate6-rate5)){
	        		    double tax6 = ((income-rate5) *45)/100;
	        		    //System.out.println("tax6: <0 "+tax6);
	            		tax=tax+tax6;

	        		}
	                else {
	                	double tax6=((rate6-rate5)*45)/100;
	        		   // System.out.println("tax6: >0 "+tax6);
	            		tax=tax+tax6;

	        		}
	        		
	    		}
	    		
	    		if (income> rate6){
	    			if ((income-rate2)>0){
	        		    double tax7 = ((income-rate6) *.525);
	        		    //System.out.println("tax7: <0 "+tax7);
	            		tax=tax+tax7;

	        		}
	                
	    			
	    		}	
	    		System.out.println("Tax Burden: " +tax);
	    		Double effectiveRate = (tax/income)*100;
	    		return effectiveRate; 
		
	    
	    }

	        	
	}
	    	
	    		
	    
	    



