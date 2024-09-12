import java.util.Scanner;
public class PrintSum{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter num 1");
		int num1 = collect.nextInt();
		System.out.println("Enter num 2");
		int num2 = collect.nextInt();
		System.out.println("Enter num 3");
		int num3 = collect.nextInt();
		System.out.println("Enter num 4");
		int num4 = collect.nextInt();
		System.out.println("Enter num 5");
		int num5 = collect.nextInt();
		System.out.println("Enter num 6");
		int num6 = collect.nextInt();
		System.out.println("Enter num 7");
		int num7 = collect.nextInt();
		System.out.println("Enter num 8");
		int num8 = collect.nextInt();
		System.out.println("Enter num 9");
		int num9 = collect.nextInt();
		System.out.println("Enter num 10");
		int num10 = collect.nextInt();

		int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		double average = sum / 2;

		System.out.println(sum, average);
			
	}

}