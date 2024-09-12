		import java.util.Scanner;
public class Score{
	public static void main(String[] args){

		Scanner collect = new Scanner(System.in);

		int counter = 1;
		int total = 0;

		while(counter <= 10){
			System.out.println("Enter number: ");
			int score = collect.nextInt();
			total = total + score;
			
		counter++;
		}
		System.out.println(total);