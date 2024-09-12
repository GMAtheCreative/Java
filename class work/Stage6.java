import java.util.Scanner;
public class Stage6{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter your Grade in number or -1 to quit");
		int grade = collect.nextInt();
		
		
		
		while(grade != -1){
			
		
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
			grade = collect.nextInt();
		}
	}
}