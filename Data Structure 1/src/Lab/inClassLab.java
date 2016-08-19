package Lab;
import java.util.Scanner;
import java.util.Stack;

public class inClassLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();

		int result = 0;

		System.out.println("Please enter the equation you want solved. ( Ex. 5+2-1)");
		String userInput = scan1.nextLine();
		for (int i = 0; i < userInput.length(); i++) {
			char c = userInput.charAt(i);
			// System.out.println(c);
			int transI = Character.getNumericValue(c);
			// char C= userInput.charAt(0);

			if (Character.isDigit(userInput.charAt(i))) {
				s.push(transI);
				// System.out.println(s.pop());
			} else {
				int x = s.pop();
				int y = s.pop();
				// result=

				switch (c) {
				case '*':
					result = x * y;
					break;
				case '/':
					result = y / x;
					break;
				case '+':
					result = x + y;
					break;
				case '-':
					result = y - x;
					break;

				default:
					break;
				}

				s.push(result);
				System.out.println(result);

			}
		}
		scan1.close();
	}
}
