import java.util.Scanner;
public class Stage4{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter your Grade in number:");
		int grade = collect.nextInt();

		switch(grade){
			case 80:
			System.out.println("Your grade is: A");
			break;

			case 70:
			System.out.println("Your grade is: B");
			break;

			case 60:
			System.out.println("Your grade is: C");
			break;

			case 50:
			System.out.println("Your grade is: D");
			break;

			case 40:
			System.out.println("Your grade is: E");
			break;

			case 30:
			System.out.println("Your grade is: F");
			break;
		}
	}

}