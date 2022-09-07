package programs;

import java.util.Scanner;

public class SwitchMarks {
public static void main(String args[]) {
	
	int marks;
	Scanner s=new Scanner(System.in);
	System.out.println("enter your mark=");
	int a=s.nextInt();

	switch(a/10) {
	case 9:
	{
		System.out.println("distinction");
		break;
	}
	case 8:
	{
		System.out.println("Distinction");
		break;
	}
	case 7:
	{
		System.out.println("second class");
		break;
	}
	case 6:
	{
		System.out.println("third class");
		break;
	}
	default:
		System.out.println("fail");
	}
	
	
}
}
