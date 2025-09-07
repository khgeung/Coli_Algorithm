

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		TreeMap<String, Integer> map = new TreeMap<>();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String[] list = sc.nextLine().split("\\.");
			
			//해당 확장자가 존재할 때는 카운트 + 1
			if (map.containsKey(list[1])) {
				map.put(list[1], map.get(list[1]) + 1);
			} else {
				//해당 확장자가 없을 때는 새로 키와 value 추가
				map.put(list[1], 1);
			}

		}
		for(String s : map.keySet()) {
			System.out.println(s + " " + map.get(s));
		}
		
	}
}
