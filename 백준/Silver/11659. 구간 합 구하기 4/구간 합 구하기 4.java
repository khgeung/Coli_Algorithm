

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		String [] number = br.readLine().split(" ");
		
		//1. 누적합 테이블 만들기
		int [] sumCount = new int [n+1];
		sumCount[0] = 0;
		int sum = 0;
		
		for(int b = 0; b< n ; b++) {
			sum += Integer.parseInt(number[b]);
			
			sumCount[b+1] = sum;
			//System.out.println(sumCount[b]);
			
		}
		
		for(int a = 0; a < m; a++) {
			
			String[] sumNum = br.readLine().split(" ");
			int i = Integer.parseInt(sumNum[0]);
			int j = Integer.parseInt(sumNum[1]);

			//구간 합 구하기 : 누적합 이용
			
			// 0 1 2 3  4  5
			// 0 5 9 12 14 15
			// 1-3 : 12(12-0)
			// 2-4 : 9 (14-5)
	
			//2. 들어오는 합 계산해서 출력하기
			//1부터 3까지의 합이면 누적합 배열의 인덱스 3에서 인덱스 0을 빼주면 된다.
			System.out.println(sumCount[j]-sumCount[i-1]);
			
			
		}

	}
	
	
	
}
