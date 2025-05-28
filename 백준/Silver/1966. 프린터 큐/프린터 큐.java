
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		Queue<int[]> q = new LinkedList<int[]>();

		int t = sc.nextInt();

		for (int j = 0; j < t; j++) {
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			int count = 0;

			for (int i = 0; i < n; i++) {
				int[] k = new int[2];
				// 인덱스 저장
				k[0] = i;
				// 우선순위 저장
				k[1] = Integer.parseInt(sc.next());

				q.add(k);
			}

			// 중요도가 높은 숫자부터 인쇄
			// 만약 중요도가 높은 숫자가 존재한다면 뒤로 보내기
			// 큐가 비어있을 때 까지 반복
			while (!q.isEmpty()) {
				int[] queueOut = q.poll();
				boolean high = false;
				// 1. 큐의 맨 앞에서 꺼낸 데이터와 큐 안의 데이터 우선순위 비교
				for (int[] queueIn : q) {
					if (queueOut[1] < queueIn[1]) {
						// 큐 안의 데이터 (맨앞) 이 더 클때
						high = true;
						break;
					}
				}//for
				
				if (high) {
					// 꺼낸 데이터보다 큐 안의 데이터가 더 클때는
					// 꺼낸 데이터를 다시 뒤에 넣는다.
					q.add(queueOut);
				} else {
					// 꺼낸 데이터가 더 큰 경우에는
					// 꺼낸 데이터를 출력한다.
					// 이때, 인덱스를 비교하여 우리가 확인하고 싶은 인덱스(m)이면
					// count를 출력하여 몇 번째에 인쇄가 되었는지 알아낸다.
					// queueOut 의 인덱스를 m과 비교하면 된다.
					count++;
					if (queueOut[0] == m) {
						System.out.println(count);
					}
				}

			} //while

		}

	}
}
