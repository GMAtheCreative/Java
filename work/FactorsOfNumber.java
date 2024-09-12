import java.util.Scanner;
public class FactorsOfNumber{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter a number");

		int number = collect.nextInt();
		int count = 0;
		int counter;
	
		for(counter = 2; counter <= number; counter++){

			int theFactors = (number % counter);
				

			if (counter * counter == number)
			System.out.println(number);  
		}
		
		
		
		
	}
}
