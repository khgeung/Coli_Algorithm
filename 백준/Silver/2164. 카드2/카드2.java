

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
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i < n+1; i++) {
			q.add(i);
		}
		
		while(true) {
			if(q.size() == 1) {
				break;
			}else {
				q.poll();
				int k = q.poll();
				q.add(k);
			}
			
		}
		
		System.out.println(q.poll());
		
	
	}
}
