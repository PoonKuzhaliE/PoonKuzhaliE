package ZSGSPROGRAMS;

import java.util.Scanner;

public class ZSGSPROGRAM28 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the km");
	int a=s.nextInt();
	float a1=1.609f;  
	double result1=(a/a1);
	System.out.println("miles:"+result1);
	
	System.out.println("enter the degree of celcius");
	int b=s.nextInt();
	int result2=(b*9)/5+32;
	System.out.println("farhenheit:"+result2);

}
}
