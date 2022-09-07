import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		int option;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("============================");
			System.out.println("Do you have insert persons?Enter 1");
			System.out.println("Do you have Delete persons?Enter 2");
			System.out.println("Do you have Exit?Enter 0");
			System.out.println("============================");
			System.out.print("Enter a option:");
			option = scan.nextInt();
			switch (option) {
			case 1:
				System.out.print("Enter a  insert number:");
				int addnumber = scan.nextInt();
				q.add(addnumber);
				System.out.println("Queue after Enqueue Operation:");
				System.out.println(q);
				break;
			case 2:
				System.out.print("Enter a delete number:");
				int delnumber = scan.nextInt();
				q.remove(delnumber);
				System.out.println("Queue after dequeue operations:");
				System.out.println(q);
				break;
			default:
				System.out.println("Invalid option!!!check your option");
			}

		} while (option != 0);
	
		System.out.println("program finished");
		scan.close();
	}
}
