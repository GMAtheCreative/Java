public class DeliveryFunction {

	public static int payment1(int number){

		if(number > 1 && number < 50){
			return number * 160 + 5000;
		}

		if(number >= 50 && number < 60){
			return number * 200 + 5000;
		}

		if(number >= 60 && number < 70){
			return number * 250 + 5000;
		}

		if(number > 70 && number <= 100){
		 	return number * 500 + 5000;
		}
		
		else 
			return 0;
	}
	
}