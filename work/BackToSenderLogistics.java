import java.util.Scanner;
public class BackToSenderLogistics{
	public static void main(String... args){

		Scanner collect = new Scanner(System.in);
		System.out.println("Enter the amount of deliveries from \"0\" to \"100\": ");
		int deliveries = collect.nextInt();

		int wages = DeliveryFunction.payment1(deliveries);

		System.out.print("\n" + wages);
	}
}