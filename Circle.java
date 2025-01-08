import java.util.Scanner;
public class Circle{

	public static void main(String [] args){


		Scanner collect = new Scanner(System.in);
		double pi = 3.14159d;

		System.out.println("Enter the value of radius: ");
		int radius = collect.nextInt();

		double diameter = 2 * radius;
		double circumference = 2 * pi * radius;
		double area = pi * radius * radius;

		System.out.printf("Diameter = %f, Circumference = %f, Area = %f", diameter, circumference, area);	
	}
}