import java.util.Scanner;

public class smallestNumber {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 0;
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter an Integer");
		firstNum=scan1.nextInt();
		//scan1.nextLine();
		
		System.out.println("Enter a Second Integer");
		secondNum=scan1.nextInt();
		scan1.nextLine();
		
		smallerNum(firstNum, secondNum);
	
		
		scan1.close();
		
		}

	public static void smallerNum(int firstNum, int secondNum) {
		if( firstNum < secondNum){
			System.out.println("The smallest number is: "+ firstNum);
			
		}
		else if (firstNum == secondNum){
			System.out.println("Your numbers are the same");
		}
		else System.out.println("The smallest number is:" + secondNum);
	}
		

}


