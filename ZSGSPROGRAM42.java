package ZSGSPROGRAMS;

public class ZSGSPROGRAM42 {
public static void main(String args[]) {
	int a=4,b=6;
	int gcd = 0;
	for(int i=1;i<=a&&i<=b;i++) {
		
			if(a%i==0&&b%i==0) 
           gcd=i;
			}
	
			System.out.println("GCD of two numbers:"+gcd);
			}
	}
