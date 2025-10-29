// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int input = Integer.parseInt(args[0]);
		int hundreds = input/100;
		int tens = (input%100)/10;
		int ones = (input%10);

		// System.out.println(hundreds);
		// System.out.println(tens);
		// System.out.println(ones);

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
