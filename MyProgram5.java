import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MyProgram5 {
	public enum Level1 {
		OPTION_1("1.Tamil"), OPTION_2("2.English"), OPTION_3("3.Malayalam");

		private final String text;

		Level1(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level2 {
		OPTION_1("1.Rechare"), OPTION_2("2.Caller_Tune"), OPTION_3("3.Current_Plan"), OPTION_4("4.New Offers"),
		OPTION_5("5.Back");

		private final String text;

		Level2(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level3 {
		OPTION_1("SMS_Pack"), OPTION_2("Net_Pack"), OPTION_3("Roaming_Pack"), OPTION_5("5.back");

		private final String text;

		Level3(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level4 {
		OPTION_1("Tamil"), OPTION_2("English"), OPTION_3("Hindi"), OPTION_5("5.back");

		private final String text;

		Level4(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level5 {
		OPTION_1("Your_Current_Plan is 255"), OPTION_5("5.back");

		private final String text;

		Level5(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level6 {
		OPTION_1("199-Unlimited"), OPTION_2("100-99 Talktime"), OPTION_3("399-Unlimited Data"), OPTION_5("5.back");

		private final String text;

		Level6(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	static class BackStack {
		private int level;
		private int choice;

		BackStack(int level, int choice) {
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

	static Stack<BackStack> backStack = new Stack<BackStack>();

	public static void main(String args[]) {

		for (String choice : getChoices(0, 0)) {
			System.out.println(choice);
		}
		backStack.push(new BackStack(0, 0));
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("enter  your option:");
		int choice = input.nextInt();
		backStack.push(new BackStack(1, choice));
		for (String choiceString : getChoices(1, choice)) {
			System.out.println(choiceString);
		}
		System.out.println();
		System.out.println(backStack.peek().level);
		
		
		System.out.println("Enter the your option");
		choice = input.nextInt();
		if (choice == 5) {
			backStack.pop();
		}
		backStack.push(new BackStack(2, choice));
		System.out.println();
		for (String choiceString : getChoices(2, choice)) {
			System.out.println(choiceString);
		}
		System.out.println(backStack.peek().level);
		System.out.println();
		System.out.println("Enter the your option");
		choice = input.nextInt();

		if (choice == 5) {
			backStack.pop();
			BackStack top = backStack.peek();
			print(top.level, top.choice);
			backStack.push(new BackStack(2, choice));//
		}

		System.out.println();
		System.out.println("Enter the your option");
		choice = input.nextInt();
		backStack.push(new BackStack(3, choice));
		System.out.println();
		for (String choiceString : getChoices(3, choice)) {
			System.out.println(choiceString);
		}
		System.out.println();
		System.out.println(backStack.peek().level);
		if (choice == 5) {
			backStack.pop();
			BackStack top = backStack.peek();
			print(top.level, top.choice);

		}

		System.out.println("press 6 for main menu");
		choice = input.nextInt();
		if (choice == 6) {
			backStack.push(new BackStack(0, 0));
			for (String choiceString : getChoices(0, 0)) {
				System.out.println(choiceString);
			}
			System.out.println(backStack.peek().level);

		}
	}

	private static void print(int level, int choice) {
		for (String choiceString : getChoices(level, choice)) {
			System.out.println(choiceString);
		}
	}

	static ArrayList<String> getChoices(int level, int choice) {
		ArrayList<String> choiceList = new ArrayList();
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
				break;
			}
			case 2: {
				choiceList.add(Level2.OPTION_1.toString());
				choiceList.add(Level2.OPTION_2.toString());
				choiceList.add(Level2.OPTION_3.toString());
				choiceList.add(Level2.OPTION_4.toString());
				choiceList.add(Level2.OPTION_5.toString());
				break;
			}

			case 3: {
				choiceList.add(Level2.OPTION_1.toString());
				choiceList.add(Level2.OPTION_2.toString());
				choiceList.add(Level2.OPTION_3.toString());
				choiceList.add(Level2.OPTION_4.toString());
				choiceList.add(Level2.OPTION_5.toString());
				break;
			}
			}
		} else if (level == 2) {
			switch (choice) {
			case 1:
				choiceList.add(Level3.OPTION_1.toString());//SMS PACK
				choiceList.add(Level3.OPTION_2.toString());//NET PACK
				choiceList.add(Level3.OPTION_3.toString());
				choiceList.add(Level3.OPTION_5.toString());

				break;
			case 2:
				choiceList.add(Level4.OPTION_1.toString());
				choiceList.add(Level4.OPTION_2.toString());
				choiceList.add(Level4.OPTION_3.toString());
				choiceList.add(Level4.OPTION_5.toString());
				break;
			case 3:
				choiceList.add(Level5.OPTION_1.toString());
				choiceList.add(Level5.OPTION_5.toString());
				break;
			case 4:
				choiceList.add(Level6.OPTION_1.toString());
				choiceList.add(Level6.OPTION_2.toString());
				choiceList.add(Level6.OPTION_3.toString());
				choiceList.add(Level6.OPTION_5.toString());
				break;
			case 5:
				backStack.pop();
				BackStack top = backStack.peek();
				print(top.level, top.choice);
				break;

			}

		} else if (level == 3) {
			switch (choice) {
			case 1:
				choiceList.add(Level3.OPTION_1.toString());
				choiceList.add(Level3.OPTION_2.toString());
				choiceList.add(Level3.OPTION_3.toString());
				choiceList.add(Level3.OPTION_5.toString());//

				break;
			case 2:
				choiceList.add(Level4.OPTION_1.toString());//TAMIL
				choiceList.add(Level4.OPTION_2.toString());//ENGISH
				choiceList.add(Level4.OPTION_3.toString());//HIMDI
				choiceList.add(Level4.OPTION_5.toString());//BACK
				break;
			case 3:
				choiceList.add(Level5.OPTION_1.toString());//CURRENT PLAN
				choiceList.add(Level5.OPTION_5.toString());//
				break;
			case 4:
				choiceList.add(Level6.OPTION_1.toString());//UNLIMITED
				choiceList.add(Level6.OPTION_2.toString());//TALKTIME
				choiceList.add(Level6.OPTION_3.toString());//UNTIMITED
				choiceList.add(Level6.OPTION_5.toString());//

				break;
			case 5:
				backStack.pop();
				BackStack top = backStack.peek();
				print(top.level, top.choice);
				break;

			default:
				for (String choices : getChoices(0, 0)) {
					System.out.println(choices);
				}
				break;
			}
			/*if(backStack.isEmpty()){
				break;
			}*/
				
			}

		
		return choiceList;
	}

}
