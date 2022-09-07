package ZSGSPROGRAMS;

public class ZSGSPROGRAM43 {
	public static void main(String args[]) {
		int a = 4, b = 6,gcd=0;
	for(int i=1;i<=a&&i<=b;i++) {
		if(a%i==0&&b%i==0)
			gcd=i;
	}
	int lcm=(a*b)/gcd;
	System.out.println("lcm of a and b is:"+lcm);
//		int gcd = 0;
//		for (int i = 1; i <= a && i <= b; i++) {
//			if (a % i == 0 && b % i == 0)
//				gcd = i;
//		}
//		System.out.println("gcd of a and b is:" + gcd);
//
//		int lcm = (a * b) / gcd;
//		System.out.println("lcm of a and b is:" + lcm);

	}
}
