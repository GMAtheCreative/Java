import java.util.Scanner;
public class LargestSmallest{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.print("Enter your first number:");
		int firstNum = collect.nextInt();

		System.out.println("Enter your second number:");
		int secondNum = collect.nextInt();

		System.out.println("Enter your third number");
		int thirdNum = collect.nextInt();

		System.out.println("Enter your forth number");
		int forthNum = collect.nextInt();

		System.out.println("Enter your fifth number");
		int fifthNum = collect.nextInt();

		if (firstNum > secondNum && firstNum > thirdNum && firstNum > forthNum && firstNum > fifthNum){
			System.out.println("Fist number is the biggest");
		}
		if (secondNum > firstNum && secondNum >thirdNum && secondNum > forthNum && secondNum > fifthNum){
			System.out.println("Second number is the biggest");
		}
		if (thirdNum > firstNum && thirdNum > secondNum && thirdNum > forthNum && thirdNum > fifthNum){
			System.out.println("Third number is the biggest");
		}
		if (forthNum > firstNum && forthNum > secondNum && forthNum > thirdNum && forthNum > fifthNum){
			System.out.println("Forth number is the biggest");
		}
		if (fifthNum > firstNum && fifthNum > secondNum && fifthNum > thirdNum && fifthNum > forthNum){
			System.out.println("Fifth number is the biggest");
		}
		if (firstNum < secondNum && firstNum < thirdNum && firstNum < forthNum && firstNum < fifthNum){
			System.out.println("Fist number is the smallest");
		}
		if (secondNum < firstNum && secondNum < thirdNum && secondNum < forthNum && secondNum < fifthNum){
			System.out.println("Second number is the smallest");
		}
		if (thirdNum < firstNum && thirdNum < secondNum && thirdNum < forthNum && thirdNum < fifthNum){
			System.out.println("Third number is the smallest");
		}
		if (forthNum < firstNum && forthNum < secondNum && forthNum < thirdNum && forthNum < fifthNum){
			System.out.println("Forth number is the smallest");
		}
		if (fifthNum < firstNum && fifthNum < secondNum && fifthNum < thirdNum && fifthNum < forthNum){
			System.out.println("Fifth number is the smallest");
		}
	}

}