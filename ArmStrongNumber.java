package programs;

import java.util.Scanner;

public class ArmStrongNumber {

	Scanner s = new Scanner(System.in);

	public void armstrongNumber() {
		System.out.println("Enter the number");
		int a = s.nextInt();
		int temp = a;  //temp variable
		int rev = 0;

		while (a != 0) {
			int b = a % 10;
			rev = rev + (b * b * b);
			a /= 10;
		}
		if (temp == rev) {
			System.out.println(temp + " is a Armstrong number");
		} else {
			System.out.println(temp + "is not a armstrong number");
		}
	}

	public void armstrongInterval() {
		System.out.println("Enter the end value");
		int x = s.nextInt();

		for (int i = 1; i <= x; i++) {
			int num = i;//num is a temp variable
			int sum = 0;

			while (num > 0) {
				int b = num % 10;
				sum = sum + (b * b * b);
				num /= 10;
			}
			if (sum == i) {
				System.out.println(sum + " ");
			}

		}
	}

	public static void main(String args[]) {
		ArmStrongNumber obj = new ArmStrongNumber();
        //obj.armstrongNumber();
		obj.armstrongInterval();
	}
}