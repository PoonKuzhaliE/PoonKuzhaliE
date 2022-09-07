import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SampleStack {
	public static void main(String args[]) {
		Stack<ArrayList<String>> sta = new Stack<ArrayList<String>>();

		System.out.println("UNIQUE IDENTIFICATION AUTHORITY OF INDIA");
		System.out.println();
		Scanner s = new Scanner(System.in);
		System.out.println(
				"TO CONTINUE IN HINDI ENTER 1,FOR ENGLISH ENTER 2,FOR TAMIL ENTER 3,FOR TELUGU ENTER 4,FOR KANNADA ENTER 5,FOR MALAYALAM ENTER 6");
		int a1 = s.nextInt();
		System.out.println();

		System.out.println("WELCOME TO AADHAAR SERVICE CENTRE(language depends....)");
		System.out.println();

		ArrayList<String> st = new ArrayList<String>();
		st.add("To know the Aadhaar Enrollment or update status PRESS 1");
		st.add("To know the Aadhaar Enrollment status of your existing complaint PRESS 2");
		st.add("To know the Benefits and Features of Aadhaar PRESS 3");
		st.add("If u want to know about e-aadhaar PRESS 4");
		st.add("If u want to talk to our available representative PRESS 5");
		st.add("To repeat this message PRESS 6");
		st.add("If you lost or misplaced your aadhaar and need retrieve PRESS 7");
		st.add("-------------------------------------------------------------------");
		sta.push(st);
		for (String X1 : st) {
			System.out.println(X1);
		}
		int x1 = s.nextInt();

		switch (x1) {
		case 1:
		{
			System.out.println("Enter your Aadhaar Enrollment Id with Date and TimeStamp");
			int ae = s.nextInt();
			break;
		}
		case 2: 
		{
			System.out.println("Enter your enrollment number ");
			int en = s.nextInt();
			System.out.println("Enter your complaint number");
			int comp = s.nextInt();
			break;
		}
		case 3:
		{
			System.out.println("DIGITAL LIFE CERTIFICATE");
			System.out.println("12 Digit Identification Number for every resident of India");
			break;
		}
		case 4:
		{
			System.out.println("Visit our official UIDAI website WWW.uidai.gov.in and enter the appropriate details");
			break;
		}
		case 5: 
		{
			System.out.println("WELCOME TO AADHAAR SERVICE CENTRE");
			System.out.println();
			System.out.println("Enter your Enrollment Id ");
			int enid = s.nextInt();
			System.out.println("Enter your Date n Time ");
			int date = s.nextInt();
			System.out.println("Enter your last 4 digit mobile number ");
			int mob = s.nextInt();
			System.out.println("Enter your DOB");
			String dob = s.next();
			System.out.println("Enter your Pincode ");
			int pin = s.nextInt();
			System.out.println("THANKS FOR CALLING US.FOR FUTHER DETAILS,PLEASE VISIT WWW.uidai.gov.in");
			break;
		}
		case 6: 
		{
			System.out.println("To know the Aadhaar Enrollment or update status PRESS 1");
			System.out.println("To know the Aadhaar Enrollment status of your existing complaint PRESS 2");
			System.out.println("To know the Benefits and Features of Aadhaar PRESS 3");
			System.out.println("If u want to know about e-aadhaar PRESS 4");
			System.out.println("If u want to talk to our available representative PRESS 5");
			System.out.println("To repeat this message PRESS 6");
			System.out.println("if u  lost or misplaced your aadhaar and need retrieve PRESS 7");
			int X = s.nextInt();
			if (X == 1)
				System.out.println("Enter your Aadhaar Enrollment Id with Date and TimeStamp");
			else if (X == 2) {
				System.out.println("Enter your enrollment number ");
				int en = s.nextInt();
				System.out.println("Enter your complaint number");
				int comp = s.nextInt();
			} else if (X == 3) {
				System.out.println("DIGITAL LIFE CERTIFICATE");
				System.out.println("12 Digit Identification Number for every resident of India");
			} else if (X == 4)
				System.out
						.println("Visit our official UIDAI website WWW.uidai.gov.in and enter the appropriate details");
			else if (X == 5) {
				System.out.println("WELCOME TO AADHAAR SERVICE CENTRE");
				System.out.println("Enter your Enrollment Id ");
				int enid = s.nextInt();
				System.out.println("Enter your Date n Time ");
				int date = s.nextInt();
				System.out.println("Enter your last 4 digit mobile number ");
				int mob = s.nextInt();
				System.out.println("Enter your DOB");
				int dob = s.nextInt();
				System.out.println("Enter your Pincode ");
				int pin = s.nextInt();
				System.out.println("THANKS FOR CALLING US.FOR FUTHER DETAILS,PLEASE VISIT WWW.uidai.gov.in");
				break;
			} else if (X == 7) {
				System.out.println("Enter your Aadhaar Number or Enrollment Id ");
				int X1 = s.nextInt();
				System.out.println("Enter your registered mobile number or e_mail id ");
				int X2 = s.nextInt();
				System.out.println(
						"A OTP will send to your mobile number/mail id.By using this you can download yours in our official website ");
			}
		}
		case 7: 
		{
			System.out.println("Enter your Aadhaar Number or Enrollment Id ");
			int X1 = s.nextInt();
			System.out.println("Enter your registered mobile number or e_mail id ");
			int X = s.nextInt();
			System.out.println(
					"A OTP will send to your mobile number/mail id.By using this you can download yours in our official website ");
			break;
		}
		default: {
			System.out.println("Enter a valid number");
		}

			for (int i = 0; i < st.size(); i++) {
				System.out.println();
				System.out.println("To Go Back to main menu press #");
				char S1 = s.next().charAt(0);

				if (S1 == '#') 
					sta.push(st);
				
				for (String S : st) {
					System.out.println(S);
				}

			}
		}

			System.out.println("Press * for comfirmation and @ for retype");
			char S2 = s.next().charAt(0);
			if (S2 == '*') {
				System.out.println("confirmed");
			} else if (S2 == '@') {
				System.out.println("for retype");
				int re = s.nextInt();
			} else {
				System.out.println("Enter a valid number ");
			}

			System.out.println("---------MY AADHAAR, MY IDENTITY-----------");
			System.out.println();

		}

	}

