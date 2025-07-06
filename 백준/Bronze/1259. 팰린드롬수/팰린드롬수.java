

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// LinkedList의 모든 요소를 출력하는 메서드

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String number = br.readLine();

			if (number.equals("0")) {
				break;

			}

			ArrayList<Character> array = new ArrayList<Character>();

			for (int i = 0; i < number.length(); i++) {
				array.add(number.charAt(i));
				
			}
			
	

			ArrayList<Character> array2 = new ArrayList<Character>();

			for (int i = number.length() - 1; i >= 0; i--) {
				array2.add(number.charAt(i));
			}
			
			for(int i = 0 ; i < array.size(); i++) {
				if (array.get(i) != array2.get(i)) {
					System.out.println("no");
					break;
				}else if(i == array.size()-1) {
					System.out.println("yes");
				}
					
			}

			

			
			
			

		}

	}
}
