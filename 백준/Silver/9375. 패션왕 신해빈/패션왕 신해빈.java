
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int result = 1;
			int n = sc.nextInt();
			HashMap<String, HashSet<String>> cloth = new HashMap<String, HashSet<String>>();
		
			for (int j = 0; j < n; j++) {
				String name = sc.next();
				String gear = sc.next();
				cloth.putIfAbsent(gear, new HashSet<>());
				cloth.get(gear).add(name);
			}
			
			//입을 수 있는 옷 가짓수 구하기
			for(HashSet<String> name : cloth.values() ) {
				result *= name.size() + 1;
			}
			
			System.out.println(result-1);
		}
		

	}// main
}// Main
