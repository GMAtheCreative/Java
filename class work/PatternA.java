public class PatternA{
	public static void main(String [] args){
		System.out.println("PATTERN A");

		for(int row = 1; row <= 6; row++){
			for(int column = 1; column <= row; column++){
				System.out.print(column);
				
			}
			System.out.println();
		}
	}
}