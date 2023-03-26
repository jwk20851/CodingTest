//https://www.acmicpc.net/problem/6236

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] money = new int[N];
		int max = 0, sum = 0;
		for(int i = 0; i < N; i++){
            money[i] =  Integer.parseInt(br.readLine());
            sum += money[i];
            max = Math.max(max, money[i]);
		}
        
        int start = max, end = sum, ans = 0;
        while(start <= end){
            int mid = (start+end)/2;
            
            int K = mid;
            int cnt = 1;
            for(int i = 0; i < N; i++){
                if(K < money[i]){
                    K = mid;
                    cnt++;
                }
                K -= money[i];
            }
            
            if(cnt <= M){
                ans = mid;
                end = mid -1;
            }
            else
                start = mid +1;
        }
        
        System.out.print(ans);
	}
}