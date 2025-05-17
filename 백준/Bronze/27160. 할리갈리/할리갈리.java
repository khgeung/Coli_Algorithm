
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// hashmap 설정
		HashMap<String, Integer> fruit = new HashMap<String, Integer>();
		fruit.put("BANANA", 0);
		fruit.put("STRAWBERRY", 0);
		fruit.put("LIME", 0);
		fruit.put("PLUM", 0);

		// 카드 입력받기
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			//f = 과일 이름
			String f = sc.next();
			// m = 과일 수
			int m = sc.nextInt();
			// fruit.get(f) : value (현재 과일 수) 가져옴
			//현재 과일 수에 m 을 더해주면 최종 과일 수가 된다.
			fruit.put(f, fruit.get(f)+m);

		}
		//fruit 해시테이블 안에서 값이 5인 과일을 찾기
		boolean result = fruit.containsValue(5);
		if (result == true) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	

	}// main
}// Main
