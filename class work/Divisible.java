import java.util.Scanner;
public class Divisible{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = collect.nextInt();

		int remainder = number % 3;

		if (remainder == 0){
		System.out.println("Number is divisible by 3");
		}
		if (remainder >= 1){
		System.out.println("Number is not divisible by 3");
		}

	}

}