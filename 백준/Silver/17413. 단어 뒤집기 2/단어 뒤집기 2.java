

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		Stack<String> word = new Stack<>();
		Queue<String> tag = new LinkedList<>();
		StringBuilder answer = new StringBuilder();
		boolean stop = false;
		String[] s = sc.nextLine().split("");

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(" ")) {
				// 공백으로 단어가 끊겼을 때
				// 단어의 마지막 글자부터 정답 스트링에 넣는다.

				while (word.size() != 0) {
					answer.append(word.pop());
				}
				word.clear();
				// 단어임을 구분하기 위해 공백을 넣는다.
				answer.append(" ");

			} else if (s[i].equals("<")) {
				
				while (word.size() != 0) {
					answer.append(word.pop());
				}
				word.clear();
				// 단어임을 구분하기 위해 공백을 넣는다.

				// 태그일 경우
				int num = i;
				// 해당 태그에서 ">"가 나올 때까지 while문을 돌려 tag 큐에 넣는다.
				while (true) {

					tag.add(s[num]);

					if (s[num].equals(">")) {
						// 만약 태그가 종료되었다면
						// 태그는 앞뒤를 바뀌지 않고 그대로 넣으므로
						// answer 스트링에 그대로 합친다.
						while (tag.size() != 0) {

							answer.append(tag.poll());
						}
						tag.clear();
						break;
					}
					num++;
					i++;

				}

			} else if(i == s.length-1) {
				word.add(s[i]);
				while (word.size() != 0) {
					answer.append(word.pop());
				}
				word.clear();
			}
			
			else {
				// 단어일 경우
				// stack에 넣어준다.
				word.add(s[i]);

			}
		}
		System.out.println(answer);

	}

}