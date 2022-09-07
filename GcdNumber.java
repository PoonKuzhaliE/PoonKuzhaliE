package programs;

public class GcdNumber {
public static void main(String args[]) {
	int a=12,b=4,x=1;
	for(int i=1;i<=a&&i<=b;i++){ //-->i=1,1<=12&&1<=4,       -->i=2,2<=12 && 2<=4,  -->i=3,3<=12 && 3<=4
		if(a%i==0&&b%i==0) {     //  12%1==0 && 4%1==0        12%2==0 && 4%2==0      12%3==0 && 4%3==0
			x=i;                 //  x=1                        x=2                   x=3
		}                        //i++                         i++                    i++
	}
	System.out.println(x);    //-->i=4,4<=12 && 4<=4       i=5,5<=12 && 5<=4 -condition fails
}                             //  12%4==0 && 4%4==0         
}                             //  x=4 i++

/*Algorithms:
	Step 1: Start
	Step 2: Create three instance variable a, b and x and assign value.
	Step 3: Using for loop with the condition that the iteration value should be lesser than or equal to the
	        two variables a and b.
	Step 4: If the condition satisfies,enter into if statement.
	Step 5: If the iteration(i) value satisfies the if condition,store the iteration value in the variable x.
	Step 6: Print the x variable.
	Step 7: End.*/
	