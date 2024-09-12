import java.util.Scanner;
public class Stage5{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter your Grade in number:");
		
		int counter = 1;
		
		while(counter <= 5){
			
			int grade = collect.nextInt();
			
			if(grade >= 80){
				System.out.println("Your grade is: A");
			}
			else if(grade >= 70){
				System.out.println("Your grade is: B");
			} 
			else if(grade >= 60){
				System.out.println("Your grade is: C");
			}
			else if(grade >= 50){
				System.out.println("Your grade is: D");
			}
			else if(grade >= 40){
				System.out.println("Your grade is: E");
			}
			else if(grade <= 30){
				System.out.println("Your grade is: F");
			}
			counter = counter + 1;
		}
	}
}