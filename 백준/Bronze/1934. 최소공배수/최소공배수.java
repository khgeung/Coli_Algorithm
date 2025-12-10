

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	
	//최대공약수 구하는 메소드
		public static int gcd(int a, int b){
			
			if(a % b == 0){
				return b;
			}
			else {
				int r = a % b;
				return gcd(b, r);
			}
			
		}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			//최소공배수 = 두 수의 곱 / 최대공약수
			
			//최대공약수 구하기
			//a와 b의 최대공약수 = b와 r(a%b) 의 최대공약수
			
			if(a>b) {
				int k = gcd(b, a);
				System.out.println((b * a) / k);
				
				
			}else {
				int k = gcd(a, b);
				System.out.println((a*b) / k);
	
			}

			
		}
		
		
	}
	
	
	
}
