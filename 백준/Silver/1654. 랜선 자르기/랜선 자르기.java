

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;



public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String [] nk = br.readLine().split(" ");
	        int n = Integer.parseInt(nk[0]);
	        long k = Long.parseLong(nk[1]);
	        ArrayList<Long> num = new ArrayList<>();
	        

	        for(int i=0; i<n;i++){

	            long a = Long.parseLong(br.readLine());
	            num.add(a);
	            
	        }

	        Collections.sort(num);

	        long r = num.get(n-1);
	        long l = 1;
	        long answer = 0;
	    
	        while (l<=r){
	        
	          //막대 길이
	          long f = (r+l)/2;
	          //막대 개수
	          long count = 0;

	            for(int i=n-1; i>-1; i--){
	                
	               long q = num.get(i) / f ;
	                count += q;
	            
	            }
	            	
	            //자른 길이가 너무 작아서 늘려야 한다면 
	            if(count >=k){
	            	answer = f;
	               l = f + 1;
	               
	             //자른 길이가 너무 커서 줄여야 한다면
	            }else if(count <k){
	               r = f - 1;
	                
	            }
	        

	        }

	        System.out.println(answer);
	}
	
	
}
