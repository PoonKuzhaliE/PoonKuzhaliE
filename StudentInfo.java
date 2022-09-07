import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentInfo {
	static class StudInfo {
		private int rollno;
		private String name;
		private int age;
		private String gender;

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
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

		public static void main(String args[]) {

			Scanner s = new Scanner(System.in);
			System.out.println(" STUDENTS DETAILS:");
			System.out.println();
			System.out.println("ENTER NO OF STUDENTS:");
			int x = (Integer.parseInt(s.nextLine()));
		//	ArrayList<StudInfo> stud = new ArrayList<StudInfo>();
			LinkedList<StudInfo>stud=new LinkedList<StudInfo>();
			for (int i = 0; i < x; i++) {
				StudInfo obj = new StudInfo();

				System.out.print("ENTER THE NAME      :");
				obj.setName(s.nextLine());
				System.out.print("ENTER THE ROLL_NO   :");
				obj.setRollno(Integer.parseInt(s.nextLine()));
				System.out.print("ENTER THE AGE       :");
				obj.setAge(Integer.parseInt(s.nextLine()));
				System.out.print("ENTER THE GENDER    :");
				obj.setGender(s.nextLine());
				stud.add(obj);

				System.out.println("---------INDIVIDUAL DETAILS ENTERED SUCCESSFULLY--------");
				System.out.println();
			}

			System.out.println("--------------------------------------------------------------");
			System.out.println("NAME" + "\t" + "|" + "ROLL" + "\t" + "|" + "AGE" + "\t" + "|" + "GENDER" + "\t" + "|");
			System.out.println("--------------------------------------------------------------");

			for (int i = 0; i < x; i++) {
				System.out.println(stud.get(i).getName() + "\t" + "|" + stud.get(i).getRollno() + "\t" + "|"
						+ stud.get(i).getAge() + "\t" + "|" + stud.get(i).getGender() + "\t" + "|");
				System.out.println("--------------------------------------------------------------");
			}

			System.out.println();
			for (int j = 0; j < 4; j++) {
				System.out.println();
				System.out.println(
						" YOU WANT TO ADD MORE STUDENT DETAILS ENTER 1,FOR DELETE ENTER 2 AND FOR CLOSE ENTER 0");
				int y = s.nextInt();
				s.nextLine();

				if (y == 1) {
					StudInfo obj = new StudInfo();

					System.out.print("ENTER THE NAME   :");
					obj.setName(s.nextLine());

					System.out.print("ENTER THE ROLL NO:");
					obj.setRollno(s.nextInt());

					System.out.print("ENTER THE AGE    :");
					obj.setAge(s.nextInt());
					s.nextLine();

					System.out.print("ENTER THE GENDER :");
					obj.setGender(s.nextLine());

					stud.add(obj);
					System.out.println("--------------------------------------------------------------");
					System.out.println(
							"NAME" + "\t" + "|" + "ROLL" + "\t" + "|" + "AGE" + "\t" + "|" + "GENDER" + "\t" + "|");
					System.out.println("--------------------------------------------------------------");

					for (int i = 0; i < stud.size(); i++) {
						System.out.println(stud.get(i).getName() + "\t" + "|" + stud.get(i).getRollno() + "\t" + "|"
								+ stud.get(i).getAge() + "\t" + "|" + stud.get(i).getGender() + "\t" + "|");
						System.out.println("--------------------------------------------------------------");
					}
				}

				else if (y == 2) {
					System.out.println("ENTER THE INDEX YOU WANT TO REMOVE");
					int z = s.nextInt();
					stud.remove(z);
					System.out.println("--------------------------------------------------------------");
					System.out.println(
							"NAME" + "\t" + "|" + "ROLL" + "\t" + "|" + "AGE" + "\t" + "|" + "GENDER" + "\t" + "|");
					System.out.println("--------------------------------------------------------------");

					for (int i = 0; i < stud.size(); i++) {
						System.out.println(stud.get(i).getName() + "\t" + "|" + stud.get(i).getRollno() + "\t" + "|"
								+ stud.get(i).getAge() + "\t" + "|" + stud.get(i).getGender() + "\t" + "|");
						System.out.println("--------------------------------------------------------------");
					}

				} else if (y == 3) {
					s.close();
					System.out.println("Scanner is inactive");
				} else {
					System.out.println("INVALID INPUT.KINDLY A ENTER VALID ONE");
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("YOUR DETAILS ARE ENTERED SUCCESSFULLY");
		}
	}
}
