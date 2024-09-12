import java.util.Scanner;
public class Factoral{
	public static void main(String... args){
		Scanner collect = new Scanner(System.in);
		int factoral = 1;
		int number = collect.nextInt();
		for (int counter = 1; counter <= number; counter++){
			factoral *= counter;
		
			
		}
		System.out.println(factoral);
	}

}