public class PatternE{
	public static void main(String [] args){
		System.out.println("PATTERN E");

		for(int row = 1; row <= 6; row++){
			for(int column = 1; column <= row; column++){
				System.out.print("  ");
			}
			for(int right = row; right < 6; right++){
				System.out.print("* ");
			}
			for(int right = row; right <= 6; right++){
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}