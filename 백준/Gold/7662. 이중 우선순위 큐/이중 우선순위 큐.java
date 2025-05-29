
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

		for (int i = 0; i < t; i++) {
			TreeMap<Integer, Integer> map = new TreeMap<>();

			int n = Integer.parseInt(br.readLine()); // 연산 횟수

			for (int k = 0; k < n; k++) {

				StringTokenizer st = new StringTokenizer(br.readLine());
				String a = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				// TreeMap 사용 : 자동 정렬 가능
				// map 저장 형식 : {숫자 : 숫자 개수}
				// I -> 삽입
				if (a.equals("I")) {
					// 동일한 숫자가 존재하는지 확인
					if (map.containsKey(num)) { // 동일한 숫자가 존재하면 1씩 추가
						map.put(num, map.getOrDefault(num, 0) + 1);
					} else {// 동일한 숫자가 없으면 개수에 1 써주기
						map.put(num, 1);
					}

				} // if

				// D -> 삭제
				else {
					if (map.isEmpty()) {
						// map이 비어 있을 경우 연산 무시
						continue;

					} else if (num == 1) {
						// 최댓값 삭제
						if (map.get(map.lastKey()) == 1) { // 동일한 숫자가 없음 (유일한 항목)
							// map 에서 완전히 삭제
							map.remove(map.lastKey());
						} else { // 동일한 숫자가 존재 (중복 숫자)
							map.put(map.lastKey(), map.get(map.lastKey()) - 1);
						}
					} else {
						// 최솟값 삭제
						if (map.get(map.firstKey()) == 1) { // 동일한 숫자가 없음 (유일한 항목)
							// map 에서 완전히 삭제
							map.remove(map.firstKey());
						} else { // 동일한 숫자가 존재 (중복 숫자)
							map.put(map.firstKey(), map.get(map.firstKey()) - 1);
						}
					}

				} // else
			}

			// 출력
			if (map.isEmpty())
				System.out.println("EMPTY");
			else
				System.out.println(map.lastKey() + " " + map.firstKey());

		} // for

	}// main
}
