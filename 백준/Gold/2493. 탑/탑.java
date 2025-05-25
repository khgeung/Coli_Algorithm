
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<int[]> st = new Stack<int[]>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer stz = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			// 1. 스택에 저장할 항목을 만든다. [인덱스, 막대 높이] 형식
			int[] t = new int[2];
			int f = Integer.parseInt(stz.nextToken());
			t[0] = i;
			t[1] = f;
				// 2. 스택 안의 값과 비교하여 값이 더 작을때까지(전파 성공)
				// 스택 항목들을 지운다.
				// 또는 계속 지워서 스택에 아무 항목도 남지 않았을때 멈춘다.
				while (!st.isEmpty() && f >= st.peek()[1]) {
					st.pop();
				}
				// while문이 끝나고 스택 값이 남아있지 않을 때
				if (st.isEmpty()) {
					sb.append("0 ");
				} else {
					// while 문이 끝나도 스택 값이 남아있을 때
					// 전파가 성공한다는 의미이므로 해당 인덱스를 반환한다.
					// i+1 = 막대 길이는 1부터 시작하므로
					sb.append(st.peek()[0] + 1).append(" ");
				}
				
				st.add(t);  // 현재 탑 push


		}//for
		
		System.out.println(sb.toString());

		

	}
}
