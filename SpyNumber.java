package programs;

import java.util.Scanner;

public class SpyNumber {
public static void main(String args[]) {
	int input,sum=0,prod=1,lastdigit;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the input value");
	input=s.nextInt();//321
	
	while(input!=0){  //-->321!=0,      -->32!=0        -->3!=0        -->0==0 condition fails
	lastdigit=input%10; //ld=321%10=1,  ld=32%10=2,     ld=3%10=3
	sum=sum+lastdigit;  //sum=0+1=1,    sum=1+2=3,      sum=3+3=6
	prod=prod*lastdigit; //prod=1*1=1,  prod=1*2=2,     prod=2*3=6
	input=input/10; //input=321/10=32,  input=32/10=3,  input=3/10=0.3
	}  
	if(sum==prod)
	System.out.println("The given number is a spy number.");  
	else 
	System.out.println("The given number is not a spy number.");  
}
}



/*Algorithms:
	Step 1:  Start
	Step 2: Create four instance variable and initialize them.
	Step 3: Using Scanner class to get the input from user.
	Step 4: Using while loop to check the condition.
	Step 5: Adding the input value.
	Step 6: Product the input value,
	Step 7: Check the addition and multiplication value are equal to the input value.
	Step 8: If it is equal print it as "SPY NUMBER".
	Step 9: If not print it as "NOT A SPY NUMBER".
	Step 10: End.*/