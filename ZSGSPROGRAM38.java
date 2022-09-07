package ZSGSPROGRAMS;

import java.util.Scanner;

public class ZSGSPROGRAM38 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value of a");
	int a=s.nextInt();
	System.out.println("enter the value of b");
	int b=s.nextInt();
	if(a>0&&b>0) {
		int result=a+b;
		System.out.println("sum of natural numbers:"+result);
	}else {
		System.out.println("invalid numbers");
	}
}
}
