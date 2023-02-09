package refresher;
import java.util.Scanner;

public class Refresher {
	
	public static void variables() {
		int num = 6;
		double myDouble = 7.14;
		char myChar = 'a';
		String myString = "Hello World";
		boolean myBool = true;
		
		System.out.println("Printing Variables with printf converters");
		System.out.printf("\tint variable: %d\n", num);
		System.out.printf("\tdouble variable: %f\n", myDouble);
		System.out.printf("\tchar variable: %s\n", myChar);
		System.out.printf("\tString variable: %s\n", myString);
		System.out.printf("\tBoolean variable: %b\n", myBool);
	}
	
	public static void forWhileLoops() {
		int j = 0;
		System.out.println("Output for For/While Loops:");
		
		for (int i=0; i < 5; i++) {
			System.out.printf("\tThe value of i in the For Loop is: %d\n", i);
		}
		
		while (j < 5) {
			System.out.printf("\tThe value of j in the While Loop is: %d\n", j);
			j++;
		}
	}
	
	public static void whileIfStatement() {
		int loop = 0;
		System.out.println("Output for While If statement:");
		
		while(true) {
			System.out.println("\tLoop iteration: " + loop);
			if (loop == 5) {
				System.out.println("\tLoop reached 5, breaking loop");
				break;
			}
			loop++;
		}
	}
	
	public static void userInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int value = input.nextInt();
		System.out.println("You have entered: " + value);
	}

	public static void main(String[] args) {
		variables();
		forWhileLoops();
		whileIfStatement();
		userInput();
	}

}
