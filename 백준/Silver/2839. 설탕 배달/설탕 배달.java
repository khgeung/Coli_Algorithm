
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//5x + 3y = n
		//x + y = 최소
		//불가능 = -1
		
		int x = 0;
		int s = 0;
		int y = 0;
		
		if(n < 5) {
			x = 0;
			s = 0;
			y = n / 3;
			
			if(n % 3 != 0) {
				System.out.println("-1");
			}else {
			
				System.out.println(x+y);
			}
			
			
		}else {
			
			 x = n / 5 ; //몫 (즉 x값)
			 s = n % 5; //5로 나눈 나머지
			 y = s / 3; 
			//만약 5로 나눈 나머지가 3으로 나누어 떨어지지 않을 때 
			while(s % 3 != 0 && x > 0) {
					x = x-1;
					s = (n - (x * 5));
					y = s / 3;
					
			}
			
			if(s % 3 != 0) {
				System.out.println("-1");
			}else {
				
				System.out.println(x+y);
				
			}
			
		}


	}
	
	
	
}
