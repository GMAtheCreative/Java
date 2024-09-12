import java.util.Scanner;
public class BankApp{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		System.out.println("Hi please Enter your name");
		String name = collect.nextLine();
		

		String transfer = """
					1. GMA Bank
					2. GT Bank
					3. Zenith Bank
					4. Opay
					5. Palm Pay
					6. Money Point
					7. Sterling Bank""";

		 
		System.out.println("welcome " + name +  " to GMA E-Bank ");


			System.out.println("Enter 1 to continue or 0 number to quit");
			int number = collect.nextInt();
		while(number != 0){



		
		switch (number){
			
			
			case  1:
			System.out.print("Enter \n1. Transfer \n2. Buy Airtime \n3. Buy Data \n4. Share Data \n ");
			int menu = collect.nextInt();

				switch (menu){
			
					case 1: System.out.println("Transfer");
				break;

					case 2: System.out.println("Airtime");
				break;

					case 3: System.out.println("Buy Data");
				break;

					case 4: System.out.println("Share Data");
				break;
		
					default: System.out.println("Invalid Input");
				
				}
				break;

			 default: System.out.println("Thanks for banking with us. Hope to see you back soon");
			
			}

				System.out.println("Enter \"0\" to quit or any number to continue");
			number = collect.nextInt();
		}
	}

}