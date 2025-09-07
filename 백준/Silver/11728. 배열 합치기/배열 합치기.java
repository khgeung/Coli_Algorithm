

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers =br.readLine().split(" ");
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(numbers[0]);
		int m = Integer.parseInt(numbers[1]);

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(a[i]));
		}

		for (int j = 0; j < m; j++) {
			list.add(Integer.parseInt(b[j]));
		}
		
		Collections.sort(list);  // 정렬

		StringBuilder sb = new StringBuilder();
		for (int num : list) {
		    sb.append(num).append(" ");
		}
		System.out.println(sb.toString().trim());

	}
}