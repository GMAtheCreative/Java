public class PrintTable{
	public static void main(String [] args){

		System.out.println("a \t b \t pow(a,b)");
		for (int a = 1; a <= 5; a++){
			for(int b = 2; b <= 6; b++){

				double table = Math.pow(a, b);
				int tableInt = (int) table;
				
				System.out.print("%d \t %d \t %d%n",a, b, tableInt);
			}
		}	
	}
}