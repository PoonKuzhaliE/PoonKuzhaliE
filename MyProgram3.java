import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MyProgram3 {

	enum Level1 {
		OPT_1("1.TAMIL"), OPT_2("2.ENGLISH"), OPT_3("3.HINDI");

		String text;

		Level1(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level1_1 {
		OPT_1_1("1.RECHARGE"), OPT_1_2("2.CALLERTUNES"), OPT_1_3("3.COMPLAINTS"), OPT_1_4("4.BACK");

		final String text;

		Level1_1(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level1_1_1 {
		OPT_1_1_1("1.Recharge Rs.150 and Get TalkTime of Rs.150   Validity: 90 Days"),
		OPT_1_1_2("2.Recharge Rs.220 and Get TalkTime of Rs.220   Validity: 120 Days"),
		OPT_1_1_3("3.Recharge Rs.500 and Get TalkTime of Rs.500   Validity: 200 Days"), OPT1_1_4("4.BACK");

		final String text;

		Level1_1_1(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level1_1_2 {
		OPT1_2_1("1.TAMIL SONG"), OPT1_2_2("2.ENGLISH SONG"), OPT1_2_3("3.HINDI SONG"), OPT1_2_4("4.BACK");

		String text;

		Level1_1_2(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	enum Level11_2_1 {
		OPT1_2_1_1("Arabic Kuthu from Beast"), OPT1_2_1_2("Mother Song from Valimai"), OPT1_2_1_3("Tum Tum from Enemy"),
		OPT1_2_1_4("4.BACK");

		String text;

		Level11_2_1(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}

	}

	enum Level11_2_2 {
		OPT1_2_2_1("Arabic Kuthu from Beast"), OPT1_2_2_2("Mother Song from Valimai"), OPT1_2_2_3("Tum Tum from Enemy"),
		OPT1_2_2_4("4.BACK");

		String text;

		Level11_2_2(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}

	}

	enum Level11_3_1 {
		OPT1_2_3_1("Arabic Kuthu from Beast"), OPT1_2_3_2("Mother Song from Valimai"), OPT1_2_3_3("Tum Tum from Enemy"),
		OPT1_2_3_4("4.BACK");

		String text;

		Level11_3_1(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}

	}

	enum Level1_1_3 {
		OPT11_3_1("1.Plese Contact 198 for Network and Services Complaints"),
		OPT11_3_2("2.Please Contact 199 for Plans related queries"),
		OPT11_3_3("3.Please Contact 1860-893-3333 for Customer Care"), OPT11_3_4("4.BACK");

		String text;

		Level1_1_3(String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	static class BackStack {
		int level;
		int option;

		public BackStack(int level, int option) {
			this.level = level;
			this.option = option;

		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public int getOption() {
			return option;
		}

		public void setOption(int option) {
			this.option = option;
		}
	}

	public static class StackDemo {
		static Stack<BackStack> bs = new Stack<BackStack>();

		public static void main(String[] args) {
			for (String option : getOptions(1, 0)) {
				System.out.println(option);
			}

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the option");
			int option = (sc.nextInt());

			bs.push(new BackStack(1, option));
			for (String optionString : getOptions(2, option)) {
				System.out.println(optionString);
			}
			System.out.println();
			System.out.println("STACHBACK" + bs.peek().getLevel());
			System.out.println("Enter the your option");
			option = sc.nextInt();

			bs.push(new BackStack(3, option));
			System.out.println();
			for (String optionString : getOptions(3, option)) {
				System.out.println(optionString);
			}

			System.out.println("Stacktop" + bs.peek().getLevel());
			System.out.println();
			System.out.println("Enter the your option");
			option = sc.nextInt();
			if (option == 9) {
				bs.pop();
				BackStack top = bs.peek();
				print(top.level, top.option);
			}
			bs.push(new BackStack(3, option));

		}

		static ArrayList<String> getOptions(int level, int option) {
			ArrayList<String> optionList = new ArrayList<String>();

			if (level == 1) {
				optionList.add(Level1.OPT_1.toString());
				optionList.add(Level1.OPT_2.toString());
				optionList.add(Level1.OPT_3.toString());
			}
			switch(level) {
			case 1:{
				
				 if(option==1) {
					optionList.add(Level1_1.OPT_1_1.toString());
					optionList.add(Level1_1.OPT_1_2.toString());
					optionList.add(Level1_1.OPT_1_3.toString());
				}
				else if(option==2){
					optionList.add(Level1_1_2.OPT1_2_1.toString());
				optionList.add(Level1_1_2.OPT1_2_2.toString());
				optionList.add(Level1_1_2.OPT1_2_3.toString());
				}
				else if(option==3){
					optionList.add(Level1_1_3.OPT11_3_1.toString());
					optionList.add(Level1_1_3.OPT11_3_2.toString());
					optionList.add(Level1_1_3.OPT11_3_3.toString());

				}
		
		break;
		}
		case 2:
		{
			if (level == 2) {
				optionList.add(Level1.OPT_1.toString());
				optionList.add(Level1.OPT_2.toString());
				optionList.add(Level1.OPT_3.toString());
			}
				else if(option==1) {
					optionList.add(Level1_1.OPT_1_1.toString());
					optionList.add(Level1_1.OPT_1_2.toString());
					optionList.add(Level1_1.OPT_1_3.toString());
				}
				else if(option==2){
					optionList.add(Level1_1_2.OPT1_2_1.toString());
				optionList.add(Level1_1_2.OPT1_2_2.toString());
				optionList.add(Level1_1_2.OPT1_2_3.toString());
				}
				else if(option==3){
					optionList.add(Level1_1_3.OPT11_3_1.toString());
					optionList.add(Level1_1_3.OPT11_3_2.toString());
					optionList.add(Level1_1_3.OPT11_3_3.toString());
break;
				}
		}
		case 3:
		{
			if (level == 3) {
				optionList.add(Level1.OPT_1.toString());
				optionList.add(Level1.OPT_2.toString());
				optionList.add(Level1.OPT_3.toString());
			}
				else if(option==1) {
					optionList.add(Level1_1.OPT_1_1.toString());
					optionList.add(Level1_1.OPT_1_2.toString());
					optionList.add(Level1_1.OPT_1_3.toString());
				}
				else if(option==2){
					optionList.add(Level1_1_2.OPT1_2_1.toString());
				optionList.add(Level1_1_2.OPT1_2_2.toString());
				optionList.add(Level1_1_2.OPT1_2_3.toString());
				}
				else if(option==3){
					optionList.add(Level1_1_3.OPT11_3_1.toString());
					optionList.add(Level1_1_3.OPT11_3_2.toString());
					optionList.add(Level1_1_3.OPT11_3_3.toString());
				}
break;
		}
		}
			return optionList;
		}

		public static void print(int level, int option) {
			for (String optionString : getOptions(level, option)) {
				System.out.println(optionString);
			}
		}
	}
}
