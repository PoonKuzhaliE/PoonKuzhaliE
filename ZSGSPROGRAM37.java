package ZSGSPROGRAMS;

import java.util.Scanner;

public class ZSGSPROGRAM37 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the char");
	char a=s.next().charAt(0);
	if((a>='A'&&a<='Z')||(a>='a'&&a<='z')) 
		System.out.println("the character is alphabet");
	else
	
		System.out.println("not a alphabet");
	
}
}
