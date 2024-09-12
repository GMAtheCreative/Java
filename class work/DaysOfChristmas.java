import java.util.Scanner;
public class DaysOfChristmas{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		
		System.out.print("Enter a number from 1-12");
		int christmas = collect.nextInt();
		
		switch (christmas){
			case 1:
			
			System.out.println("on the first day of Christmas my true love gave to me");
			break;
			case2:
			System.out.println("on the second day of Christmas my true love gave to me");
			break;

			case3:
			System.out.println("on the third day of Christmas my true love gave to me");
			break;			

			case4:
			System.out.println("on the forth day of Christmas my true love gave to me");
			break;

			case5:
			System.out.println("on the fifth day of Christmas my true love gave to me");
			break;

			case6:
			System.out.println("on the sixth day of Christmas my true love gave to me");
			break;

			case7:
			System.out.println("on the seventh day of Christmas my true love gave to me");
			break;

			case8:
			System.out.println("on the eight day of Christmas my true love gave to me");
			break;

			case9:
			System.out.println("on the ninth day of Christmas my true love gave to me");
			break;

			case10:
			System.out.println("on the tenth day of Christmas my true love gave to me");
			break;

			case11:
			System.out.println("on the eleventh day of Christmas my true love gave to me");
			break;

			case12:
			System.out.println("on the twelveth day of Christmas my true love gave to me");
			break;

			default:
			System.out.println("invalid number");
			
		}
		switch (christmas){
			case 1:
			
			System.out.println("A partridge in a pear tree");
			break;
			case2:
			System.out.println("Two turtle doves");
			break;

			case3:
			System.out.println("Three French hens");
			break;			

			case4:
			System.out.println("Four calling birds");
			break;

			case5:
			System.out.println("Five golden rings");
			break;

			case6:
			System.out.println("Six geese a-laying");
			break;

			case7:
			System.out.println("Seven swans a-swimming");
			break;

			case8:
			System.out.println("Eight maids a-milking");
			break;

			case9:
			System.out.println("Nine ladies dancing");
			break;

			case10:
			System.out.println("Ten lords a-leaping");
			break;

			case11:
			System.out.println("Eleven pipers piping");
			break;

			case12:
			System.out.println("Twelve drummers drumming");
			break;

			default:
			System.out.println("invalid number");
		}
	}

}