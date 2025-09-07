

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// n: 전체 수열 길이, k: 슬라이딩 윈도우 크기
		String[] nAndK = br.readLine().split(" ");
		int n = Integer.parseInt(nAndK[0]);
		int k = Integer.parseInt(nAndK[1]);

		String[] numbers = br.readLine().split(" ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(numbers[i]);
		}

		// 초기 합 계산
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		int max = sum;

		// 슬라이딩 윈도우 시작
		for (int i = k; i < n; i++) {
			// 앞의 값을 빼고 새로운 값을 더함
			sum = sum - arr[i - k] + arr[i]; 
			if (sum > max) {
				max=sum;
			}
			//max = Math.max(max, sum);  
		}

		System.out.println(max);
	}
}
