package refresher;

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

	public static void main(String[] args) {
		variables();
		forWhileLoops();
	}

}
