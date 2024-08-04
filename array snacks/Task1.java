public class Task1{
	public static int largestElement(int [] numbers){
		int largestNumber = 0;
		for(int index = 0; index < numbers.length; index++){

			if(numbers[index] > numbers[index + 1]){
				largestNumber = numbers[index];
			}
		}
		return largestNumber;
	}
}