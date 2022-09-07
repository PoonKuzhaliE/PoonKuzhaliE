package programs;

public class SpecialNumber {
	public static void main(String args[]) {
		int number = 145;
		int temp;
		temp = number;
		int digit;
		int sum = 0;
		while (number != 0) {
			digit = number % 10;
			int factorial = 1;
			for (int j = 1; j <= digit; j++) {
				factorial = factorial * j;
			}
			sum += factorial;
			number = number / 10;

		}
		if (sum == temp) {
			System.out.println("special number");
		}

		else {
			System.out.println("not a special number");
		}
	}

}
