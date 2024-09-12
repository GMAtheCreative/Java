import java.util.Scanner;
public class PopulationGrowthCalculator{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Enter the current population:");
		double currentPopulation = collect.nextDouble();

		System.out.println("Enter the population growth rate:");
		double growthRate = collect.nextDouble();

		double newPopulation1 = currentPopulation * growthRate;
		double newPopulation2 = newPopulation1 * growthRate;
		double newPopulation3 = newPopulation2 * growthRate;
		double newPopulation4 = newPopulation3 * growthRate;
		double newPopulation5 = newPopulation4 * growthRate;

		System.out.printf("the current population = %f %n The growth Rate = %f %n The population in 1 year = %f %n the population in 2 years = %f %n the population in 3 years = %f %n the population in 4 years = %f %n the population in 5 years = %f",currentPopulation, growthRate, newPopulation1, newPopulation2, newPopulation3, newPopulation4, newPopulation5); 
	}

}
