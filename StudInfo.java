import java.util.ArrayList;
import java.util.Scanner;

public class StudInfo {
	static class StudentsDetails {
		private int roll_no;
		private String name;
		private int age;
		private String gender;

		public int getRollno() {
			return roll_no;
		}

		public void setRollno(int rollno) {
			this.roll_no = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name_) {
			this.name = name_;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age_) {
			this.age = age_;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender_) {
			this.gender = gender_;
		}

		
	public static void main(String[] args) {
		StudentsDetails obj = new StudentsDetails();
		System.out.println("    STUDENT DETAILS     ");
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER NO OF STUDENTS : ");
		int num = (Integer.parseInt(s.nextLine()));
		ArrayList<StudentsDetails> stud = new ArrayList<StudentsDetails>();
		for (int i = 0; i < num; i++) {
			System.out.print("ENTER THE ROLLNO : ");
			obj.setRollno(Integer.parseInt(s.nextLine()));
			System.out.print("ENTER THE NAME   : ");
			obj.setName(s.nextLine());
			System.out.print("ENTER THE AGE    : ");
			obj.setAge(Integer.parseInt(s.nextLine()));
			System.out.print("ENTER THE GENDER : ");
			obj.setGender(s.nextLine());
			stud.add(obj);
			System.out.println("----------INDIVIDUAL DETAILS ENTERED SUCCESSFULLY----------");
			System.out.println();
		}
			System.out.println("+-------+-------+-------+-------+");
			System.out.println("|Name\t|Age\t|Roll\t|Gender\t|");
			System.out.println("+-------+-------+-------+-------+");

			System.out.println();
			System.out.println();
			for (int i = 0; i < stud.size(); i++) {
				System.out.println("|" + stud.get(i).getRollno() +"\t"+ "|" + stud.get(i).getName()+"\t"+"|"+stud.get(i).getAge()+"\t"+"|" +stud.get(i).getGender()+"\t"+"|");
				System.out.println("+-------+-------+-----+---------+");
			}

		
	

		//int menuChoice = 3;
	//	do {
			for(int j=0;j<4;j++) {
			System.out.println();
			System.out.println(" YOU WANT TO ADD MORE STUDENT DETAILS ENTER 1,FOR DELETE ENTER 2 AND FOR CLOSE ENTER 0");
		//	menuChoice = s.nextInt();
			int y=s.nextInt();
			if (y == 1) {
				System.out.print("ENTER THE ROLLNO : ");
				obj.setRollno(s.nextInt());
				System.out.print("ENTER THE NAME   : ");
				s.nextLine();
				obj.setName(s.nextLine());
				System.out.print("ENTER THE AGE    : ");
				obj.setAge(s.nextInt());
				s.nextLine();
				System.out.print("ENTER THE GENDER : ");
				obj.setGender(s.nextLine());

				stud.add(obj);
				System.out.println("----------INDIVIDUAL DETAILS ENTERED SUCCESSFULLY----------");
				System.out.println();
				System.out.println("+-------+-------+-------+-------+");
				System.out.println("|Name\t|Age\t|Roll\t|Gender\t|");
				System.out.println("+-------+-------+-------+-------+");

				System.out.println();
				System.out.println();
				for (int i = 0; i < stud.size(); i++) {
					System.out.println("|" + stud.get(i).getRollno() +"\t"+ "|" + stud.get(i).getName()+"\t"+"|"+stud.get(i).getAge()+"\t"+"|" +stud.get(i).getGender()+"\t"+"|");
					System.out.println("+-------+-------+-----+---------+");
				}
			} 
			else if (y == 2) {
				System.out.println("Enter rollno number of the Student do you want edit");
				int z =s.nextInt();
				
				System.out.println("+-------+-------+-------+-------+");
				System.out.println("|Name\t|Age\t|Roll\t|Gender\t|");
				System.out.println("+-------+-------+-------+-------+");
				stud.remove(z);
				for (StudentsDetails  s1: stud) {
					
					System.out.println(" " + s1.roll_no+ "         " + s1.name
							+ "           " + s1.age + "      " + s1.gender);
					System.out.println("+---------+-----------+-----+----------+");
				}
				
				System.out.println("\t\t1. Remove rollno\t2. remove Name\t3. Remove age\t4. Remove gender");
			}

		 } //while (menuChoice < 4);
	}
}}
