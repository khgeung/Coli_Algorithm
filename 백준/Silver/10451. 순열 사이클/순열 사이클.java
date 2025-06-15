import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int[] perm = new int[n + 1]; // 1-based indexing
            boolean[] visited = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                perm[i] = sc.nextInt();
            }

            int cycleCount = 0;

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    int current = i;
                    while (!visited[current]) {
                        visited[current] = true;
                        current = perm[current];
                    }
                    cycleCount++;
                }
            }

            System.out.println(cycleCount);
        }

        sc.close();
    }
}
