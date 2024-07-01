import java.util.Scanner;
public class NokiaMenu{
	public static void main(String [] args){

		Scanner collect = new Scanner(System.in);

		String mainMenu = """
				1. Phone Book
				2. Messages
				3. Chat
				4. Call Register
				5. Tone
				6. Settings
				7. Call Divert
				8. Games
				9. Calculator
				10. Reminder
				11. clock
				12. Profile
				13. Sim Service""";
// inner case 1
		
		String phoneBook = """
				1. Serch
				2. Service Nos.
				3. Add Name
				4. Erase
				5. Edit
				6. Assign tone
				7. Send b'card
				8. Option
				9. Speed dials
				10. Voice tag""";

		String message = """
				1. Write messages
				2. Inbox
				3. Outbox
				4. Picture messages
				5. Templates
				7. Messages Settings
				8. Info service
				9. Voice Mailbox Number
				10. Service Command Editor""";

		String callRegister = """
					1. Missed calls
					2. Received calls
					3. Dialled number
					4. Erase resent call list
					5. Show call duration
					6. Show call cost
					7. Call cost settings
					8. Prepaid credit""";

		String tone = """
				1. Ringing tone
				2. Ringing volume
				3. Incoming call alert
				4. Composser
				5. Message alert tone
				6. Keypad tones
				7. Warning and games tones
				8. Vibrating alert
				9. Screen saver""";

		String settings = """
				1. Call settings
				2. Phone setting
				3. Security settings
				4. Restore factory settings""";

		String clock = """
				1. Alarm clock
				2. Clock setting
				3. Date setting
				4. Stopwatch
				5. Countdown timer
				6. Auto update of date and time""";

// second inner case

		String options = """
				1. Type of veiw
				2. Memory status""";

		String messageSettings = """
					1. Set 1
					2. Common""";

		String showCallDuration = """
					1. Last call duration
					2. All calls duration
					3. Received calls' duration
					4. Dialled calls' duration
					5. Clear timers""";

		String showCallCost = """
					1. Last call cost
					2. All calls' cost
					3. Clear counters""";

		String callCostSettings = """
					1. Call cost limit
					2. Show cost in""";

		String callSettings = """
					1. Automatic redial
					2. Speed dialing
					3. Call waiting options
					4. Own number sending
					5. Phone line in use
					6. Automatic answer""";

		String phoneSettings = """
					1. Language
					2. Cell info display
					3. Welcome note
					4. Network selection
					5. Lights
					6. Confirm SIM service actions""";

		String securitySettings = """
					1. PIN code request
					2. Call barring service
					3. Fixed dialling
					4. Closed user group
					5. Phone security
					6. Change access codes""";

//third inner case

		String set = """
				1. Message center number
				2. Messages sent as
				3. Message validity""";

		String common = """
				1. Delivery reports
				2. Reply via same center
				3. Character support""";

		
		System.out.println("ON / OFF");
		String switchOn = collect.nextLine();

		if(switchOn.equalsIgnoreCase("ON")){
			System.out.println("  *********** NOKIA ********** \n******* CONNECTING PEOPLE *******");

			System.out.println("WELCOME \nPress 1 to enter the MAIN MENU");
			System.out.println();
			int enter = collect.nextInt();

			System.out.print("CHOOSE ANY MENU OF YOUR CHOICE \n" + mainMenu + "\n");
			int menu = collect.nextInt();
			System.out.println();

			switch (menu){

				case 1:
				System.out.println("PHONE BOOK \n" + phoneBook);
				System.out.println();
				int phoneB = collect.nextInt();
		
				switch (phoneB){

					case 1:
					System.out.println("Search");
					break;

					case 2:
					System.out.println("Service Nos.");
					break;

					case 3:
					System.out.println("Add name");
					break;

					case 4:
					System.out.println("Erase");
					break;

					case 5:
					System.out.println("Edit");
					break;

					case 6:
					System.out.println("Assign tone");
					break;

					case 7:
					System.out.println("Send b' card");
					break;

					case 8:
					System.out.println("Options \n" + options);
					System.out.println();
					int option8 = collect.nextInt();

					switch (option8){
					
						case 1:
						System.out.println("Type of veiw");
						break;

						case 2:
						System.out.println("Memory status");
					}
					break;

					case 9:
					System.out.println("Speed dials");
					break;

					case 10:
					System.out.println("Voice tags");
					break;
				}
				break;
				
				case 2:
				System.out.println("MESSAGES \n" + message);
				System.out.println();

				int messages = collect.nextInt();

				switch (messages){
					
					case 1:
					System.out.println("Write messages");
					break;

					case 2:
					System.out.println("Inbox");
					break;

					case 3:
					System.out.println("Outbox");
					break;

					case 4:
					System.out.println("Picture messages");
					break;

					case 5:
					System.out.println("Templates");
					break;

					case 6:
					System.out.println("Smileys");
					break;

					case 7:
					System.out.println("Message settings " + messageSettings);

					System.out.println();

					int messagesSetting = collect.nextInt();

					switch (messagesSetting){
					
						case 1:
						System.out.println("Set \n " + set);
										
						System.out.println();

						int sets = collect.nextInt();

						switch (sets){

							case 1:
							System.out.println("Message center number");
							break;

							case 2:
							System.out.println("Message sent as");
							break;

							case 3:
							System.out.println("Message validity");
							break;
						}
						break;

						case 2:
						System.out.println("Common \n " + common);

						System.out.println();

						int commons = collect.nextInt();

						switch (commons){

							case 1:
							System.out.println("Deliver reports");
							break;

							case 2:
							System.out.println("Reply via same centre");
							break;

							case 3:
							System.out.println("Character support");
							break;
						}
						break;
					}

					break;
				}
				break;

				case 3:
				System.out.println("CHAT");
				System.out.println();
				break;

				case 4:
				System.out.println("CALL REGISTER \n" + callRegister);
				System.out.println();

				int callRegisters = collect.nextInt();

				switch (callRegisters){
					
					case 1:
					System.out.println("Missed calls");
					break;

					case 2:
					System.out.println("Received");
					break;

					case 3:
					System.out.println("Dialled number");
					break;

					case 4:
					System.out.println("Erase recent calls");
					break;

					case 5:
					System.out.println("Show call duration \n " + showCallCost);

					int show = collect.nextInt();

					switch (show){
					
						case 1:
						System.out.println("Last call duration");
						break;

						case 2:
						System.out.println("All calls' duration");
						break;

						case 3:
						System.out.println("Received calls' duration");
						break;

						case 4:
						System.out.println("Dialled calls' duration");
						break;

						case 5:
						System.out.println("Clear timer");
						break;



					}
					break;

					case 6:
					System.out.println("Show call cost\n" + showCallCost);

					int showCall = collect.nextInt();

					switch (showCall){
					
						case 1:
						System.out.println("last calls cost");
						break;

						case 2:
						System.out.println("All calls' cost");
						break;

						case 3:
						System.out.println("Clear counter");
						break;


					
					}
					break;

					case 7:
					System.out.println("Call cost settings " + callCostSettings);

					int costSetting = collect.nextInt();

					switch (costSetting){
					
						case 1:
						System.out.println("Call cost limit");
						break;

						case 2:
						System.out.println("Show cost in");
						break;

					}	
					break;

					case 8:
					System.out.println("Prepaid credit");
					break;

				}
				break;

				case 5:
				System.out.println("TONES \n" + tone);
				System.out.println();
				break;

				case 6:
				System.out.println("SETTINGS \n" + settings);
				System.out.println();

				int setting= collect.nextInt();

				switch (setting){
					
					case 1:

					System.out.println("Call setting \n" + callSettings);
					System.out.println();

					int callSetting= collect.nextInt();

					switch (callSetting){
					
						case 1:
						System.out.println("Automatic redia");
						break;

						case 2:
						System.out.println("Speed dialling");
						break;

						case 3:
						System.out.println("Call waiting options");
						break;

						case 4:
						System.out.println("Own number sending");
						break;

						case 5:
						System.out.println("Phone line in use");
						break;

						case 6:
						System.out.println("Automatic answer");
						break;

				
					}
					switch (setting){
					
					case 2:

					System.out.println("Phone setting \n" + phoneSettings);
					System.out.println();

					int phoneSetting= collect.nextInt();

					switch (phoneSetting){
					
						case 1:
						System.out.println("language");
						break;

						case 2:
						System.out.println("Cell info display");
						break;

						case 3:
						System.out.println("Welcome note");
						break;

						case 4:
						System.out.println("Network selection");
						break;

						case 5:
						System.out.println("Light");
						break;

						case 6:
						System.out.println("Confirm SIM service actions");
						break;

				
					}

					switch (setting){
					
					case 3:

					System.out.println("Security \n" + securitySettings);
					System.out.println();

					int securitySetting= collect.nextInt();

					switch (securitySetting){
					
						case 1:
						System.out.println("PIN code request");
						break;

						case 2:
						System.out.println("Call barring service");
						break;

						case 3:
						System.out.println("Fixed dialling");
						break;

						case 4:
						System.out.println("Closed user group");
						break;

						case 5:
						System.out.println("Phone security");
						break;

						case 6:
						System.out.println("Change access code");
						break;
					}
					case 4:
					System.out.println("Restore factory settings");
					System.out.println();
					break;

				
				}
				break;

				case 7:
				System.out.println("CALL DIVERT");
				System.out.println();
				break; 
				
				case 8:
				System.out.println("GAMES");
				System.out.println();
				break;

				case 9:
				System.out.println("CALCULATOR");
				System.out.println();
				break;

				case 10:
				System.out.println("REMINDER");
				System.out.println();
				break;

				case 11:
				System.out.println("CLOCK \n" + clock);
				System.out.println();

				int clocks= collect.nextInt();

				switch (clocks){
					
					case 1:
					System.out.println("Alarm clock");
					break;

					case 2:
					System.out.println("Clock settings");
					break;

					case 3:
					System.out.println("Date setting");
					break;

					case 4:
					System.out.println("Stop watch");
					break;

					case 5:
					System.out.println("Count down timer");
					break;

					case 6:
					System.out.println("Auto update of date and time");
					break;
				}

				break;

				case 12:
				System.out.println("PROFILE");
				System.out.println();
				break;

				case 13:
				System.out.println("SIM SERVICE");
				System.out.println();
				break;
				
			}
		}
		else if (switchOn.equalsIgnoreCase("OFF"))
			System.out.println("THANK YOU.. I'M STAYING OFF");

		else
			System.out.println("YOU CAN EITHER TURN ME ON OR OFF");		
	}
}