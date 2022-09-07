package ZSGSPROGRAMS;

import java.util.Scanner;

public class ZSGSPROGRAM26 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the year");
	int a=s.nextInt();
	if(a%4==0) {
		System.out.println("leap year");
	}else {
		System.out.println("not a leap year");
	}
}
}
