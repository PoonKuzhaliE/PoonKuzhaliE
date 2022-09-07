package org.assign;

public class Surprise1 {
	public static void main(String args[]) {
		int a = 0;
		int b = 1;
		int c = 0;
		int factor = 0;
		for (int i = 1; i <= 30; i++) {
			// System.out.println(a);
			c = a + b;
			a = b;
			b = c;

			if (a % i == 0) {
				factor++;
				if (factor == 2) {
					System.out.println("prime = " + a);
				}
			}

		}
	}
}