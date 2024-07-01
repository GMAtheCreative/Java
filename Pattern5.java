public class Pattern5{
	public static void main(String [] args){


		int num = 6;

		for(int row = 1; row<=num; row++){
			for(int column = row; column <= num; column++){
				System.out.print("  ");
			}
			for(int column = 1; column < row; column++){
				System.out.print("* ");
			}
			for(int side = 1; side <= row; side++){
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}