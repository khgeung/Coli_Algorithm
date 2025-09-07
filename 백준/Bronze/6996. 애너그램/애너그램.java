

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static boolean solveAnagrams(String first, String second) {
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();

		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		//사이즈가 다를 시 return false
		if(firstArray.length != secondArray.length) {
			return false;
		}
		
		for(int i = 0; i < firstArray.length; i++) {
			if(firstArray[i] != secondArray[i]) {
				return false;
			}
		}
		return true;

	
		/* -------------------- END OF INSERTION -------------------- */
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numTests = sc.nextInt();

		for (int i = 0; i < numTests; i++) {
			String first = sc.next().toLowerCase();
			String second = sc.next().toLowerCase();

			System.out.println(
					first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
		}
	}
}
