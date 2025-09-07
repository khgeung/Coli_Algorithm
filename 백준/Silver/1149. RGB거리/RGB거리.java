

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String a[] = new String[3];
		ArrayList<String[]> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a = sc.nextLine().split(" ");
			list.add(a);
		}

		// 인접한 집은 색이 달라야 함

		int house[][] = new int[n][3];
		// 첫 번째 집의 경우의 수만 따로 먼저 구한다.
		// 빨간색
		house[0][0] += Integer.parseInt(list.get(0)[0]);

		// 초록색
		house[0][1] += Integer.parseInt(list.get(0)[1]);

		// 파란색
		house[0][2] += Integer.parseInt(list.get(0)[2]);

		// 누적합 계산하기 (두번째 집부터)
		for (int k = 1; k < n; k++) {

			// 첫번째 집이 빨간색일 때
			// 두번째 집의 초록색과 파란색 집의 크기를 비교한다.
			// 둘 중 작은 쪽을 더하면 된다.
			if (house[k - 1][1] > house[k - 1][2])
				house[k][0] = house[k - 1][2] + Integer.parseInt(list.get(k)[0]);
			else
				house[k][0] = house[k - 1][1] + Integer.parseInt(list.get(k)[0]);

			// 첫 번째 집이 초록색일 때
			// 두 번째 집의 빨간색과 파란색 집의 크기를 비교한다.
			if (house[k - 1][0] > house[k - 1][2])
				house[k][1] = house[k - 1][2] + Integer.parseInt(list.get(k)[1]);
			else
				house[k][1] = house[k - 1][0] + Integer.parseInt(list.get(k)[1]);

			// 첫 번째 집이 파란색 일 때
			// 두 번째 집의 빨간색과 초록색 집의 크기를 비교한다.
			if (house[k - 1][0] > house[k - 1][1])
				house[k][2] = house[k - 1][1] + Integer.parseInt(list.get(k)[2]);
			else
				house[k][2] = house[k - 1][0] + Integer.parseInt(list.get(k)[2]);

		}
		int min = house[n - 1][0];

		if (min > house[n - 1][1]) {
			min = house[n - 1][1];
		}
		if (min > house[n - 1][2]) {
			min = house[n - 1][2];
		}

		System.out.println(min);

	}
}
