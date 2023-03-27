//https://www.acmicpc.net/problem/4158

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(true){
		    st = new StringTokenizer(br.readLine());
    		int N = Integer.parseInt(st.nextToken());
    		int M = Integer.parseInt(st.nextToken());
    		if(N==0 && M==0)
    		    break;
    		    
    		HashSet<Integer> hs = new HashSet<Integer>();
            for(int i = 0; i < N; i++)
                hs.add(Integer.parseInt(br.readLine()));
            
            int cnt = 0;
            for(int i = 0; i < M; i++){
                if(hs.contains(Integer.parseInt(br.readLine())))
                    cnt++;
            }
            
            sb.append(cnt+"\n");
		}
		
		System.out.print(sb);
	}
}