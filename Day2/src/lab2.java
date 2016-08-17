
import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		int state = 1;
		boolean play = true;
		String name = "";
		int num;
		String weapon = "";
		String eyes = "";
		String name2 = "";

		while (play == true) {

			switch (state) {
			case 1:
				System.out.println("What is your name?");
				name = scan1.nextLine();
				
				System.out.println("Would you like to play the game? Enter yes or no.");

				String choice = scan1.nextLine();
				if (choice.equalsIgnoreCase("yes"))
					state = 2;
				else
					play = false;
				break;

			case 2:
				System.out.println(
						"Excellent! You are walking across a field and you encounter a fire breathing dragon. What would you do? face the beast or run away?");

				String choice1 = scan1.nextLine();
				if (choice1.equalsIgnoreCase("face the beast"))
					state = 3;
				else
					play = false;
				break;

			case 3:
				System.out.println("You approach the dragon. You see that he has____ heads. Enter 1 or 2 or 3");
				num = scan1.nextInt();
				System.out.println("No has ever face a " + num + "-headed dragon before! Choose your weapon. Enter slingshot or sword or bow and arrow.");
				weapon = scan1.nextLine();

				String choice21 = scan1.nextLine();
				if (choice21.equalsIgnoreCase("slingshot")){
					weapon = "slingshot";
					state = 4;
				}
				else if			
					(choice21.equalsIgnoreCase("sword")){
					weapon = "sword";
					state = 4;
				}
				else if
					(choice21.equalsIgnoreCase("bow and arrow")){
					weapon = "bow and arrow";
					state = 4;
				}
				else
					play = false;
				break;
				
			case 4:
				System.out.println("Armed with your " + weapon + " you approach the dragon. You feel it's firey breath as you get closer. It stares at you with its _ eyes. Enter red or blue");
				eyes = scan1.nextLine();
				System.out.println("Oh thank goodness " + eyes + "-eyed dragons are friendly. You pet it and become friends. You name the dragon ____. Enter a name:");
				name2 = scan1.nextLine();
				System.out.println(name + " and " + name2 + " live happily ever after.");
				String choice4 = scan1.nextLine();
				if (choice4.equalsIgnoreCase("red"))
					{state = 5;}
				
				else if (choice4.equalsIgnoreCase("blue"))
					{state = 5;}
				
				else
				 	play = false;
				scan1.close();
				
				
			default:
				break;
			}

		}
	}
}


	
