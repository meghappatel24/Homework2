package homework2;
import java.util.Scanner;
public class printGreatestNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			int a,b,c;
			Scanner number = new Scanner(System.in);
			System.out.println("Application to identify The greatest of 3 numbers entered");
			System.out.println("Please enter your first number");
			a = number.nextInt();
						System.out.println("You enterd "+a);
						System.out.println("Please enter your second number");
			b = number.nextInt();
			System.out.println("You enterd "+b);
			System.out.println("Please enter your third number");
			c = number.nextInt();
			System.out.println("You enterd "+c);
			
			int d = maxfunction(a,b,c);
			
			
			System.out.println("The greater number from all 3 is number "+d);
			System.out.println(" Thank you for using the Application");		
	}

	public static int maxfunction(int n1, int n2, int n3) {
				// TODO Auto-generated method stub
		int d = 0;
		int max=d;
		if(n1>n2)
			 if (n1>n3)
				max = n1;
	    else if (n2>n3)
			 if (n2>n1)
				max = n2;
			if (n3>n1)
				if (n3>n2)
				max= n3;
		return max;
	}
	
}
	

