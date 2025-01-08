<<<<<<< HEAD
public class PatternC{
	public static void main(String [] args){
		System.out.println("PATTERN C");

		for(int row = 1; row <= 6; row++){
			for(int column = row; column <= 6; column++){
				System.out.print("  ");
			}
			for(int right = 1; right <= row; right++){
				System.out.print("* ");
			}

			System.out.println();
		}
	}
=======
public class PatternC{
	public static void main(String [] args){
		System.out.println("PATTERN C");

		for(int row = 1; row <= 6; row++){
			for(int column = row; column <= 6; column++){
				System.out.print("  ");
			}
			for(int right = 1; right <= row; right++){
				System.out.print("* ");
			}

			System.out.println();
		}
	}
>>>>>>> 50de994c495377abf8463a1fa6587df1b4de112a
}