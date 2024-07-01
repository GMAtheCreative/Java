public class Pattern3{
	public static void main(String [] args){


		int num = 6;

		for(int row = 1; row<=num; row++){
			for(int column = 1; column <= row; column++){
				System.out.print("  ");
			} 
			for(int column = row; column <= num; column++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}