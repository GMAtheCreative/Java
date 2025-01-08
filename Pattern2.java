<<<<<<< HEAD
public class Pattern2{
	public static void main(String [] args){


		int num = 6;
		int counter = 1;

		for(int row = 1; row<=num; row++){
			for(int column = row; column <= num; column++){
				
				System.out.print(counter++ + " ");
			}

			System.out.println();
		}
	}

=======
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

>>>>>>> 50de994c495377abf8463a1fa6587df1b4de112a
}