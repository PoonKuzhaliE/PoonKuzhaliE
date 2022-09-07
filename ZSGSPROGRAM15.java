package ZSGSPROGRAMS;

public class ZSGSPROGRAM15 {
		 public static void main (String args[]){
		int a=1,b=3,c=-10;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ;
		int D=b*b-4*a*c;
		int x=2*a;
		double X=Math.sqrt(D);
		double type1=(-b+X)/x;

		double type2=(-b-X)/x;
		System.out.println("result1:"+type1);
		System.out.println("result2:"+type2);
		if(D>0){
			System.out.println("the roots are real and unequal");
		}
		if(D<0){
		System.out.println("the roots are complex and unequal");
		}
		if(D==0){
			System.out.println("the roots are real and equal");
		}
		}

}
