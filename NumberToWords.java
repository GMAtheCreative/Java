import java.util.Scanner;
public class NumberToWords{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		
		System.out.println("Enter any number from 1-10. or \"0\" to stop the program");
		int number = collect.nextInt();

		while(number != 0){
			
			if (number == 1)
				System.out.println("ONE");

			else if (number == 2)
				System.out.println("TWO");

			else if (number == 3)
				System.out.println("THREE");

			else if (number == 4)
				System.out.println("FOUR");

			else if (number == 5)
				System.out.println("FIVE");

			else if (number == 6)
				System.out.println("SIX");

			else if (number == 7)
				System.out.println("SEVEN");

			else if (number == 8)
				System.out.println("EIGHT");

			else if (number == 9)
				System.out.println("NINE");

			else if (number == 10)
				System.out.println("TEN");

			else 
				System.out.println("Invalid input");

		System.out.println("Enter next number from 1-10. or \"0\" to stop the program");
		number = collect.nextInt();
		}
	}
}