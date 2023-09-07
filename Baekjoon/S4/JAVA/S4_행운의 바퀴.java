//https://www.acmicpc.net/problem/2840

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        char[] roulette = new char[N];
        Arrays.fill(roulette, '?');
        
        boolean[] alpha = new boolean[26];
        int now = 0;
		for(int i = 0; i < K; i++){
			st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			char c = st.nextToken().charAt(0);
			
			now = (now+cnt)%N;
			if(roulette[now] == c)
			    continue;
 
            if(roulette[now]=='?' && !alpha[c-'A']){
                roulette[now] = c;
                alpha[c-'A'] = true;
            }
            else{
                System.out.print('!');
                return;
            }
		}
		
		StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while(cnt < N){
            int tmp = (now >= cnt)? now-cnt : now-cnt+N;
            sb.append(roulette[tmp%N]);
            cnt++;
        }
            
        System.out.println(sb);
    }
}