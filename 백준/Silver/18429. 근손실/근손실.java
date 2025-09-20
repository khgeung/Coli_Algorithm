
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static int count = 0;

	static void back(List<Integer> numList, String numAll[], int visited[], int n, int k, int weight) {
		if (weight < 500) {
			return;
		}
		
		if (numList.size() == n) {
			if (weight >= 500) {
			
				count += 1;
			}
		}
		
		

		for (int i = 1; i <= n; i++) {
			if (visited[i] != 1) {
				visited[i] = 1;

				numList.add(Integer.parseInt(numAll[i - 1]));
				weight += Integer.parseInt(numAll[i - 1]);
				weight -= k;

				back(numList, numAll, visited, n, k, weight);
				// 마지막 숫자 제거 (백트래킹)
				numList.remove(numList.size() - 1);
				
				//되돌아가면 계산 결과 취소하기
				weight -= Integer.parseInt(numAll[i - 1]);
				weight += k;
				visited[i] = 0; // i 사용 취소
			}
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		// 키트의 중량 증가량
		String[] numAll = br.readLine().split(" ");
		// 운동 키트 수
		int n = Integer.parseInt(nk[0]);
		// 중량 감소량
		int k = Integer.parseInt(nk[1]);
		// 해당 운동 키트를 사용했는지 여부
		int[] visited = new int[n + 1]; // 기본값 0]
		// 운동 키트를 사용
		List<Integer> numList = new ArrayList<>();

		int weight = 500;
		
		back(numList, numAll, visited, n, k, weight);
		System.out.println(count);

	}
}
