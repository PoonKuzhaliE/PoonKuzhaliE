package programs;

import java.util.Scanner;

public class Operators {
	public static void main(String args[]) {
		int a=5;
		int b=34;
		boolean x=true;
		 int c=(a>b)?a:b;     //TERNARY 
		 System.out.println(c);
		 
		 int d1=a++;
		 int d2=a--;
		 int d3=++b;
		 int d4=--b;
		 boolean d6=!x;
		 int d5=a++-b--+a+a--;//5	-34		6		6  //UNARY
		 System.out.println(d1+"  "+d2+"  "+d3+"  "+d4+"  "+d5+"  "+d6+"  ");
 
		 
		 int c1=a&a;
		 int c2=a|b;
		 int c3=a^b;
		 int c4=~a;
		 System.out.println(c1+"  "+c2+"  "+c3+"  "+c4+"  ");  //BITWISE
		 
		 
		 
		 int a1=a+b;
		 int a2=a-b;
		 int a3=a*b;
		 int a4=a/b;
		 int a5=a%b;
		 System.out.println(a1+"  "+a2+"  "+a3+"  "+a4+"  "+a5+"  ");  //ARITHMATIC
		 
		 
		 
		 if((a<b)&&(a==5)) {
			 System.out.println("condition is true");
		 }
		   if((a>b)||(a==5)){
			 System.out.println("this condition is also true");///LOGICAL 
		   }
			System.out.println(a==b);
			System.out.println(a!=b);
			System.out.println(a<b);
			System.out.println(a>b);
			System.out.println(a<=b);
			System.out.println(a>=b);  //RELATIONAL
			
			int y1=20;//10100
			int y2=2;
			int y3=y1>>>y2;//00101
			int y4=y1>>y2;
			int y5=y1<<y2;
			System.out.println(y3+"  "+y4+"  "+y5+"  ");
			
	}	
}
