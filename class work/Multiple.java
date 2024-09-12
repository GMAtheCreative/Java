import java.util.Scanner;
public class Multiple{
	public static void main(String [] args){


	Scanner collect = new Scanner(System.in);

	System.out.println("Enter your first number");
	int firstNum = collect.nextInt();

	System.out.println("Enter your second number");
	int secondNum = collect.nextInt();

	int tripled = firstNum * firstNum * firstNum;
	int doubled = secondNum * secondNum;

	if (tripled % doubled == 0){
		System.out.println("the triple of te first number is a multiple of the double of the second number");
		}
	}


}