import java.util.Scanner;

import java.util.Collections;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		PriorityQueue<Integer> queueList = new PriorityQueue<>(Collections.reverseOrder());

		

		for (int i =0 ; i <n ; i++){

			for (int j =0 ; j<n;j++){

				

				queueList.add(Integer.parseInt(sc.next()));

				

				

			}

		}

		

		for(int k = 0 ; k <n-1 ; k++){

			queueList.poll();

		}

		

		System.out.println(queueList.poll());

	}

	

}