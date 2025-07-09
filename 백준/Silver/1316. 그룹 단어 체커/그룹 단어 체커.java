import java.io.IOException;

import java.util.LinkedHashMap;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {		Scanner sc = new Scanner(System.in);

		

		int n = sc.nextInt();

		sc.nextLine();

			int sum = n;

		for (int i = 0; i < n; i++) {

				LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

			String word = sc.nextLine();

				

			for (int j = 0; j<word.length(); j++) {

					List<Character> list = new ArrayList<>(map.keySet());

			//해당 글자가 map에 이미 들어가 있고

					char w = word.charAt(j);

				if(map.containsKey(w) && list.size() != 0) {

					//맨 뒤에 넣어진 글자가 아니라면

					// 그룹 단어 룰에 위배되므로 이 문자열은 그룹 단어가 아니다.

						if ( w !=list.get(list.size()-1)){

								sum -= 1;

								break;

						}

				}else {

				 // 한번도 들어간 적이 없는 글자일 때는 put

				 // 한번 들어간 적이 있는 글자지만 맨 뒤의 글자일 때는 횟수에 +1을 해준다.

				 //putIfAbsent 사용하기

						//개수가 3이어도 상관없음 (숫자 개수가 중요한게 아니라 그 숫자가 나왔는지가 중요)

					map.putIfAbsent(word.charAt(j), 1);

						//System.out.println(word.charAt(j));

				}

			}

		}

			

			System.out.println(sum);

	}

}