import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {
	static Queue<Integer> s = new LinkedList<Integer>();

	public static void main(String args[]) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the no of tickets");
		int ticket = s1.nextInt();
		int input, input2;

		if (ticket % 2 == 0) {
			int y1 = ticket / 2;
			for (int i = 1; i <= y1; i++) {
				System.out.println("Enter the Enqueue value 1");
				input = s1.nextInt();

				System.out.println("Enter the Enqueue value 2");
				input2 = s1.nextInt();

				s.add(input);
				s.add(input2);
				System.out.println("Dequeue the head:" + s.poll());
				System.out.println("Print the element in the queue:" + s);

				System.out.println();
				System.out.println("*****************");
			}

		}

		else {
			int y1 = (ticket / 2) + 1;
			for (int i = 1; i <= y1; i++) {
				System.out.println("Enter the Enqueue value 1");
				input = s1.nextInt();

				System.out.println("Enter the Enqueue value 2");
				input2 = s1.nextInt();
				s.add(input);
				if(input2<ticket)
					s.add(input2);

					System.out.println(s);

				System.out.println("Dequeue the head:" + s.poll());
				System.out.println("top in the queue: " + s.peek());
				System.out.println("elements in the queue: " + s);

				System.out.println();
				System.out.println("*****************");
			}
		}

		System.out.println(s);
		s.clear();
		System.out.println(s);
	}
}
