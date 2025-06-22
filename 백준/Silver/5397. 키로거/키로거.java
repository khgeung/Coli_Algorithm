

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

// LinkedList의 모든 요소를 출력하는 메서드

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int s = 0; s < t; s++) {
			Stack<Character> left = new Stack<>();
			Stack<Character> right = new Stack<>();

			String a = br.readLine();

			for (char k : a.toCharArray()) {

				if (k == '-') {
					// 삭제 연산
					// 왼쪽 스택에 있는 문자를 삭제한다.
					if (left.size() != 0)
						left.pop();

				} else if (k == '<') {
					// 왼쪽 스택에 있던 문자를 오른쪽 스택에 둔다
					// 아무것도 없을 시 작동 안함
					if (left.size() != 0) {

						right.push(left.pop());
					}

				} else if (k == '>') {
					if (right.size() != 0)
						left.push(right.pop());

				} else {
					left.push(k);
				}

			}

			StringBuilder sb = new StringBuilder();
			//왼쪽 꺼내기
			for (int i = 0; i < left.size(); i++) {
				sb.append(left.get(i));
			}
			
			//오른쪽 꺼내기
			while (!right.isEmpty()) {
			    sb.append(right.pop());
			}
			
			//출력
			System.out.println(sb);	

		}

	}
}
