package homework2;

import java.util.Scanner;

public class positiveOrNegative {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			int Number;
			Scanner number = new Scanner(System.in);
			System.out.println("Application to identify Positve or Negative Number");
			System.out.println("Please enter number");
			Number = number.nextInt();
			System.out.println("You enterd "+Number);
			
			if(Number<0){
			System.out.println(" The number you entered is Negative");
			}else {
			System.out.println(" The number you entered is Positive");
	        
			}
			System.out.println(" Thank you for using the Application");
	}
}
