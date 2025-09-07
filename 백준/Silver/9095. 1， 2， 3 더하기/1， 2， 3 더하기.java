

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(4);

		// n은 11보다 작으므로 4~10까지의 경우의 수를 미리 구한다.
		for (int k = 4; k < 11; k++) {
			list.add(list.get(k - 1) + list.get(k - 2) + list.get(k - 3));

		}

		for (int i = 0; i < t; i++) {

			int n = Integer.parseInt(br.readLine());

			if (n == 1) {
				System.out.println(list.get(1));
			} else if (n == 2) {
				System.out.println(list.get(2));
			} else if (n == 3) {
				System.out.println(list.get(3));
			} else {
				System.out.println(list.get(n - 1) + list.get(n - 2) + list.get(n - 3));
			}

		}

	}
}
