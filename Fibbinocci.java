package assignment.week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum = 0;
		int secNum = 1;
		int sum	= 0;

			System.out.print(firstNum);
		for (int i = 0; i < 12; i++) {
			sum = firstNum + secNum;
			secNum=firstNum;
			firstNum=sum;
			System.out.print("\t" + sum);

		}

	}

}


