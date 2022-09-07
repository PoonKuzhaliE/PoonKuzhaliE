package programs;

 abstract public class AbstractClass {
abstract void display();
public void print() {
	System.out.println("non abstract method");
}
}
  class abc extends AbstractClass{
	  public void display() {
			System.out.println(" abstract method");
		}
  public static void main(String args[]) {
	
	  abc obj=new abc();
	  obj.display();
	  obj.print();
	}
}
