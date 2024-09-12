import java.util.Scanner;
public class PizzaWahala{
	public static void main(String [] args){
		Scanner collect = new Scanner(System.in);

		System.out.println("WELCOME TO OJUORE PIZZA ONLINE SHOP");
		System.out.println();
		System.out.println("                  OUR PIZZA PACKAGES");
		System.out.println("===========================================================");
		System.out.println("|    PIZZA TYPE    |  NUMBER OF SLICES  |  PRICE PER BOX  |");
		System.out.println("|=========================================================|");
		System.out.println("|     Sapa size    |          4         |       2000      |");
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|    Small Money   |          6         |       2400      |");
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|     Big boys     |          8         |       3000      |");
		System.out.println("|---------------------------------------------------------|");
		System.out.println("|      Odogwo      |         12         |       4200      |");
		System.out.println("===========================================================");
		System.out.println();
		System.out.println();

		System.out.println("what pizza type do you want to buy?");
		String pizzaType = collect.next();
		
		System.out.println("How many people are you expecting at the party?");
		String numberOfPeople = collect.next();

		int numberOfPeopleExpected = 0;
		if(numberOfPeople.instanceOf Integer){
		}
		else{
			System.out.println("Invalid input.... Please Enter a valid number");
		}
	}
}