public class PatternB{
	public static void main(String [] args){
		System.out.println("PATTERN A");

		for(int row = 1; row <= 6; row++){
			for(int column = row; column <= 6; column++){
				System.out.print("*");
				
			}

			System.out.println();
		}
	}
}