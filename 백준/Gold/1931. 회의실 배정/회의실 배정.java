

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] k = new int [n][2];
		
		for(int i = 0; i < n; i++) {
			String number [] = br.readLine().split(" ");
			k[i][0] = Integer.parseInt(number[0]);
			k[i][1] = Integer.parseInt(number[1]);
			
		}
		
		//회의가 가장 빨리 끝나는 시간 선택
		//정렬 후 진행하기
		//두번째 배열(끝나는 시간) 기준 정렬
		//만약 끝나는 시간이 같다면 시작 시간이 더 작은 걸 앞으로 빼기
		Arrays.sort(k, (a, b) -> {
		if(a[1] == b[1]) return a[0]-b[0];
		return a[1]- b[1]; });
		
		
		int i = 0;
		int j = 1;
		int count = 1; //맨 처음 시작하는 회의 더해주기
		
		while (j <n) {
			if(	k[i][1] <= k[j][0] ) {
			i = j;
			j++;
			//System.out.println("다음 i:" +i+ "다음 j:"+ j);
			//k[j][1] 과 다음걸 비교
			count++;
			}else{
				j++;
			}
		}
		
		System.out.println(count);
	
		
		
	}
}