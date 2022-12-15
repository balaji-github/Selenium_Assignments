package assignment.week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* array declaration {3,2,11,4,6,7}; another array {1,2,8,4,9,7};
		 * use loop from 0 to array length
		 * Nested loop for another array from 0 to array length
		 * Compare both arrays
		 * Print the first array (should match item in both arrays)
		 */
		
		int firstArray[] = {3,2,11,4,6,7};
		int secondArray[] = {1,2,8,4,9,7};
		
		for (int firstArrayIndex = 0; firstArrayIndex < firstArray.length; firstArrayIndex++) {
			for (int secondArrayIndex = 0; secondArrayIndex < secondArray.length; secondArrayIndex++) {
				if(firstArray[firstArrayIndex]==secondArray[secondArrayIndex]) {
					System.out.println(firstArray[firstArrayIndex]);
					break;
				}
			}
		}
	}

}
