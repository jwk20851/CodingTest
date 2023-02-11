//https://www.acmicpc.net/problem/2961

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int[][] ingre;
    static boolean[] visit;
    static int n, min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		visit = new boolean[n];
		ingre = new int[n][2];
		for(int i = 0; i < n; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    ingre[i][0] = Integer.parseInt(st.nextToken());
		    ingre[i][1] = Integer.parseInt(st.nextToken());
		}
		
		DFS(0);
		
		System.out.print(min);
	}
	
	static void DFS(int x){
	    if(x == n){
	        int s = 1, b = 0, cnt = 0;
	        for(int i = 0; i < n; i++){
	            if(visit[i]){
	                cnt++;
	                s *= ingre[i][0];
	                b += ingre[i][1];
	            }
	        }
            if(cnt == 0)   
                return;
                
	        min = Math.min(min, Math.abs(s-b));
	        return;
	    }
	    
	    visit[x] = false;
		DFS(x+1);
	    visit[x] = true;
		DFS(x+1);
	}
}