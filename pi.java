import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class pi {
public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	Stack<Integer> stk = new Stack<Integer>();
	System.out.println("Press 1 to know the Recharge Offers");
	System.out.println("Press 2 to set the Caller Tunes ");
	System.out.println("Press 3 to give Complaints ");
	System.out.println();
	
	System.out.println("Click option");
	int option = sc.nextInt();
	sc.nextLine();
	
	
	do {
		 stk.push(option);
		if (option == 1) {
			ArrayList<String>obj=new ArrayList<String>();
			obj.add("Press 1.Popular Plans");
			obj.add("Press 2.Annual Plans");
			
			System.out.println("Press 3.4G Data Plans");
			System.out.println("Press 4. ISD Plans");
			System.out.println("Press 5.TOP-UP Plans");
			System.out.println();
			System.out.println("Press 7. to go to Main Menu");
			System.out.println();

			System.out.println("Click option");
			option = sc.nextInt();
			sc.nextLine();
			if (option == 1) {
				System.out.println("Recharge Rs.299 and get Data  2GB/D  Validity 28 Days");
				System.out.println("Recharge Rs.239 and get Data 1.5GB/D Validity 28 Days");
				System.out.println("Recharge Rs.199 and get Data 1.5GB/D Validity 23 Days");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				

				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();
				
			}
			if (option == 2) {
				System.out.println("Recharge Rs.2999 and get Data  2.5GB/D  Validity 365 Days");
				System.out.println("Recharge Rs.2879 and get Data  2GB/D    Validity 365 Days");
				System.out.println("Recharge Rs.2545 and get Data  1.5GB/D  Validity 365 Days");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				

				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();

			}
			if (option == 3) {
				System.out.println("Recharge Rs.121 and get Data  12GB   Validity : Existing Plan");
				System.out.println("Recharge Rs.61 and get Data   6GB    Validity : Existing Plan");
				System.out.println("Recharge Rs.25 and get Data   2GB    Validity : Existing Plan");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				

				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();
			}
			if (option == 4) {
				System.out.println("Recharge Rs.501 and get TalkTime : Rs.424.58   Validity : 28 Days");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				

				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();
			}
			if (option == 5) {
				System.out.println("Recharge Rs.1000  and get TalkTime Rs.844.46   Validity 28 Days");
				System.out.println("Recharge Rs. 500  and get TalkTime Rs.420.73   Validity 28 Days");
				System.out.println("Recharge Rs. 100  and get TalkTime Rs. 81.75   Validity 23 Days");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				
				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();

			}
			if(option==6) {
				System.out.println(("Press 1.Popular Plans"));
				System.out.println("Press 2.Annual Plans");
				System.out.println("Press 3.4G Data Plans");
				System.out.println("Press 4. ISD Plans");
				System.out.println("Press 5.TOP-UP Plans");
				System.out.println();
				System.out.println("Press 7. to go to Main Menu");
				System.out.println();

				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();
			}
			if(option==7) {
				stk.pop();
				System.out.println("Press 1 to know the Recharge Offers");
				System.out.println("Press 2 to set the Caller Tunes ");
				System.out.println("Press 3 to give Complaints ");
				System.out.println();
				
				System.out.println("Click option");
				 option = sc.nextInt();
				sc.nextLine();
			}

		}
		if (option == 2) {
			System.out.println("Press 1 to Tamil CallerTunes");
			System.out.println("Press 2 to English CallerTunes");
			System.out.println("Press 3 to Telugu CallerTunes");
			System.out.println("Press 4 to Malayalam CallerTunes");
			System.out.println("Press 5 to Hindi CallerTunes");
			System.out.println("Press 7. to go to Main Menu");
			System.out.println();
			System.out.println("Click option");
			option = sc.nextInt();
			sc.nextLine();
			if (option == 1) {
				System.out.println("Press 1 to set Arabic Kuthu From Beast");
				System.out.println("Press 2 to set Yaar Azhaippathu From Maara");
				System.out.println("Press 3 to set Mother Song From Valimai");
				System.out.println("Press 4 to set Muthal Nee Mudivum Nee From Muthal Nee Mudivum Nee");
				System.out.println("Press 5 to set Dum Dum From Enemy");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				
				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();

			}
			if (option == 2) {
				System.out.println("Press 1 to set Despacito");
				System.out.println("Press 2 to set Shape of You");
				System.out.println("Press 3 to set Gangnam Style");
				System.out.println("Press 4 to set Believer");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				
				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();

			}
			if (option == 3) {
				System.out.println("Press 1 to set Kalakkatha from Ayyappanum Koshiyum");
				System.out.println("Press 2 to set Podipparana from Queen");
				System.out.println("Press 3 to set Kudukku song from Love Action Drama");
				System.out.println("Press 4 to set Malarae from Premam");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				
				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();
			}
			if (option == 4) {
				System.out.println("Press 1 to set Sree Valli from Pushpa");
				System.out.println("Press 2 to set Nattu Nattu from RRR");
				System.out.println("Press 3 to set Inkem Inkem from Geetha Govindham");
				System.out.println("Press 4 to set Maate Vinathuga from Taxiwala");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				
				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();

			}
			if (option == 5) {
				System.out.println("Press 1 to set Jai Jai ShivShankar from War");
				System.out.println("Press 2 to set Sultan Title Song from Sultan");
				System.out.println("Press 3 to set Jab Tak from M S Dhoni The Untold Story");
				System.out.println("Press 4 to set Tum Hi Ho from Aashiqui 2");
				System.out.println();
				System.out.println("Press 6. to go to Back Menu");
				
				System.out.println("Press 7. to go to Main Menu");
				
				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();

			}
			if(option==6) {
				System.out.println("Press 1 to Tamil CallerTunes");
				System.out.println("Press 2 to English CallerTunes");
				System.out.println("Press 3 to Telugu CallerTunes");
				System.out.println("Press 4 to Malayalam CallerTunes");
				System.out.println("Press 5 to Hindi CallerTunes");
				System.out.println("Press 7. to go to Main Menu");
				System.out.println();
				System.out.println("Click option");
				option = sc.nextInt();
				sc.nextLine();
				}
			if(option==7) {
				stk.pop();
				System.out.println("Press 1 to know the Recharge Offers");
				System.out.println("Press 2 to set the Caller Tunes ");
				System.out.println("Press 3 to give Complaints ");
				System.out.println();
				
				System.out.println("Click option");
				 option = sc.nextInt();
				sc.nextLine();
				}
			
		}
		if (option == 3) {
			System.out.println("To register any Complaint call 198");
			System.out.println();
			System.out.println("Want to know about Recharge Plan call 1991");
			System.out.println();
			System.out.println("Want to reach jio network from Another networks call 1800 889 9999");
			System.out.println();
			
			System.out.println("Press 7 to go to Main Menu");
			
			System.out.println("Click option");
			option = sc.nextInt();
			sc.nextLine();
		}
		if(option==7) {
			System.out.println("Press 1 to know the Recharge Offers");
			System.out.println("Press 2 to set the Caller Tunes ");
			System.out.println("Press 3 to give Complaints ");
			System.out.println();
			
			System.out.println("Click option");
			 option = sc.nextInt();
			sc.nextLine();
			
		}
	}while(option!=3);
	

}
}
