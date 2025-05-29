
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<Integer> dq = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			String cmd = sc.next();
			int num = 0;

			if (cmd.equals("push_front") || cmd.equals("push_back")) {
				num = Integer.parseInt(sc.next());
			}

			switch (cmd) {

			case "push_front":
				dq.addFirst(num);
				break;

			case "push_back":
				dq.addLast(num);
				break;

			case "pop_front":
				if (dq.isEmpty())
					System.out.println(-1);
				else
					System.out.println(dq.pollFirst());
				break;

			case "pop_back":
				if (dq.isEmpty())
					System.out.println(-1);
				else
					System.out.println(dq.pollLast());
				break;

			case "size":
				System.out.println(dq.size());
				break;

			case "empty":
				if (dq.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;

			case "front":
				if (dq.isEmpty())
					System.out.println(-1);
				else
					System.out.println(dq.getFirst());
				break;

			case "back":
				if (dq.isEmpty())
					System.out.println(-1);
				else
					System.out.println(dq.getLast());
				break;

			}

		}

	}// main
}
