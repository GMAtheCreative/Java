import java.util.Scanner;
public class Arithmetic{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	int square1 = firstNumber * firstNumber;
	int square2 = secondNumber * secondNumber;
	int sum = square1 + square2;
	int difference = square1 - square2;

	System.out.printf("the square of number 1 and 2 is %d, %d%n", square1, square2);
	System.out.printf("the sum and difference of the square of number 1 and 2 is %d, %d", sum, difference);

	}

}