//https://www.acmicpc.net/problem/18511

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    private static int N = 0, K = 0, ans = 0;
    private static int[] arr;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		arr = new int[K];
		for(int i = 0; i < K; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		recur(0);
		
		System.out.println(ans);
    }
    
    private static void recur(int now){
        if(now > N)
            return;
        
        if(ans < now)
            ans = now;
		
		for(int i = K-1; i >= 0; i--)
			recur(now*10 +arr[i]);
    }
}