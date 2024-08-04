public class ArrayFunctions{
	
	public static int addNumbersInList(int [] numbers){
		
		int sumOfAList = 0;
		for(counter = 0; counter < numbers.length; counter++){
			sumOfAList += numbers[counter];
		}
		return sumOfAList;
	}

	public static double averageOfNumbersInAList(int [] numbers){
		
		int sumOfAList = 0;
		int averageOfList = 0;
		int counter = 0;
		for(counter = 0; counter < numbers.length; counter++){
			sumOfAList += numbers[counter];
			averageOfList = sumOfAList / counter;
		}
		return averageOfList;
	}
}