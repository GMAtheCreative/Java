import java.util.Scanner;
public class BodyMass{
	public static void main(String [] args){

	Scanner collect = new Scanner(System.in);

	System.out.println("Enter value body weight in pounds:");
	double weight = collect.nextDouble();

	System.out.println("Enter value of height in inches:");
	double height = collect.nextDouble();

	double bodyMass = weight * 703 / height * height;

	System.out.printf("Your BMI is: %f.2 ", bodyMass);
	}

}