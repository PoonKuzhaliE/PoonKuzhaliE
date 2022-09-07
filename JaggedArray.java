package programs;

public class JaggedArray {
	public void display() {
		System.out.println("displaying a method");
	}
}
	
	class bef extends JaggedArray {
		public void display() {
			System.out.println("testing a method");
		}
	}
	class def extends bef{
		public void demo() {
			System.out.println("demo a method");
			super.display();
			//this.demo();
		}
	
	public static void main(String args[]) {
		def obj=new def();
		obj.demo();
		
		//JAGGED ARRAY
		
//int a[][]= {
//		{1,2,3,4,5,6},
//		{2,3,4},
//		{4,5,6,7}
//		};
//for(int k[]:a) {
//	for(int l:k) {
//	System.out.print(" "+l);
//}
//	System.out.println();
//}
////ASCII
//
//for(int i=0;i<=255;i++) {
//	if(i<=32) { 
//		continue;
//		
//}
//	System.out.println("i:"+i+"="+(char)i);
//}
	
}
}
