package assignment.week1.day2;

public class VerifyPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome("A man, a plan, a canal: Panama");
		isPalindrome(" race a Car");
		isPalindrome(" ");
	}

	public static void isPalindrome(String s)
	{
		String input = s;
		String output = "";
		
		//Convert string into lowercase
		s = s.toLowerCase();

		//Removing numbers and spl characters
		s=s.replaceAll("[^a-zA-Z0-9]+", "");
		//System.out.println(s);

		//convert the input string to char array
		char[] reverseString = s.toCharArray();

		//Reverse the input String
		for(int i=reverseString.length-1;i>=0;i--)
		{
			output = output+reverseString[i];
		}

		//Compare input & output Strings

		if(s.equals(output))
			System.out.println("Given string is \""+input+"\""+" is Palindrome");
		else
			System.out.println("Gien string is not \""+input+"\""+" is not Palindrome");
	}

}
