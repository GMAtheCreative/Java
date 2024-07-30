import java.util.Scanner;
public class LagbajaSchools{
	public static void main(String... args){

		Scanner collect = new Scanner(System.in);

		System.out.println("How many student do you have?");
		int numberOfStudent = collect.nextInt();

		System.out.println("How many subject do they offer?");
		int subjectTheyOffer = collect.nextInt();

		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>...");
		System.out.println("Successfully saved");
		System.out.println("===================================");

		System.out.println("Entering scores for student 1");

		for(int counter = numberOfStudent; counter <= subjectTheyOffer; counter++){
			System.out.print("me" + "");
		}


		
	}
}