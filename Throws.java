package programs;

public class Throws {
		
	static int count=0;
	public static void primeNumbers() throws ArithmeticException{
	try {
			for(int i=1;i<=100;i++) {
				for(int j=0;j<=i;j++) {
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
	catch(ArithmeticException e) {
		 System.out.println("Exception handled");
	    throw new ArithmeticException();

	}
		}	
	public static void main(String[] args) {
primeNumbers();
}
}