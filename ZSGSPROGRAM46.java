package ZSGSPROGRAMS;

public class ZSGSPROGRAM46 {
public static void main(String args[]) {
//	int a=374;//reverese a number
//	int rev=0;
//	
//	while(a>0) {
//    int	b=a%10;
//	rev=rev*10+b;
//     a=a/10;
//     //condition true
//     //b=34%10=4
//     //rev=4
//     //a=3
//     //b=3
//     //rev=3
//     //a=0
//     //rev=4*10+3=43
//     
//	}
//	System.out.println(+rev);
	
	int a=564;
	int rev=0;
	while(a!=0) {
	int	b=a%10;
		rev=rev*10+b;
		a=a/10;
	}
	System.out.println(+rev);

}
}
