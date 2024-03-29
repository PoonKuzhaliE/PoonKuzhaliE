import java.util.ArrayList;
import java.util.Scanner;

//import StudentInfo.StudentsDetails;

public class StudentDetails2 {
	static class StudentsDetails{
	private int roll_no;
	private String name;

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

	private int age;
	private String gender;

	// public String toString() {
//	return " rollno: " + m_rollno + "name: " + m_name + ", age: " + m_age + ", gender: " + m_gender;
	// }
}

public static void main(String args[]) {
	System.out.println("\t\t\t\t Student Details");
	System.out.println();
	Scanner input = new Scanner(System.in);
	System.out.print("Number of Student : ");
	int num = (Integer.parseInt(input.nextLine()));
	ArrayList<StudentsDetails> stud = new ArrayList<StudentsDetails>();
	for (int i = 0; i < num; i++) {
		StudentsDetails std = new StudentsDetails();
		System.out.print("Rollno : ");
		std.setRollno(Integer.parseInt(input.nextLine()));
		System.out.print("Name   : ");
		std.setName(input.nextLine());
		System.out.print("Age    : ");
		std.setAge(Integer.parseInt(input.nextLine()));
		System.out.print("gender : ");
		std.setGender(input.nextLine());
		stud.add(std);
		System.out.println("*** Individual details entered successfully ***");
		System.out.println();
	}
	System.out.println("+-------+-------+-------+-------+");
	System.out.println("|Name\t|Age\t|Roll\t|Gender\t|");
	System.out.println("+-------+-------+-------+-------+");
	for (int i = 0; i < stud.size(); i++) {
		System.out.println("|"+ stud.get(i).getRollno() +"\t"+"|"+stud.get(i).getName()+"\t"+"|"+stud.get(i).getAge()+"\t"+"|"+ stud.get(i).getGender()+"\t"+"|");
		System.out.println("+-------+--------+-----+--------+");
	}

	int menuChoice = 3;
	do {
		System.out.println("\t\t\tEnter a Student Details");
		System.out.println("\t\t1. Add Student\t2. remove Students\t3. Exit");
		System.out.println("Enter a choice: ");
		menuChoice = input.nextInt();
		if (menuChoice == 1) {
			StudentsDetails std = new StudentsDetails();
			System.out.print("Rollno : ");
			std.setRollno(input.nextInt());
			System.out.print("Name   : ");
			input.nextLine();
			std.setName(input.nextLine());
			System.out.print("Age    : ");
			std.setAge(input.nextInt());
			System.out.print("gender : ");
			input.nextLine();
			std.setGender(input.nextLine());

			stud.add(std);
			System.out.println("***Individual details entered successfully***");
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
		else if (menuChoice == 2) {
			System.out.println("Enter rollno number of the Student do you want edit");
			int i =input.nextInt();
			
			System.out.println("+-------+-------+-------+-------+");
			System.out.println("|Name\t|Age\t|Roll\t|Gender\t|");
			System.out.println("+-------+-------+-------+-------+");
			stud.remove(i);
			for (StudentsDetails  s: stud) {
				
				System.out.println(" " + s.roll_no+ "         " + s.name
						+ "           " + s.age + "      " + s.gender);
				System.out.println("+---------+-----------+-----+----------+");
			}
			
			System.out.println("\t\t1. Remove rollno\t2. remove Name\t3. Remove age\t4. Remove gender");
		}

	 } while (menuChoice < 4);
}
	}
