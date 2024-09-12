import java.util.Scanner;

public class LargestSmallest2 {
 	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;


		System.out.println("Enter your values or -1 to stop");
			
		while(true) {
			int number = collect.nextInt();
			if (number > largest){
				largest = number;
			}
			if (number < smallest && number != -1){
				smallest = number;
			}
			if (number == -1){
				break;
			}
		}
		System.out.println("your largest number is " + largest);
		System.out.print("your smallest number is " + smallest);

	}     
}