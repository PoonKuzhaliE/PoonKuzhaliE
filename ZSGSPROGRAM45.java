package ZSGSPROGRAMS;

public class ZSGSPROGRAM45 {
public static void main(String args[]) {
//	int a=123456;
//	int count=0;
//	int temp=0;
//	
//	while(a!=0) {
//		a=a/10;//123456 12345 1234 123 12 1
//		count=++temp;//1 2 3 4 5 6
//	}
//	System.out.println(count);
	
	int a=1234567;
	int temp=0;int count=0;
	while(a!=0) {
		a=a/10;
		temp=++count;
	}
	System.out.println(temp);

	}
}
