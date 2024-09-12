import java.util.Scanner;
public class ScoreSentinel{
	public static void main(String[] args){

		Scanner collect = new Scanner(System.in);

		
		int total = 0;

		int counter = 0;

		for(count = 0; counter <= 10; counter++;{
		System.out.println("Enter the score : ");
		int score = collect.nextInt();

		total = total + score;
			
		}
		
		
		System.out.println(total);
	}
}