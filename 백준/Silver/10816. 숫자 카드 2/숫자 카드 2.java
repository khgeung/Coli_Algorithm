

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static int bSearch(int first, int last, int a, int[] list) {

		while (first <= last) {
			if (a < list[(first + last) / 2]) {
				last = ((first + last) / 2) - 1;

			} else if (a > list[(first + last) / 2]) {
				first = ((first + last) / 2) + 1;

			} else if (a == list[(first + last) / 2] || a == list[first] || a == list[last]) {

				return 1;

			}

		}
		return 0;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] nStringList = br.readLine().split(" ");
		int m = Integer.parseInt(br.readLine());

		String[] mStringList = br.readLine().split(" ");

		int nList[] = new int[n];
		for (int i = 0; i < n; i++) {
			nList[i] = Integer.parseInt(nStringList[i]);
		}
		int mList[] = new int[m];
		for (int i = 0; i < m; i++) {
			mList[i] = Integer.parseInt(mStringList[i]);
		}

		Arrays.sort(nList);

		Map<Integer, Integer> counts = new HashMap<>();
		for (int num : nList) {
			counts.put(num, counts.getOrDefault(num, 0) + 1);
		}
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {

			if (counts.containsKey(mList[i])) {
				sb.append(counts.get(mList[i]));
				if (i < m - 1) {
					sb.append(" ");
				}
			} else {
				sb.append("0");
				if (i < m - 1) {
					sb.append(" ");
				}
			}

//			int result = bSearch(0, nList.length - 1, mList[i], nList);
//			if (result == 1 ) {
//				System.out.print(counts.get(mList[i]));
//				if(i < m-1) {
//					System.out.print(" ");
//				}
//			}else {
//				System.out.print("0");
//				if(i < m-1) {
//					System.out.print(" ");
//				}
//			}
			
		
		}
		System.out.println(sb);
	}
	
	
}
