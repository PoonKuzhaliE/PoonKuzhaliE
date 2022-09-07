package programs;

public class GetterSetter {
	private int length, breadth;

	int area() {
		int c = length * breadth;
		return c;
	}

public int getLength() {
	return length;
}

public void setLength(int l) {
	length = l;
}

public int getBreadth() {
	return breadth;
}

public void setBreadth(int b) {
   breadth = b;
}

	public static void main(String args[]) {
		GetterSetter obj=new GetterSetter();
		obj.setBreadth(10);
		obj.setLength(20);
		System.out.println("Area of reactangle:"+obj.area());
	}
}