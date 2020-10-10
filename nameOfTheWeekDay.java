package homework2;
import java.util.Scanner;
public class nameOfTheWeekDay {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Number;
		Scanner number = new Scanner(System.in);
		System.out.println("Application to identify Day of the Week by entering a number");
		System.out.println("Please enter number");
		Number = number.nextInt();
		System.out.println("You enterd "+Number);
		
		if(Number==1){
		System.out.println(" The day is Sunday");
		}else if(Number==2){
			System.out.println(" The day is Monday");
		}else if(Number==3){
			System.out.println(" The day is Tuesday");
		}else if(Number==4){
			System.out.println(" The day is Wednesday");
		}else if(Number==5){
			System.out.println(" The day is Thursday");
		}else if(Number==6){
			System.out.println(" The day is Friday");
		}else if(Number==7){
			System.out.println(" The day is Saturday");
		}
		else 
			System.out.println(" The number you entered is invalid, cannot relate to the day of the week. Please enter a number from 1 to 7 to find the right day of the week");
		
		System.out.println(" Thank you have a nice day ");
	}
		
}
