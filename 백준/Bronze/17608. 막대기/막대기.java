
import java.util.Scanner;
import java.util.Stack;

public class Main {
public static void main(String[] args) {
	Stack<Integer> data = new Stack<Integer>();
	Stack<Integer> solution = new Stack<Integer>();
	int n = 0;
	int maxInt = 0;
	Scanner sc = new Scanner(System.in);
	//데이터 입력받기
	n = sc.nextInt();
	for (int i = 0; i<n ; i++) {
		data.push(sc.nextInt());
	}
	
	
	for (int i = 0; i< n;i++ ) {
		int stick = data.pop() ;
		if (maxInt < stick) {
			maxInt = stick;
			solution.push(stick);
		}
	}
	
	System.out.println(solution.size());
	
	
	
}
}
