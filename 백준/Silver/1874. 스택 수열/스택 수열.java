
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>(); // 숫자를 담을 스택
		Stack<String> sPlus = new Stack<String>(); // +-를 담을 스택
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int n = sc.nextInt();
		int a[] = new int[n];

		// 입력된 수열 받기 -> 이걸 만들어야 함 (answer)
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int num = 1;
		int i = 0;

		for (int j = 0; j < n; j++) {
			// 처음에는 스택에 넣어줘야 함
			st.push(num);
			sPlus.push("+");
			//System.out.println("st상태:" + st);
			// 수열과 스택 숫자가 동일한 경우 스택에서 빼서 숫자 answer에 넣기
			// 이때, 맨 끝 한번만 검사하는 게 아니라 지속적으로 검사해야 함
			while (true) {
				if (i > n-1 || st.size()==0) { //i 값이 n-1(7)보다 크면 멈추기
					break;
				} else if (a[i] == st.peek()) {
					answer.add(st.pop());
					sPlus.push("-");
					//System.out.println("정답 상태:" + answer);
					i++;
				} else {
					break;
				}
			}

			num++;
		} // for문

		//System.out.println("+-상태: " + sPlus);
		if (st.size()>0) {
			System.out.println("NO");
		}
		else {
			//+- 출력하기
			for(String s :sPlus) {
				System.out.println(s);
			}
		}
		

	}
}
