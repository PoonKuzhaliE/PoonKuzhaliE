import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class AadhaarInfoStack {
	static Scanner input = new Scanner(System.in);

	public enum Level1 {
		OPTION_1("1.English"), OPTION_2("2.Tamil"), OPTION_3("3.Hindi");

		private final String text;

		Level1(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level2 {
		OPTION_1("1.To know the Aadhaar Enrollment or update status PRESS 1"),
		OPTION_2("2.To know the Aadhaar Enrollment status of your existing complaint PRESS 2"),
		OPTION_3("3.To know the Benefits and Features of Aadhaar PRESS 3"),
		OPTION_4("4.To If u want to talk to our available representative PRESS 4"),
		OPTION_5("5.If you lost or misplaced your aadhaar and need retrieve PRESS 5"),
		OPTION_9("9.If you want to visit previous page press 9 ");

		private final String text;

		Level2(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Option1 {
		OPTION_1("* Name"),
		OPTION_2("* EID"),
		OPTION_3("* DOB"),
		OPTION_9("If you want to visit previous page press 9");

		public static void method1() {
			System.out.println("Enter your Aadhaar Enrollment Id with Date and TimeStamp");
			int i = input.nextInt();
			System.out.println("Enter your Name");
			String i2 = input.next();
			System.out.println("Enter your DOB");
			String i3 = input.next();
			System.out.println();

		}

		private final String text;

		Option1(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Option2 {
		OPTION_1("* Name "),
		OPTION_2("* DOB"),
		OPTION_3("* Complaint no"),
		OPTION_9("If you want to visit previous page press 9");

		public static void method2() {
			System.out.println("Enter your Name");
			String i4 = input.next();
			System.out.println("Enter your Aadhaar Enrollment Id");
			int i2 = input.nextInt();
			System.out.println("Enter your complaint number");
			int i3 = input.nextInt();
			System.out.println();

		}

		private final String text;

		Option2(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}
	public enum Option3 {
		OPTION_1(
				"A 12-digit number that is provided by the Unique Identification Authority of India (UIDAI) is the Aadhaar Card. Various details such as iris scans, fingerprints, and photographs are linked to the Aadhaar Card. The Aadhaar Card can be used as proof of identity and address. In order to file the Income Tax Returns, the Aadhaar and PAN must be linked .The Aadhaar program was constituted in 2016 when the Unique Identification Authority of India (UIDAI) was set up. All Aadhar cards are issued through the UIDAI, which collects the cardholder’s demographic and biometric data to enable a more streamlined and transparent method of allocating certain government benefits and subsidies to citizens.\n"),
		OPTION_9("9.If you want to visit previous page press 9 ");
		
		private final String text;

		Option3(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}



	public enum Option5 {
		OPTION_1("* EID"),
		OPTION_2("* DATE AND TIME STAMP"),
		OPTION_3("* CONTACT NO"),
		OPTION_4("* PINCODE"),
		OPTION_5(" * DOB"),
		OPTION_9("If you want to visit previous page press 9 ");

		public static void method5() {
			System.out.println("WELCOME TO AADHAAR SERVICE CENTRE");
			System.out.println();
			System.out.println("Enter your Enrollment Id ");
			int enid = input.nextInt();
			System.out.println("Enter your Date n Time ");
			int date = input.nextInt();
			System.out.println("Enter your last 4 digit mobile number ");
			int mob = input.nextInt();
			System.out.println("Enter your DOB");
			String dob = input.next();
			System.out.println("Enter your Pincode ");
			int pin = input.nextInt();
			System.out.println("THANKS FOR CALLING US.FOR FUTHER DETAILS,PLEASE VISIT WWW.uidai.gov.in");
			System.out.println();
		}

		private final String text;

		Option5(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Option6 {
		OPTION_1("* EID "),
		OPTION_2(" email ID"),
		OPTION_9("If you want to visit previous page press 9 ");

		private final String text;

		public static void method6() {
			System.out.println("Enter your Aadhaar Number or Enrollment Id ");

			int X1 = input.nextInt();
			System.out.println("Enter your registered mobile number or e_mail id ");
			int X2 = input.nextInt();
			System.out.println(
					"A OTP will send to your mobile number/mail id.By using this you can download yours in our official website ");
			System.out.println();

		}

		Option6(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}


	
	static class SelectedOptions {
		private int level;
		private int choice;

		SelectedOptions(int level, int choice) {
			this.level = level;
			this.choice = choice;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public int getChoice() {
			return choice;
		}

		public void setChoice(int choice) {
			this.choice = choice;
		}

	}


	static Stack<SelectedOptions> backStack = new Stack<SelectedOptions>();

	public static void main(String args[]) {
		System.out.println("UNIQUE IDENTIFICATION AUTHORITY OF INDIA");

		for (String choice : getChoices(0, 0)) {

			System.out.println(choice);
			backStack.push(new SelectedOptions(0, 0));
		}
		//System.out.println(+backStack.size());

		int choice;
		do {
			System.out.println("Enter your option : ");
			choice = input.nextInt();
			
			if (choice == 9) {
				backStack.pop();
				if (backStack.isEmpty()) {
					System.out.println("Enter a valid option to go back");
					break;
				}
			} else {
				backStack.push(new SelectedOptions(backStack.peek().level + 1, choice));
			}
			SelectedOptions top = backStack.peek();
			print(top.level, top.choice);

		} while (true);
	}

	private static void print(int level, int choice) {

		for (String choiceString : getChoices(level, choice)) {
			System.out.println(choiceString);

		}
	}

	static ArrayList<String> getChoices(int level, int choice) {
		ArrayList<String> choiceList = new ArrayList();
		System.out.println();


		if (level == 0) {
			choiceList.add(Level1.OPTION_1.toString());
			choiceList.add(Level1.OPTION_2.toString());
			choiceList.add(Level1.OPTION_3.toString());
		} else if (level == 1) {

			switch (choice) {
			case 1: {
				choiceList.add(Level2.OPTION_1.toString());
				choiceList.add(Level2.OPTION_2.toString());
				choiceList.add(Level2.OPTION_3.toString());
				choiceList.add(Level2.OPTION_4.toString());
				choiceList.add(Level2.OPTION_5.toString());
				choiceList.add(Level2.OPTION_9.toString());

				break;
			}
			case 2: {
				choiceList.add(Level2.OPTION_1.toString());
				choiceList.add(Level2.OPTION_2.toString());
				choiceList.add(Level2.OPTION_3.toString());
				choiceList.add(Level2.OPTION_4.toString());
				choiceList.add(Level2.OPTION_5.toString());
				choiceList.add(Level2.OPTION_9.toString());

				break;
			}
			case 3: {
				choiceList.add(Level2.OPTION_1.toString());
				choiceList.add(Level2.OPTION_2.toString());
				choiceList.add(Level2.OPTION_3.toString());
				choiceList.add(Level2.OPTION_4.toString());
				choiceList.add(Level2.OPTION_5.toString());
				choiceList.add(Level2.OPTION_9.toString());
				break;
			}
			}
		} else if (level == 2) {
			switch (choice) {
			case 1:
				choiceList.add(Option1.OPTION_1.toString());
				choiceList.add(Option1.OPTION_2.toString());
				choiceList.add(Option1.OPTION_9.toString());
				Option1.method1();
				break;
			case 2:
				choiceList.add(Option2.OPTION_1.toString());
				choiceList.add(Option2.OPTION_2.toString());
				choiceList.add(Option2.OPTION_3.toString());
				choiceList.add(Option2.OPTION_9.toString());
				Option2.method2();
				break;
			case 3:
				choiceList.add(Option3.OPTION_1.toString());
				choiceList.add(Option3.OPTION_9.toString());
				break;
			case 4:
				choiceList.add(Option5.OPTION_1.toString());
				choiceList.add(Option5.OPTION_2.toString());
				choiceList.add(Option5.OPTION_3.toString());
				choiceList.add(Option5.OPTION_4.toString());
				choiceList.add(Option5.OPTION_5.toString());
				choiceList.add(Option5.OPTION_9.toString());
				Option5.method5();
				break;

			case 5:
				choiceList.add(Option6.OPTION_1.toString());
				choiceList.add(Option6.OPTION_2.toString());
				choiceList.add(Option6.OPTION_9.toString());
				Option6.method6();
				break;
			}
			
		} 
			 
		return choiceList;
	}
}
