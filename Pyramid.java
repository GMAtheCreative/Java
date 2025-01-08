import java.util.Scanner;
public class Pyramid{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Estimated number of stones used: ");
		double stones = collect.nextDouble();	

		System.out.println("Average Weight of stone: ");
		double weight = collect.nextDouble();

		System.out.println("Number of years taken to build: ");
		double years = collect.nextDouble();

		double totalWeight = stones * weight;
		double weightPerYear = totalWeight / years;
		double weightPerHour = totalWeight / 365 / 24;
		double weightPerMinute = weightPerHour / 60;

		System.out.printf("Estimated weight of pyramid built each year: %.2f %nEstimated weight of pyramid built each hour: %.2f %nEstimated weight of pyramid built each minute %.2f", weightPerYear, weightPerHour, weightPerMinute);
	}

}