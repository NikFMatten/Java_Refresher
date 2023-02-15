package refresher;
import java.util.*;


public class Refresher {
	
	// Variables
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
	
	// For and While Loop
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
	
	// While + If statement
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
	
	// User input
	public static void userInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int value = input.nextInt();
		System.out.println("You have entered: " + value);
	}

	// Do While loop
	public static void doWhileLoop() {
		Scanner input = new Scanner(System.in);
		int value;
		do {
			System.out.println("Guess a number between 1 and 5: ");
			value = input.nextInt();
		}
		while(value != 3);
		System.out.println("Correct Guess of 3");
	}
	
	// Switch Case
	public static void switchCase() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 'start' or 'stop' ");
		String text = input.nextLine();
		
		switch (text) {
		case "start":
			System.out.println("Machine Started");
			break;
		case "stop":
			System.out.println("Machine Stopped");
			break;
		default:
			System.out.println("Command not recognized");
		}
		
	}
	
	// Arrays
	public static void arrays() {
		int value = 7;
		int[] values;
		values = new int[3];
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		for (int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		
		System.out.println(values.length);
	}
	
	// Array of Strings
	public static void stringArrays() {
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		for (String word: words) {
			System.out.print(word + " ");
		}
	}
	
	public static void main(String[] args) {
		variables();
		forWhileLoops();
		whileIfStatement();
//		userInput();
//		doWhileLoop();
//		switchCase();
		arrays();
		stringArrays();
	}

}
