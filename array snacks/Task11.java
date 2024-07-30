public class Task11 {

	public static int[] takesNumberReturnList (int number){
		int [] numberList = new int[String.valueOf(number).length()];

		int newNumber = 0;
		int digit = 0;
		int reverse = 0;
		int index = 0;
	
		while (number !=0){

			newNumber = number % 10;
			reverse =  reverse *10 + newNumber;
			number /= 10;
			
		}
		while (reverse != 0){
			digit = reverse % 10;
			numberList[index] = digit;
			reverse /= 10;
			index++;
		}

		return numberList;
	}
}
