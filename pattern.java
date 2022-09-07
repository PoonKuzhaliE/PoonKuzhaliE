package programs;

import java.util.Arrays;
import java.util.Scanner;

public class pattern {
	public static void main(String args[]) {// pattern
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
			;
		}
//break and continue
		for (int i = 0; i < 25; i++) {
			if (i == 4)
				break;
			if (i == 34)
				continue;
			System.out.println(i);
		}
//factorial
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
//fibonacci
		int a = 0;
		int b = 1;
		for (int i = 0; i <= 10; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
//declare,allocate,intializing
		int c[] = new int[] { 2, 3, 4, 5, 9 };// declare,allocate,intializing
		for (int d : c) {
			System.out.println(d);
		}
//reverse a number
		int x = 234;
		int temp = 0;
		int rev = 0;
		temp = x;
		while (x != 0) {
			int y = x % 10;
			rev = (rev * 10) + b;
			x = x / 10;
		}
		if (temp == rev) {
			System.out.println("reversible");
		} else {
			System.out.println("not a reverse number");
		}
//counting the even number
		Scanner s = new Scanner(System.in);
		int count = 0;
		int c4 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
//count even num in a array
		int count1 = 0;
		int a1[] = { 4, 6, 7, 12, 4, 4, 5, 6, 7, 8, 9, 10, 99 };
		Arrays.sort(a1);
		for (int v1 : a1) {
			System.out.println(v1);

		}
		System.out.println(Arrays.toString(a1));//[n]

		System.out.println(a1);// prints a sorted array returns hashcode
		for (int c1 : a1) {
			if (c1 % 2 == 0) {
				count1++;
			}
		}
		System.out.println(count1);

	}
}