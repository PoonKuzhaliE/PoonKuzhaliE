package programs;

public class ReverseString {
public static void main(String[] args) {
	    StringBuilder s=new StringBuilder("dadq"); 
      StringBuilder rev= s.reverse();  
    
    if(s.equals(rev)){  
        System.out.println("palindrome");
    }else{  
        System.out.println("not ");

    }  

	}
}