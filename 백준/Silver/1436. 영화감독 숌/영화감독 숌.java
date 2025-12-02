

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int k = 666;
		
		int a = 1;
		
		while(a < n) {
			
			k = k + 1;
			//문자열로 변환
			String number = Integer.toString(k);
			//문자열 검사 : 666이 포함되었는지
			if(number.contains("666")) {
				a=a+1;
			}
			
			
		}
		System.out.println(k);
		
		

	}
	
	
	
}
