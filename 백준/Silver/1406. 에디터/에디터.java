

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();

		// 주어진 문자열 입력받기
		String a = br.readLine();
		// 커맨드 횟수 입력받기
		int num = Integer.parseInt(br.readLine());
		// 주어진 문자열을 left에 담기
		for (char k : a.toCharArray()) {
			left.push(k);
		}

		// 커맨드에 따른 연산 수행하기
		for (int i = 0; i < num; i++) {

			String cmd = br.readLine();
			String[] cmdList = cmd.split(" "); // 공백으로 나누기

			// 커맨드 시작
			if (cmdList[0].equals("L")) {
				if (!left.isEmpty()) {
					right.push(left.pop());
				}
			} else if (cmdList[0].equals("D")) {
				if (!right.isEmpty()) {
					left.push(right.pop());
				}

			} else if (cmdList[0].equals("B")) {
				if (!left.isEmpty()) {
					left.pop();
				}

			} else if (cmdList[0].equals("P")) {
				left.push(cmdList[1].charAt(0));

			}
			

		}//for
		
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
