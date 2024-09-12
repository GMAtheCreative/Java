import java.util.Scanner;
public class Stage2{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter your Grade in number:");
		int grade = collect.nextInt();

		if(grade >= 80){
			System.out.println("Your grade is: A");
		}
		if(grade >= 70 && grade <= 79){
			System.out.println("Your grade is: B");
		}
		if(grade >= 60 && grade <= 69){
			System.out.println("Your grade is: C");
		}
		if(grade >= 50 && grade <= 59){
			System.out.println("Your grade is: D");
		}
		if(grade >= 40 && grade <= 49){
			System.out.println("Your grade is: E");
		}
		if(grade <= 39){
			System.out.println("Your grade is: F");
		}

	}

}