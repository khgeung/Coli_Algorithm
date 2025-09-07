
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, int[]> memo = new HashMap<>();

    public static int[] fib(int n) {
        if (memo.containsKey(n)) return memo.get(n);

        int[] result;
        if (n == 0) {
            result = new int[]{1, 0}; // 0이 1번, 1이 0번
        } else if (n == 1) {
            result = new int[]{0, 1}; // 0이 0번, 1이 1번
        } else {
            int[] fib1 = fib(n - 1);
            int[] fib2 = fib(n - 2);
            result = new int[]{fib1[0] + fib2[0], fib1[1] + fib2[1]};
        }

        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] res = fib(n);
            sb.append(res[0]).append(" ").append(res[1]).append("\n");
        }
        System.out.print(sb);
    }
}
