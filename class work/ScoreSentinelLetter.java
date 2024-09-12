import java.util.Scanner;
public class ScoreSentinelLetter{
	public static void main(String[] args){

		Scanner collect = new Scanner(System.in);

		
		int total = 0;

		System.out.println("Enter the score or NO to quit: ");
		String input = collect.next();

		while(!input.equalsIgnoreCase("no")){
		
		int score = integer.parseInt(input);
		total = total + score;
			
		input = collect.next();
		}
		System.out.println(total);
}
}