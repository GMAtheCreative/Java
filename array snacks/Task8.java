public class Task8 {
	public static int forLoopSum(int [] number){
	int sum = 0;
	int index = 0;
		for(index = 0; index < number.length; index++){
			sum += number[index];
		}
		return sum;
	}

	public static int whileLoopSum(int [] number){
	int sum = 0;
	int index = 0;
		while (index < number.length){
			sum += number[index];
			index++;
		} 
		return sum;
	}

	public static int doWhileLoopSum(int [] number){
	int sum = 0;
	int index = 0;
		do{
			sum += number[index];
			index ++;
		}while (index < number.length);

		return sum;
	}
}