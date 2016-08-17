import java.util.Scanner;

public class power {
public static void main(String[] args) {
		
	    Scanner scan1 = new Scanner(System.in);
	    System.out.println("Welcome to the Table of Powers");
	    System.out.println();
	    System.out.println("Enter an Integer: ");
	    
	    int input = scan1.nextInt();
	    scan1.nextLine(); 
	
        System.out.println("Number\t" + "Squared\t" + "Cubed");       
        System.out.println("======\t" + "=======\t" + "======");
        
        getPower(input);
}


	public static void getPower(int input) {
		
		for (int i = 1; i <= input; i++) {
			int powerSquare = i*i;
			int powerCubed = i*i*i;
			System.out.println(i + "\t"+ powerSquare + "\t" + powerCubed);
	}
	}
	}
	
	


