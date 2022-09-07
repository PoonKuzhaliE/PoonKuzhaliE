
public class OneDimension {
	public static void main(String args[]) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[3] = 40;
		a[4] = 50;
		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}
	}
}
