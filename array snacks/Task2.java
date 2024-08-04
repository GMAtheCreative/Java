public class Task2{
	public static int [] reverseOfArray(int[] number){

		int newNumber = 0;
		int digit = 0;
		int reverse = 0;
		int index = 0;
	
		while (number !=0){

			newNumber = number % 10;
			reverse =  reverse *10 + newNumber;
			number /= 10;
		}
	}
}