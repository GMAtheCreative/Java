import java.util.Scanner;
public class DaysOfChristmasRefactor{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		
		System.out.println("Enter day number:");
		int day = collect.nextInt();
		for(day = 1; day <= 12; day++){
		
			switch (day){
				case 1:
				if(day == 1){
					String day = "First day of christmas";
					System.out.println("On the" + day);
					System.out.println("my true love gave to me" + christmas);
				}
			}
			
			
			
			switch (christmas){
				case 12:
				System.out.println("Twelve drummers drumming");
				
				case 11:
				System.out.println("Eleven pipers piping");

				case 10:
				System.out.println("Ten lords a-leaping");
				
				case 9:
				System.out.println("Nine ladies dancing");

				case 8:
				System.out.println("Eight maids a-milking");

				case 7:
				System.out.println("Seven swans a-swimming");

				case 6:
				System.out.println("Six geese a-laying");

				case 5:
				System.out.println("Five golden rings");

				case 4:
				System.out.println("Four calling birds");

				case 3:
				System.out.println("Three French hens");
			
				case 2:
				System.out.println("Two turtle doves and");

				case 1:
				System.out.println("A partridge in a pear tree");

			}
		}

	}

}
