//https://www.acmicpc.net/submit/6144/56472457

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] w = new int[n];
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            d[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] ans = new int[m+1];
        for(int i = 0; i < n; i++){
            for(int j = m; j >= w[i]; j--){
                ans[j] = Math.max(ans[j], ans[j-w[i]]+d[i]);
            }
        }
        
        System.out.println(ans[m]);
	}
}