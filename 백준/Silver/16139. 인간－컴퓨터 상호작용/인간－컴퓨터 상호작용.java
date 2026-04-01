

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] word;
		
		word = br.readLine().split("");
		
		int q = 0;
		
		q = Integer.parseInt(br.readLine());
		
		//문자열을 알파벳 순으로 정렬한다.
		//기존 문자열 배열을 복사하여 정렬한다.
		//Arrays.copyOf(원본배열, 새배열길이);
		//또는 word.clone();

		String [] word2Clone = word.clone();
		
		Arrays.sort(word2Clone);
		//주의할점 : 중복 단어는 제거해서 넣어야 한다.
		Set<String> word2Set = new TreeSet<>();
		for(int s = 0; s < word2Clone.length; s++) {
			word2Set.add(word2Clone[s]);
		}
		
		//이후 인덱스가 필요하므로 다시 배열에 넣는다.
		//set -> 배열로 변환
		String [] word2 = word2Set.toArray(new String[0]);
		
		int [][] wordCount = new int [word2.length][word.length];
		
		for(int j = 0; j < word2.length; j++) {
			for(int i = 0; i < word.length; i++) {
				
				if(word2[j].equals(word[i])) {
					if(i == 0) {
						wordCount[j][i] += 1;
					}else {
						wordCount[j][i] = wordCount[j][i-1] + 1;
					}
				}
				else {
					if(i == 0) {
						wordCount[j][i] = 0;
					}else {
						wordCount[j][i] = wordCount[j][i-1];
					}
					
				}
			}
		}
		
//		for(int k : wordCount[0]) {
//			System.out.println(k);
//		}
		
		
		
		//0부터 5까지에 a가 있는지 확인하는 로직
		for(int i = 0; i < q ; i++) {
			int count = 0;
			String [] quest = br.readLine().split(" ");
			int l = Integer.parseInt(quest[1]);
			int r = Integer.parseInt(quest[2]);
			
			for(int k =0; k < word2.length; k++) {
				//주어진 문자를 word2에서 찾는다 -> 번호 받고, 이후 wordCount에서 찾는다
				if(quest[0].equals(word2[k])) {
					
					//System.out.println("주어진 문자 :" + word2[k]);
					
					//System.out.println(i+" 번째 경우");
					
					if(l != 0) {
					//찾은 문자의 누적합을 계산한다.
					count = wordCount[k][r] - wordCount[k][l-1];
					//System.out.println("wordCont[k][r] :"+ wordCount[k][r]+ " wordCount[k][l-1] :"+wordCount[k][l-1]);
					}
					else {
						count = wordCount[k][r];
					}
				
				}
			}
			
			System.out.println(count);
			
			
		}
		
	}
}

