public class Kata{

	public static boolean isEven(int number){
		if (number % 2 == 0)
			return true;
		return false;
	}

	public static boolean isPrimeNumber (int number){
		int counter = 0;
		int count;
		for(count = 2; count <= number; count++){
			if (number % count ==0)
				counter++;
		}
		if (counter == 1)
			return true;
		return false;
	}

	public static int subtract(int number1, int number2){
		if(number1 > number2)
			return number1 - number2;
		
		return number2 - number1;
	}
	
	public static float divide(int number1, int number2){
		float quotient = number1 / number2;
		return quotient;
	}

	public static int factorOf(int number){
		int counter = 0;
		int count;
		for(count = 2; count <= number; count++){
			if(number % count == 0){
				counter++;
			}
		} 
			return counter;
	}

	public static boolean isSquare(int number){
		int counter;
		for(counter =2; counter <= number; counter++){
			if (counter * counter == number){
				return true;
			}
		} 
		return false;
	}

	public static boolean isPalindrome (int number){

	int originalNumber = number;
		int reverse = 0;

		while(number != 0){
			int newNumber = number % 10;
			reverse = reverse * 10 + newNumber;
			number /= 10;
		}
		return originalNumber == reverse;
	}

	public static long factorialOf(int number){
		int factoral = 1;
		for (int counter = 1; counter <= number; counter++){
			factoral *= counter;	
		}
		return factoral;
	}




	
	
}