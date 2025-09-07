import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        String s [][] = new String [9][9];
        //이차원 배열로 숫자 넣기
        for (int j = 0; j < 9; j++){
             String k [] = sc.nextLine().split(" ");
            for(int i = 0; i < 9; i++){
           s[j][i] = k[i];
        }
        }
        //숫자 비교하기
        max = Integer.parseInt(s[0][0]);
        //좌표를 저장할 변수 설정
        int max_x = 0;
        int max_y = 0;
        for (int j = 0; j < 9; j++){
            for(int i = 0; i < 9; i++){
               if(max < Integer.parseInt(s[j][i])){
                   max = Integer.parseInt(s[j][i]);
                   max_x = i;
                   max_y = j;
               }
            }
        }
        max_x += 1;
        max_y += 1;
        System.out.println(max);
        System.out.println(max_y+ " " + max_x);
    }
}