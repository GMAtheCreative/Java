public class PatternA{
	public static void main(String [] args){
		System.out.println("PATTERN A");

		for(int line = 1; line <= 6; line++){
			for(int line1 = 1; line1 <= line; line1++){
				System.out.print(line1 + "\n");
				
			}
		}System.out.println();
	}
}