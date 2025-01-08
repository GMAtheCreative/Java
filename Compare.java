import java.util.Scanner;
public class Compare{
	public static void main(String [] args){

	Scanner compare = new Scanner(System.in);

	System.out.println("Enter 1 number: ");
	int number = compare.nextInt();

	if (number == 100){
		System.out.printf("%d is Equals to 100%n", number);
		}
	if (number != 100){
		System.out.printf("%d is not equals to 100%n", number);
		}
	if (number < 100){
		System.out.printf("%d is lesser than 100%n", number);
		}
	if (number > 100){
		System.out.printf("%d is is greater than 100%n", number);
		}
	if (number <= 100){
		System.out.printf("%d is less than or equals to 100%n", number);
		}
	if (number >= 100){
		System.out.printf("%d is greater than or equals to 100%n", number);
		}
	}
	

}