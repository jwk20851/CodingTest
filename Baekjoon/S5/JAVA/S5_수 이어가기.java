//https://www.acmicpc.net/problem/2635

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> ans = new ArrayList<>();
		int max = 0;    
		for(int i = N; i >= N/2; i--){      //N/2보다 작을 경우, 3 고정
			List<Integer> li = new ArrayList<>();
			li.add(N);
			
			int tmpA = N;
			int tmpB = i;
			while(true){
				if(tmpA < 0)
				    break;
				if(tmpB >= 0)
				    li.add(tmpB);
				    
				int tmpC = tmpA-tmpB;
				tmpA = tmpB;
				tmpB = tmpC;
			}
			
			if(max < li.size()){
				max = li.size();
				ans = li;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n");
		for(int i : ans)
		    sb.append(i).append(" ");
		
		System.out.print(sb);
    }
}