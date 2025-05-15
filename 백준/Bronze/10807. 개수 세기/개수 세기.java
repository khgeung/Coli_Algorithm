import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  //정수 개수 입력받기
		  int n = sc.nextInt();
   		int number = 0;
		  int count = 0;
		   int numbers [] = new int [n];
		for (int i =0 ; i<n;i++){
		//입력받은 수를 int형으로 변경해서 집어넣기
			   number = Integer.parseInt(sc.next());
			   numbers[i] = number;
		}
		
	   	int v = 0;
		    v = sc.nextInt();
		
		// 배열 안의 숫자들과 비교하여 동일하면 count 1씩 추가
		for (int i =0; i <n; i++){
			if (numbers[i] == v){
				
				    count++;
			}
				    
		}
		System.out.println(count);
	 }
}