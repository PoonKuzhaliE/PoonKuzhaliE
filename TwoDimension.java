
public class TwoDimension {
public static void main(String args[]) {
	int a[][]= {{3,9,2},{0,9,6}};
	int b[][]= {{9,7,4},{4,7,6}};
	int c[][]=new int[2][3];
	for(int j=0;j<2;j++) {
		for(int k=0;k<3;k++) {  //
			c[j][k]=a[j][k]+b[j][k];
			System.out.print(c[j][k]+"  ");
		}
		System.out.println();
	}
}
}
