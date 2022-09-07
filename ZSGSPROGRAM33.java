package ZSGSPROGRAMS;

import java.util.Scanner;

public class ZSGSPROGRAM33 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the character:");
	char a=s.next().charAt(0);
	switch(a) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	System.out.println("the character is vowel");
	break;
default:
	System.out.println("the character is consonent");
	
	}
}
}