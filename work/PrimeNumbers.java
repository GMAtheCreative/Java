import java.util.Scanner;
public class PrimeNumbers{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter a number");

		int number = collect.nextInt();
		int count = 0;
		int counter;
	
		for(counter = 2; counter <= number; counter++){

			int theFactors = (number % counter);
				

			if(theFactors == 0)
			count ++;
			  
		}
		System.out.println(count);
		
		if (count <= 1)
			System.out.println("this number is a prime number");

		else
			System.out.println("this number is not a prime number");
		
	}
}
