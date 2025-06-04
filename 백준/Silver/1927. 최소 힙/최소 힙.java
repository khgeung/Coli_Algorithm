import java.util.Scanner;

import java.util.Collections;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		PriorityQueue<Integer> queueList = new PriorityQueue<>();

		

		for (int i =0 ; i<n;i++){

			int num = sc.nextInt();

			if (num==0){

			if (queueList.isEmpty()){

				System.out.println(0);

			}else{

				System.out.println(queueList.poll());

			}

			}else{

				queueList.add(num);

			 }

		}

	}

	

}