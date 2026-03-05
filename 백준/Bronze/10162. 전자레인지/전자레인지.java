
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		//a = 5분 = 300초 , b = 1분 = 60초, c = 10초
		int a = 300;
		int b = 60;
		int c = 10;
		
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		
		a1 = t/a;
		b1 = (t%a)/b;
		c1 = ((t%a)%b)/c;
		
		if ((((t%a)%b)%c) != 0) {
			System.out.println(-1);
		}else {
			System.out.println(a1 + " " + b1 + " " + c1);
		}
		
	}
}