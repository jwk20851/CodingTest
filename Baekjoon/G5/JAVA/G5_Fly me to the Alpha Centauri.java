//https://www.acmicpc.net/problem/1011

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n-- > 0){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int x = Integer.parseInt(st.nextToken());
		    int y = Integer.parseInt(st.nextToken());
		    
		    int d = y-x;
		    int dMax  = (int)Math.sqrt(d);
		    
		    int cnt = 0;
		    if(dMax == Math.sqrt(d))
            	cnt = dMax*2 - 1;
            else if(d <= dMax*dMax+dMax)
                cnt = dMax*2;
            else
                cnt = dMax*2 + 1;
                
            sb.append(cnt+"\n");
		}
		
		System.out.print(sb);
	}
}