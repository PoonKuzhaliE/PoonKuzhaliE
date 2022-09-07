package programs;

public class PrimeNumber {
		int a = 7;
		int count = 0;
		public void checkprime(){//prime or not
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++; // Here count is a factor.If a number is divisible by 1 or itself its a prime
							// number
			}
		}
		if (count == 2) {// so the prime number has only two factors
			System.out.println("prime");
		} else {
			System.out.println("not a prime");
		}
		}
		
		
		
		public void primeInterval() {//prime interval
			int a=100;
			int count=0;
			
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						count++;
				}	
				}
			if(count==2) {
				System.out.println(i+" ");
			}
			count=0;
			}
			}
	
		public static void main(String args[]) {
			PrimeNumber obj =new PrimeNumber();
			obj.checkprime();
			obj.primeInterval();
		}
	}

		
		
