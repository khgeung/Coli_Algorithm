
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// s,p 입력받기
		String[] sAndP = br.readLine().split(" ");
		int s = Integer.parseInt(sAndP[0]);
		int p = Integer.parseInt(sAndP[1]);
		int count = 0;

		Map<String, Integer> dna = new HashMap<>();
		dna.put("A", 0);
		dna.put("C", 0);
		dna.put("G", 0);
		dna.put("T", 0);

		String[] list = br.readLine().split("");

		for (int i = 0; i < p; i++) {
			if (dna.containsKey(list[i])) {
				dna.put(list[i], dna.get(list[i]) + 1);
			}
		}

		// System.out.println(dna);

		String[] numbers = br.readLine().split(" ");

		Map<String, Integer> dna2 = new HashMap<>();
		dna2.put("A", Integer.parseInt(numbers[0]));
		dna2.put("C", Integer.parseInt(numbers[1]));
		dna2.put("G", Integer.parseInt(numbers[2]));
		dna2.put("T", Integer.parseInt(numbers[3]));

		// System.out.println(dna2);

		if (dna.get("A") < dna2.get("A") || dna.get("C") < dna2.get("C") || dna.get("G") < dna2.get("G")
				|| dna.get("T") < dna2.get("T")) {

		} else {
			count++;

		}

		// 슬라이딩 윈도우 적용
		for (int i = p; i < s; i++) {
			String removeChar = list[i - p];
			String addChar = list[i];

			// 앞 문자 제거
			dna.put(removeChar, dna.get(removeChar) - 1);

			// 새 문자 추가
			dna.put(addChar, dna.get(addChar) + 1);

			// 조건 검사
			if (dna.get("A") >= dna2.get("A") && dna.get("C") >= dna2.get("C") && dna.get("G") >= dna2.get("G")
					&& dna.get("T") >= dna2.get("T")) {
				count++;
			}
		}

		System.out.println(count);

	}
}
