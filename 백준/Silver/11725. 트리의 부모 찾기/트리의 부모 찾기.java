
import java.util.*;

public class Main {
    static ArrayList<Integer>[] g;
    static int[] p;
    static boolean[] v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        g = new ArrayList[n + 1]; // 그래프
        p = new int[n + 1];       // 부모 저장
        v = new boolean[n + 1];   // 방문 확인

        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g[a].add(b);
            g[b].add(a);
        }

        dfs(1); // 루트부터 탐색 시작

        for (int i = 2; i <= n; i++) {
            System.out.println(p[i]);
        }
    }

    static void dfs(int now) {
        v[now] = true;
        for (int next : g[now]) {
            if (!v[next]) {
            	//p에 현재 부모 작성해주기 (now가 현재 부모)
                p[next] = now;
                dfs(next);
            }
        }
    }
}

