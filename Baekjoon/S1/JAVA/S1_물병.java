//https://www.acmicpc.net/problem/1052

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
        if(N <= K){
            System.out.print(0);
            return;
        }
        
        int ans = 0, cnt = 0;
		while(true){
            cnt = 0;
            int tmp = N;
            while(tmp != 0){
                if(tmp%2 == 1)
                    cnt++;
                tmp /= 2;
            }
            
            if(cnt <= K)
                break;
                
            N++;
            ans++;
        }
        
        System.out.println(ans);
    }
}