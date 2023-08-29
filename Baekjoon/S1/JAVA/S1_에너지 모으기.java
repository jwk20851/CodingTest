//https://www.acmicpc.net/problem/16198

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N, ans = 0;
    private static int[] bead;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		bead = new int[N];
		for(int i = 0; i < N; i++)
			bead[i] = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		DFS(0, 0);
		
		System.out.print(ans);
    }
    
    private static void DFS(int depth, int sum){
        if(depth == N-2){
            ans = Math.max(ans, sum);
            return;
        }
        
        for(int i = 1; i < N-1; i++){
            if(!visited[i]){
                visited[i] = true;
                DFS(depth+1, checkSum(i, sum));
                visited[i] = false;
            }
        }
    }
    
    private static int checkSum(int idx, int s){
        int l = idx-1, r = idx+1;
        while(true){
            if(!visited[l] && 0 <= l)
                break;
            l--;
        }
        while(true){
            if(!visited[r] && r < N)
                break;
            r++;
        }
        
        return s + bead[l]*bead[r];
    }
}