package MyJavaPractices;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		//to give only 10 times trial for guesser
		Random rand = new Random();
		int a = rand.nextInt(10);	
		//or int a= (int) (Math.random())*10+1;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int i=0;
		String num;
		int number=0;
		System.out.println("You have only 10 chance");
		System.out.println("guess a number between 0 and 10: "+a);

			do {
				try {	
		num = in.nextLine();
		number = Integer.parseInt(num);
				}catch (NumberFormatException e){
					System.out.println("Please enter a valid number");
					}

		        if (number==a){
			    System.out.println("you get it right");
				
			    i=10;
		        }else if (number>a){
			     System.out.println("Your guess was too high, try lower");
			     i++;
		        }else if (number<a ) {
		        System.out.println("Your guess was too low, try higher");
				i++;
		        }
		        	
			
		}while(i<10);			
		if (number!=a){
		System.out.println("You have reach the max trial");
		}

		
	}

	}