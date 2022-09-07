package programs;
interface A{
	void display();
}
interface B extends A{
	void test();
}
public class MyProgram implements B {
public void display() {
	System.out.println("METHOD 1");
}
public void test() {
	System.out.println("METHOD 2");
}
public static void test2() {
	System.out.println("METHOD 3");

}
public static void main(String args[]) {
	MyProgram obj=new MyProgram();
	obj.display();
	obj.test();
	test2();
}
}
