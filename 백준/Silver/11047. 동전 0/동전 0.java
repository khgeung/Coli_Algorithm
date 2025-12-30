

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] sr = br.readLine().split(" ");
		
		int n = Integer.parseInt(sr[0]);
		int k = Integer.parseInt(sr[1]);
		
		Integer [] coin = new Integer[n];
		
		for(int i = 0; i<n ; i++) {
			coin[i]= Integer.parseInt(br.readLine());
		}
		
		//동전 계산
		int count = 0;
		
		for(int i = n-1 ; i >= 0 ; i--) {
			if(coin[i]<=k) {
				int f = k / coin[i];
				int s = k % coin[i];
				count += f;
				k = s;
			}
		
		}
		
		System.out.println(count);
		
	}
}
