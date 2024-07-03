import java.util.Scanner;
public class Palindrum{
	public static void main(String... args){
		Scanner collect = new Scanner(System.in);

		int number = collect.nextInt();
		boolean fun = Kata.isPalindrome(number);
		System.out.println(fun);
	}

}