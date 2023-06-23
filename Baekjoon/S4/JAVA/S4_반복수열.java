//https://www.acmicpc.net/problem/2331

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(A);
		while(true){
		    int tmp = li.get(li.size()-1);
		    int sum = 0;
		    while(tmp > 0){
                sum += (int)Math.pow(tmp%10, P);
                tmp /= 10;
            }
            
		    if(!li.contains(sum))
		        li.add(sum);
		    else{
                System.out.println(li.indexOf(sum));
                break;
		    }
		}
		
		/*
		String A = st.nextToken();
		int P = Integer.parseInt(st.nextToken());
		
		List<Long> li = new ArrayList<Long>();
		li.add(Long.parseLong(A));
		while(true){
		    long sum = 0, idx = 0;
		    for(int i = 0; i < A.length(); i++){
		        long tmp = 1;
		        for(int j = 0; j < P; j++){
		            tmp *= A.charAt(i)-'0';
		        }
		        sum += tmp;
		    }
		    
		    if(!li.contains(sum)){
		        li.add(sum);
		        A = Long.toString(sum);
		    }
		    else{
                System.out.println(li.indexOf(sum));
                break;
		    }
		}
		*/
	}
}