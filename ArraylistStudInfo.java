import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistStudInfo {

	String name;
	int roll_no;
	String gender;
	int age;

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		List<String> name = new ArrayList<String>();
		List<Integer> roll_no = new ArrayList<Integer>();
		List<String> gender = new ArrayList<String>();
		List<Integer> age = new ArrayList<Integer>();

		System.out.println("STUDENT DETAILS");
		System.out.println();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of students");
		int x = s.nextInt();
		s.nextLine();
		for (int i = 0; i < x; i++) {
			System.out.println("ENTER THE NAME:");
			name.add(s.nextLine());

			System.out.println("ENTER THE ROLL NO:");
			roll_no.add(s.nextInt());

			System.out.println("ENTER THE AGE:");
			age.add(s.nextInt());
			s.nextLine();

			System.out.println("ENTER THE GENDER:");
			gender.add(s.nextLine());

			System.out.println("---------INDIVIDUAL DETAILS ENTERED SUCCESSFULLY--------");
			System.out.println();

		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("NAME          | ROLL_NO           | AGE              | GENDER |");
		System.out.println("--------------------------------------------------------------");

		for (int i = 0; i < x; i++) {
			System.out.println(name.get(i) + "            |   " + roll_no.get(i) + "              |   " + age.get(i)
					+ "             |   " + gender.get(i) + "   |");
			System.out.println("--------------------------------------------------------------");
		}

		System.out.println();
		int option = 0;
		do {
			System.out
					.println(" YOU WANT TO ADD MORE STUDENT DETAILS ENTER 1,FOR DELETE ENTER 2 AND FOR CLOSE ENTER 3");
			option = s.nextInt();
			s.nextLine();
			if(option<=2&&option!=3)
			System.out.println("Enter the no of students you want to add or delete");
			int count = s.nextInt();
		
			s.nextLine();
			for (int i = 0; i < count; i++) {
				if (option == 1) {
					System.out.println("ENTER THE NAME:");
					name.add(s.nextLine());
					s.nextLine();

					System.out.println("ENTER THE ROLL NO:");
					roll_no.add(s.nextInt());

					System.out.println("ENTER THE AGE:");
					age.add(s.nextInt());
					s.nextLine();

					System.out.println("ENTER THE GENDER:");
					gender.add(s.nextLine());

					System.out.println("---------INDIVIDUAL DETAILS ENTERED SUCCESSFULLY--------");
					System.out.println();

				}

				else if (option == 2) {
					System.out.println("enter the index no you want to remove");
					int z = s.nextInt();
					name.remove(z);
				}
						}

			System.out.println("--------------------------------------------------------------");
			System.out.println("NAME          | ROLL_NO           | AGE              | GENDER |");
			System.out.println("--------------------------------------------------------------");

			for (int i = 0; i < name.size(); i++) {
				System.out.println(name.get(i) + "            |   " + roll_no.get(i) + "              |   " + age.get(i)
						+ "             |   " + gender.get(i) + "   |");
				System.out.println("--------------------------------------------------------------");
			}
		} while (option < 3);
		s.close();
	}
}
