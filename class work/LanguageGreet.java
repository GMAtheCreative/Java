import java.util.Scanner;
public class LanguageGreet{
	public static void main(String[] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter 1 to be greeted in English and any number to be greeted in Hausa");
		int greet = collect.nextInt();

		if(greet == 1)
			System.out.println("Good Morning");

		else
			System.out.println("Barka Da Safiya");

			System.out.println(greet == 1 ? "Good Morning" : "Barka Da Safiya");

		int counter = 1;
		int total = 0;

		while(counter <= 10){
			System.out.println("Enter number: ");
			int score = collect.nextInt();
			total = total + score;
			
		counter++;
		}
		System.out.println(total);	
	}
}