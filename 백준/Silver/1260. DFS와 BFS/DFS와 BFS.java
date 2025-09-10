

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	// DFS 함수 정의
	static void dfs(int node, Map<Integer, TreeSet<Integer>> list, boolean[] visited) {
		visited[node] = true;
		System.out.print(node + " "); // 방문 노드 출력

		if (list.containsKey(node)) { // 연결된 노드가 있으면
			for (int next : list.get(node)) {
				if (!visited[next]) {
					dfs(next, list, visited);
				}
			}
		}
	}

	// BFS 함수 정의
	static void bfs(int start, Map<Integer, TreeSet<Integer>> list, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");

			if (list.containsKey(node)) {
				for (int next : list.get(node)) {
					if (!visited[next]) {
						queue.add(next);
						visited[next] = true;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		String[] nmv = sc.nextLine().split(" ");
		int n = Integer.parseInt(nmv[0]);
		int m = Integer.parseInt(nmv[1]);
		int v = Integer.parseInt(nmv[2]);

		boolean[] visitedDfs = new boolean[n + 1];

		boolean[] visitedBfs = new boolean[n + 1];

		Map<Integer, TreeSet<Integer>> list = new HashMap<>();

		for (int i = 0; i < m; i++) {
			String[] numbers = sc.nextLine().split(" ");

			list.putIfAbsent(Integer.parseInt(numbers[0]), new TreeSet<>());
			list.get(Integer.parseInt(numbers[0])).add(Integer.parseInt(numbers[1]));
			list.putIfAbsent(Integer.parseInt(numbers[1]), new TreeSet<>());
			list.get(Integer.parseInt(numbers[1])).add(Integer.parseInt(numbers[0]));

		}

		// main 안에서 호출
		dfs(v, list, visitedDfs);
		System.out.println("");
		bfs(v, list, visitedBfs);

	}
}
