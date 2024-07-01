public class Pattern2{
	public static void main(String [] args){


		int num = 6;
		int counter = 1;

		for(int row = 1; row<=num; row++){
			for(int column = row; column <= num; column++){
				counter =1;
				System.out.print(counter++ + " ");
			}

			System.out.println();
		}
	}

}