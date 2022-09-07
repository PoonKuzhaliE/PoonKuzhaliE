package org.assign;

import java.util.Arrays;
import java.util.Scanner;

public class Surprice3 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first String:");
		String s1=scan.nextLine();
		System.out.println("Enter a second String:");
		String s2=scan.nextLine();
		
		String lows1=s1.toLowerCase();
		String lows2=s2.toLowerCase();
		
		char []arrays1=lows1.toCharArray();
		char []arrays2=lows2.toCharArray();
		
        Arrays.sort(arrays1);
        Arrays.sort(arrays2);

		if(Arrays.equals(arrays1, arrays2)) {
			System.out.println(s1+" and "+s2+" is  a anagrams");
		}
		else {
			System.out.println(s1+" and "+s2+" is not  anagrams");
		}
		
	}

}