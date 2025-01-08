import java.util.Scanner;
public class NumberCounter{
	public static void main(String [] args){


		Scanner collect = new Scanner(System.in);
		
		int positiveNumber = 0;
		int negativeNumber = 0;
		int zeros = 0;

		System.out.println("Enter your numbers or -1 to quit:");
		int number;
		do{

			number = collect.nextInt();
			if(number > 0){
				positiveNumber++;
			}
			else if(number < 0){
				negativeNumber++;
			}
			else if(number == 0){
				zeros++;
			}	
		}
		while (number != -1);
	
		System.out.println("Positive Numbers: " + positiveNumber);
		System.out.println("Negative Numbers: " + negativeNumber);
		System.out.println("Zeros: " + zeros);
	}

}