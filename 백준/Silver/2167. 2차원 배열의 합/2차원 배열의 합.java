

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] number = sc.nextLine().split(" ");
		int n = Integer.parseInt(number[0]);
		int m = Integer.parseInt(number[1]);

		int numList[][] = new int[n][m];
//배열 입력받기
		for (int i = 0; i < n; i++) {
			String[] list = sc.nextLine().split(" ");
			for (int j = 0; j < m; j++) {
				numList[i][j] = Integer.parseInt(list[j]);
			}
		}
		int k = Integer.parseInt(sc.nextLine());

		for (int a = 0; a < k; a++) {
			String[] ijxy = sc.nextLine().split(" ");
			int i = Integer.parseInt(ijxy[0]);
			int j = Integer.parseInt(ijxy[1]);
			int x = Integer.parseInt(ijxy[2]);
			int y = Integer.parseInt(ijxy[3]);

			int sum = 0;

			// 주어진 좌표로 배열의 합을 계산
			// 주의 : 주어지는 좌표에서 -1씩 해줘야 배열의 인덱스가 됨

//			while (true) {
//				sum += numList[i - 1][j - 1];
//
//				if (i == x && j == y || i > x) {
//					break;
//				}
//
//				if (j == m) {
//					i += 1;
//					j = 0;
//				}
//
//				j += 1;
//
//			}
			for (int x_pos = i - 1; x_pos <= x - 1; x_pos++) {
			    for (int y_pos = j - 1; y_pos <= y - 1; y_pos++) {
			        sum += numList[x_pos][y_pos];
			    }
			}


			System.out.println(sum);
		}

	}
}