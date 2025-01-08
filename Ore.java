import java.util.Scanner;

public class Ore {

  public static void main(String [] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter your first number: ");
  int number = input.nextInt();

  System.out.print("Enter your second number: ");
  int number2 = input.nextInt();

  int squared1 = number * number;
  int squared2 = number2 * number2;
  int sum = squared1 + squared2;
  int difference = squared1 - squared2;

  System.out.println("The square of the first number is: " + squared1);
  System.out.println("The square of the second number is: " + squared2);
  System.out.println("The sum of the squared numbers is: " + sum);
  System.out.println("The difference of the squared numbers is: " + difference);

	}

}