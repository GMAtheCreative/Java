import java.util.Scanner;
public class ReadingNumbers{
	public static void main(String [] args){


		Scanner collect = new Scanner(System.in);
		int counterSum = 0;

		System.out.println("Enter a number: ");
		int finalNumber = collect.nextInt();

		do{
			int nextNum = collect.nextInt();
			counterSum += nextNum;
		}
		while (counterSum < finalNumber);
		
		
		System.out.println("You've reached the number limit");
	}

}