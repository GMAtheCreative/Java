public class Pattern1{
	public static void main(String [] args){


		int num = 6;

		for(int row = 1; row<=num; row++){
			for(int column = 1; column <= row; column++){
				System.out.print(column);
			} 
			System.out.println();
		}
	}

}