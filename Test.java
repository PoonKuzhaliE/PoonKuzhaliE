package programs;

class Parent {
public void method1() {
	System.out.println("method1");
}
}
 class Child extends Parent{
	public void method1() {
		super.method1();
	System.out.println("method2");
}
}
 public class Test{
public static void main(String args[]) {
	Child obj=new Child();
	obj.method1();
}
}

