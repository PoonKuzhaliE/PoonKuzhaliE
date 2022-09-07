package org.assign;

import java.util.Scanner;

public class Surprice4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a array size:");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("enter the " + i + " position value:");
			arr[i] = scan.nextInt();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("Enter the column size:");
		int k = scan.nextInt();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int answer = arr[i] + arr[j];
				if ((arr[i] < arr[j]) && answer % k == 0) {
					{
						System.out.println("[" + arr[i] + "," + arr[j] + "]");
					}
				}
			}
		}
		scan.close();
	}

}//SURPRICE...........................HAHA
