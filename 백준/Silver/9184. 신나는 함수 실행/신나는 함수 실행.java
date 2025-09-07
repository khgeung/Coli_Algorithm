

import java.util.Scanner;

public class Main {

	public static int dp[][][] = new int[21][21][21];

	private static int w(int a, int b, int c) {

		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;

		} else if (a > 20 || b > 20 || c > 20) {

			return w(20, 20, 20);

		} else if (dp[a][b][c] != 0) {
			return dp[a][b][c];

		} else if (a < b && b < c) {
			dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		} else {
			dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);

		}
		return dp[a][b][c];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			String numbers[] = sc.nextLine().split(" ");
			int k = w(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]), Integer.parseInt(numbers[2]));

			if (Integer.parseInt(numbers[0]) == -1 && Integer.parseInt(numbers[1]) == -1
					&& Integer.parseInt(numbers[2]) == -1) {
				break;
			}

			System.out.println("w(" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ")" + " = " + k);

		}

	}
}
