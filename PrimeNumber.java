package assignment.week1.day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an number: ");
		int inputValue = sc.nextInt();
		int i;
		for (i = 2; i < inputValue; i++) {
			if(inputValue % i == 0)
				break;
		}
		if(i == inputValue)
			System.out.println("Number " + inputValue + " is a prime number.");
		else
			System.out.println("Number " + inputValue + " is a not prime number.");
	}

}
