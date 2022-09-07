import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class myprogram4 {
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
		OPTION_1("1.Recharge"), OPTION_2("2.Caller_Tune"),OPTION_5("5.Back");

		private final String text;

		Level2(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}
	public enum Level3{
		OPTION_1("1.SMS_Pack"),OPTION_2("2.Net_Pack"),OPTION_3("3.Roaming_Pack"),OPTION_4("5.Back");
		private final String text;

		Level3(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
}
	
	public enum Level4{
		OPTION_1("1.Tamil"),OPTION_2("2.English"),OPTION_3("3.Hindi"),OPTION_4("5.Back");
		private final String text;

		Level4(final String text) {
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
		
		
		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter  your option:");
		int choice = input.nextInt();
		
		backStack.push(new BackStack(1, choice));
		for (String choiceString : getChoices(1, choice)) {
			System.out.println(choiceString);
		}
		System.out.println();
		//System.out.println( backStack.peek().level);
		
		
		
		System.out.println("Enter the your option");
		choice = input.nextInt();
		backStack.push(new BackStack(2, choice));
		System.out.println();
		for (String choiceString : getChoices(2, choice)) {
			System.out.println(choiceString);
		}
        System.out.println("Stacktop" + backStack.peek().level);
		System.out.println();
		
		
		
		System.out.println("Enter the your option");
		choice = input.nextInt();
		if (choice == 5) {
			backStack.pop();
			BackStack top = backStack.peek();
			print(top.level, top.choice);
		}
	
		System.out.println("Enter the your option");
		choice = input.nextInt();
		backStack.push(new BackStack(3, choice));
		System.out.println();
		for (String choiceString : getChoices(3, choice)) {
			System.out.println(choiceString);
		}
		
		
		System.out.println();
		System.out.println( + backStack.peek().level);
		if (choice == 5) {
			backStack.pop();
			BackStack top = backStack.peek();
			print(top.level, top.choice);
		}
		System.out.println("Enter the your option");
		choice = input.nextInt();
		backStack.push(new BackStack(4, choice));
		System.out.println();
		for (String choiceString : getChoices(4, choice)) {
			System.out.println(choiceString);
		}
		System.out.println();
		System.out.println("Stacktop" + backStack.peek().level);
	
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
		} 
		
		else if (level == 1) {
			switch (choice) {
			case 1:
				choiceList.add(Level2.OPTION_1.toString());
				choiceList.add(Level2.OPTION_2.toString());
				choiceList.add(Level2.OPTION_5.toString());
				break;
			
			case 2:
				choiceList.add(Level2.OPTION_1.toString());
				choiceList.add(Level2.OPTION_2.toString());
				choiceList.add(Level2.OPTION_5.toString());
				break;
			}
		}
	
			else if(level==2) {
		switch(choice) {
		case 1:
			choiceList.add(Level3.OPTION_1.toString());
			choiceList.add(Level3.OPTION_2.toString());
			choiceList.add(Level3.OPTION_3.toString());
			break;
		case 2:
			choiceList.add(Level4.OPTION_1.toString());
			choiceList.add(Level4.OPTION_2.toString());
			choiceList.add(Level4.OPTION_3.toString());
			choiceList.add(Level4.OPTION_4.toString());

			break;
		case 5:
			backStack.pop();
			BackStack top = backStack.peek();
			print(top.level, top.choice);
			break;
			
		}
		
	}else if(level==3)
	 {
		switch(choice) {
		case 1:
			choiceList.add(Level3.OPTION_1.toString());
			choiceList.add(Level3.OPTION_2.toString());
			choiceList.add(Level3.OPTION_3.toString());
			choiceList.add(Level3.OPTION_4.toString());

			break;
		case 2:
			choiceList.add(Level4.OPTION_1.toString());
			choiceList.add(Level4.OPTION_2.toString());
			choiceList.add(Level4.OPTION_3.toString());
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
		
	}
		return choiceList;
	}
	
	}
