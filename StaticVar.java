package programs;

public class StaticVar {

	static String name = "abc";
	static int age = 10;

	void display() {
		System.out.println(name + " " + age);
	}

	static public void main(String args[]) {
		StaticVar ob = new StaticVar();
		StaticVar ob1 = new StaticVar();
		ob.display();
		ob.name = "cde";
		ob.display();

		StaticVar.name = "efg";
		ob.display();
	}
	}