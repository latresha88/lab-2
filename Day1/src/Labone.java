import java.util.Scanner;

public class Labone {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y"))

		// get input from user
		{
			System.out.println("Enter Length:");
			float length = scanner.nextFloat();

			System.out.println("Enter Width:");
			float width = scanner.nextFloat();

			// Calculate the area and perimeter

			float area;
			float perimeter;

			area = length * width;
			perimeter = (2 * length) + (2 * width);

			System.out.println("Area is:" + area);
			System.out.println();

			System.out.println("Perimeter is:" + perimeter);
			System.out.println();

			// See if user wants to continue
			System.out.println("continue? (y/n): ");
			choice = scanner.next();
			System.out.println();
		}
		scanner.nextLine();
			
		}
	}

