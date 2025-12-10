
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	
	//최대공약수 구하는 메소드
		public static long gcd(long a, long b){
			
			if(a % b == 0){
				return b;
			}
			else {
				long r = a % b;
				return gcd(b, r);
			}
			
		}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

			String[] str = br.readLine().split(" ");
			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[1]);
			
			//최소공배수 = 두 수의 곱 / 최대공약수
			
	
			if(a>b) {
				long k = gcd(b, a);
				System.out.println((b * a) / k);
				
				
			}else {
				long k = gcd(a, b);
				System.out.println((a*b) / k);
	
			}

		
		
	}
	
	
	
}
