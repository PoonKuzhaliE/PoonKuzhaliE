package programs;

public class ArrayProgram {
	public static void main(String[] args)   
	{  
		
	//creating two instances of the Employee class  
		ArrayProgram emp1 = new ArrayProgram();  
		ArrayProgram emp2 = new ArrayProgram();  
	//invoking hashCode() method  
	int a=emp1.hashCode();  
	int b=emp2.hashCode();  
	System.out.println("hashcode of emp1 = " + a);  
	System.out.println("hashcode of emp2 = " + b);  
	System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));  
	}  
	public static void main(String[] args) {
		ArrayProgram emp1 = new ArrayProgram();  
		int a=emp1.hashCode();  
		System.out.println("hashcode of emp1 = " + a);  

	}
}

