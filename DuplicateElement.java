package programs;

public class DuplicateElement {
public static void main(String args[]) {
	int ar[]= {1,2,2,3,3,4,4,5,5,6};
	for(int i=0;i<ar.length;i++) {       //-->i=0 0<10  -->i=1 1<10  -->i=2 2<10  -->i=3 3<10
		for(int j=i+1;j<ar.length;j++) { //  j=1 1<10      j=2 2<10     j=3 3<10     j=4 4<10
			if(ar[i]==ar[j])             //  1==2         2==2         2==3          3==3
				System.out.println(ar[j]);
		}
	}
}
}


/*Algorithms:
	Step 1: Start
	Step 2: Initialize the array.
	Step 3: Using nested for loop to find the duplicates.
	Step 4: Compare the values from the nested for loop.
	Step 5: Check the values from the nested for loop are equal.
	Step 6: Print the checked values.
	Step 7: End.*/