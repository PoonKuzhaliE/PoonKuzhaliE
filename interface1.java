package programs;
interface sports3{
	void print();
	default void display() {
		System.out.println("bjkfjbsadlmsanmcn");
	}
}
public class interface1 implements sports3 {
		//public static void main(String args[]) {
		public void print(){
			System.out.println("print");
		}  	
		public  void display() {
			System.out.println("display");
		}

	 }

	class abcinterface{
		public static void main(String args[]) {
			interface1 obj=new interface1();
			obj.print();
			obj.display();
		}
}
