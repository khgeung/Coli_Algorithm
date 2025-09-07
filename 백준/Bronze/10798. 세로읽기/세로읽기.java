
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<String>> list = new ArrayList<>();
		
		StringBuilder answer = new StringBuilder();
		// 입력받기
		for (int i = 0; i < 5; i++) {
			ArrayList<String> wordList = new ArrayList<String>();
			String word[] = sc.nextLine().split("");
			for (int j = 0; j < word.length; j++) {
				wordList.add(word[j]);
			}
			list.add(wordList);
			
		}

		// 가로의 길이 최댓값 구하기
		int max = 0;
		for (int i = 0; i < 5; i++) {
			if (max < list.get(i).size()) {
				max = list.get(i).size();

			}
		}

		// 가로의 길이 동일하게 맞추기
		for (int i = 0; i < 5; i++) {
			if (list.get(i).size() < max) {
				int count = max - list.get(i).size();
				for (int k = 0; k < count; k++) {
					list.get(i).add("");
				}

			}
		}

		//문자들을 세로로 담기
		for (int i = 0; i < max; i++) {
			for(int j = 0;j<5; j++ ) {
				answer.append(list.get(j).get(i));
			}
		}
		System.out.println(answer);

	}

}