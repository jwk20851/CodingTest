//https://www.acmicpc.net/problem/6064

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            
            boolean check = false;
            for(int i = x; i < N*M; i += M){
                if(i%N == y){
                    sb.append(i+1+"\n");
					check = true;
					break;
                }
            }
            if(!check)
                sb.append("-1\n");
        }
        
        System.out.print(sb);
	}
}