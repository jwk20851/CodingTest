//https://www.acmicpc.net/problem/15657

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    static int n = 0, m = 0;
    static int[] arr, ans;
    static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		ans = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
		    arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		DFS(0, 0);
		
		System.out.print(sb);
	}
	
	static void DFS(int cnt, int dep){
	    if(dep == m){
	        for(int i = 0; i < m; i++)
	            sb.append(ans[i] +" ");
	        sb.append("\n");
	        return;
	    }
	    
        for(int i = cnt; i < n; i++){
            ans[dep] = arr[i];
            DFS(i, dep+1);
	    }
	}
}