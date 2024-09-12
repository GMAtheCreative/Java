import java.util.Scanner;
public class GasMilage{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);
		double miles = 0;
		double gallon = 0;
		

		do{
			System.out.println("Enter miles driven and amount of gallon used (0.0 to quit):");
			mileNumber = collect.nextDouble();
			gallonNumber = collect.nextDouble();

			miles += mileNumber;
			gallon += gallonNumber;	
			
			double milePerGallon = miles / gallon;
		}
		while(mile != 0.0 && gallon != 0.0);
		System.out.println(milePerGallon);		
	}

}