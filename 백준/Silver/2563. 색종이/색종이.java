

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 좌표 입력받기 - 좌표 개수 n, x와 y좌표 2가지
		int[][] field = new int[n][2];
		// 도화지 설정 : 0~100까지 표기 가능
		int[][] paper = new int[101][101];
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			sc.nextLine();
			field[i][0] = x;
			field[i][1] = y;
		}

		// 색종이로 도화지 덮기
		// 색종이는 모두 정사각형 (한 변 길이 10)
		// 덮는 방법 : x, y 지정 -> y값 ~y+10값 까지 색칠
		// 이후 x값을 1씩 증가시켜 한줄씩 또 색칠

		// n개의 색종이만큼 반복
		for (int k = 0; k < n; k++) {
			// x값을 1씩 증가시키기
			for (int j = 0; j < 10; j++) {
				// y값 ~ y+10값 까지 색칠
				for (int i = 0; i < 10; i++) {
					// paper의 [x값][y값] 색칠	
					//이후 x값 증가시키기
					paper[field[k][0]][ field[k][1] + i] = 1;
				}
				field[k][0]++; //x 값을 1씩 증가시키기
			}
		}//for
		
		//도화지 검사 : 색종이가 칠해진 면적 계산
		int count = 0;
		for (int i = 0; i <100 ; i++) {
			for (int j = 0; j <100 ; j++) {
				if (paper[i][j]==1) {
					//System.out.println(i + " "+j);
					count++;
				}
			}
		}//for
		
		System.out.println(count);

	}
}
