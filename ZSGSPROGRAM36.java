package ZSGSPROGRAMS;

import java.util.Scanner;

public class ZSGSPROGRAM36 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value:");
	int a=s.nextInt();
	if(a>0) {
		System.out.println("positive number");
	}
	else if(a<0) {
		System.out.println("negative number");
	}else {
		System.out.println("neither positive nor negative");

	}
	
}
}
