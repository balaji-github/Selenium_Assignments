package assignment.week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sum of digits from the input String
				
		String digitcnt = "Selenium4Dec12year2022";

				//Declare integer sum = 0, to store the sum of digits value
				int sum = 0;

				//Convert the string to charArray
				char[] charArray = digitcnt.toCharArray();


				//loop to check character in charArray
				for(int i=0;i<digitcnt.length();i++)
				{
					//pick the numeric value from character and add it to sum

					if(Character.isDigit(charArray[i]))
					{
						//System.out.print("char: "+charArray[i]);
						sum = sum+Character.getNumericValue(charArray[i]);

						//System.out.println("sum:"+sum);
					}

				}
				System.out.println("Sum of characters in the input: "+sum);
	}

}
