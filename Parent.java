package multilevel;

 class parent {//MULTI
public void parentAsset() {
	System.out.println("assets belonging to parents");
}
}
class Child extends parent{
	public void parentAsset() {
		System.out.println("assets belonging to parent");
	}	
	public void childAsset() {
		System.out.println("assets belonging to child");
	}
}
class GrandChild extends Child{
	public void childAsset() {
		System.out.println("assets belonging to child");
	}
}

public class Parent {
public static void main(String args[]) {
	GrandChild obj=new GrandChild();
	obj.childAsset();
	obj.parentAsset();
    obj.childAsset(); 
}
}
