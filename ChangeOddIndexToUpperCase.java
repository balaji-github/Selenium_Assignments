package assignment.week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* String test = "selenium";
		 *Convert String to character array
		 * find the odd index within the loop (use mod operator)
		 *change character to uppercase in loop, if the index is odd else don't change
		 */
		String word ="selenium";

		char[] testCharArray = word.toCharArray();

		for (int charIndex = 0; charIndex < testCharArray.length; charIndex++) {
			if(charIndex%2!=0)
				testCharArray[charIndex] = Character.toUpperCase(testCharArray[charIndex]);
			System.out.print(testCharArray[charIndex]);
		}

	}

}
