import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class program5 {
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
		OPTION2_1("1.Recharge"), OPTION2_2("2.Caller_Tune"), OPTION2_3("3.current plan"), OPTION2_4("4.offer pack"),
		OPTION5("5.Back");

		private final String text;

		Level2(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level3 {
		OPTION3_1("1.SMS_Pack"), OPTION3_2("2.Net_Pack"), OPTION3_3("3.Roaming_Pack"), OPTION5("5.Back");

		private final String text;

		Level3(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level4 {
		OPTION4_1("1.Tamil"), OPTION4_2("2.English"), OPTION4_3("3.Hindi"), OPTION5("5.Back");

		private final String text;

		Level4(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level5 {
		OPTION_1("Your_Current_Plan is 255"), OPTION5("5.back");

		private final String text;

		Level5(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level6 {
		OPTION_1("199-Unlimited"), OPTION_2("100-99 Talktime"), OPTION_3("399-Unlimited Data"), OPTION5("5.back");

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

	private static void print(int level, int choice) {
		for (String choiceString : getChoices(level, choice)) {
			System.out.println(choiceString);
		}
	}

	static Stack<BackStack> backStack = new Stack<BackStack>();

	public static void main(String args[]) {
		for (String choice : getChoices(0, 0)) {
			System.out.println(choice);
		}
		Scanner input = new Scanner(System.in);
		// 1
		System.out.println("Enter your option : ");
		int choice = input.nextInt();
		backStack.push(new BackStack(1, choice));
		print(1, choice);
		System.out.println();
		System.out.println("Stacktop" + backStack.peek().level);

		do {
			System.out.println("Enter your option : "); //
			choice = input.nextInt();
			if (choice == 9) { //
				backStack.pop(); // 3->2 >1

				if (backStack.isEmpty()) {
					break;
				}
			} else {
				backStack.push(new BackStack(backStack.peek().level + 1, choice));
			}
			BackStack top = backStack.peek();
			print(top.level, top.choice); //

		} while (true);
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
				choiceList.add(Level2.OPTION2_1.toString());
				choiceList.add(Level2.OPTION2_2.toString());
				choiceList.add(Level2.OPTION2_3.toString());
				choiceList.add(Level2.OPTION2_4.toString());
				choiceList.add(Level2.OPTION5.toString());
				break;
			}
			case 2: {
				choiceList.add(Level2.OPTION2_1.toString());
				choiceList.add(Level2.OPTION2_2.toString());
				choiceList.add(Level2.OPTION2_3.toString());
				choiceList.add(Level2.OPTION2_4.toString());
				choiceList.add(Level2.OPTION5.toString());
				break;
			}

			case 3: {
				choiceList.add(Level2.OPTION2_1.toString());
				choiceList.add(Level2.OPTION2_2.toString());
				choiceList.add(Level2.OPTION2_3.toString());
				choiceList.add(Level2.OPTION2_4.toString());
				choiceList.add(Level2.OPTION5.toString());
				break;
			}
			}
		} else if (level == 2) {
			switch (choice) {
			case 1:
				choiceList.add(Level3.OPTION3_1.toString());// SMS PACK
				choiceList.add(Level3.OPTION3_2.toString());// NET PACK
				choiceList.add(Level3.OPTION3_3.toString());
				choiceList.add(Level3.OPTION5.toString());

				break;
			case 2:
				choiceList.add(Level4.OPTION4_1.toString());
				choiceList.add(Level4.OPTION4_2.toString());
				choiceList.add(Level4.OPTION4_3.toString());
				choiceList.add(Level4.OPTION5.toString());
				break;
			case 3:
				choiceList.add(Level5.OPTION_1.toString());
				choiceList.add(Level5.OPTION5.toString());
				break;
			case 4:
				choiceList.add(Level6.OPTION_1.toString());
				choiceList.add(Level6.OPTION_2.toString());
				choiceList.add(Level6.OPTION_3.toString());
				choiceList.add(Level6.OPTION5.toString());
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
				choiceList.add(Level3.OPTION3_1.toString());
				choiceList.add(Level3.OPTION3_2.toString());
				choiceList.add(Level3.OPTION3_3.toString());
				 choiceList.add(Level3.OPTION5.toString());//

				break;
			case 2:
				choiceList.add(Level4.OPTION4_1.toString());// TAMIL
				choiceList.add(Level4.OPTION4_2.toString());// ENGISH
				choiceList.add(Level4.OPTION4_3.toString());// HIMDI
			    choiceList.add(Level4.OPTION5.toString());//BACK
				break;
			case 3:
				choiceList.add(Level5.OPTION_1.toString());// CURRENT PLAN
				choiceList.add(Level5.OPTION5.toString());//
				break;
			case 4:
				choiceList.add(Level6.OPTION_1.toString());// UNLIMITED
				choiceList.add(Level6.OPTION_2.toString());// TALKTIME
				choiceList.add(Level6.OPTION_3.toString());// UNTIMITED
				choiceList.add(Level6.OPTION5.toString());//

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
			/*
			 * if(backStack.isEmpty()){ break; }
			 */

		}

		return choiceList;
	}

}
