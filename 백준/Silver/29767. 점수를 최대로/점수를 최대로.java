

import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] number = br.readLine().split(" ");
		int n = Integer.parseInt(number[0]); //교실
		int k = Integer.parseInt(number[1]); //사람
		
		String [] cl = br.readLine().split(" ");
		
		//각 교실 방문 시 누적합 구하기
		long [] score = new long [n];
		long sum = 0;
		
		for (int i = 0; i < n ; i++) {
//			//i+1 안해주면 첫번째 합은 그냥 0으로 들어감
//			//i 라고 하면 0 < 0 -> false 판정, 한번도 실행되지 않음
//			for(int f = 0; f < i+1; f++) {
//				score[i] += Integer.parseInt(cl[f]);
//			}
			if(i == 0) {
				score[i] += Long.parseLong(cl[i]);
			}else {
				score[i] = score[i-1] + Long.parseLong(cl[i]);
			}
			
		}
		
		
		//누적합 확인 후 큰 수 k개를 고르고 그 값들을 합치면 된다.
		Arrays.sort(score);
		for(int i = n-1 ; i >= n-k; i--) {
			sum += score[i];
		}
		
		System.out.println(sum);
		
	}
}