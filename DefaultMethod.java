package programs;
interface a{
	void display();
}
interface b{
	void display();
	default void test1(){
		System.out.println("default mathod");
	}
	int a=0;
	default void test1(int a) {

		System.out.println("tes mathod "+a);
	}
	
	static void print() {
		System.out.println("print mathod");
	}
}
public class DefaultMethod implements b,a{
	
	public void display(){//abstract method
		System.out.println("display mathod");
	}
	@Override
	public void test1(){//class method
		System.out.println(" override default mathod");
	}
//	
//	public void test1(){//override default
//		System.out.println("test1 mathod"+a);
//	}
//	static void print1() {
//		System.out.println("tes mathod");
//	}
//	
public static void main(String args[]) {
DefaultMethod obj=new DefaultMethod();
obj.display();
obj.test1();
obj.test1(4);
b.print();
	}
	}