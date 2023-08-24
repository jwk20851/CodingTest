//https://www.acmicpc.net/problem/15900

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
    private static int N, cnt = 0;
    private static List<List<Integer>> li = new ArrayList<>();
    private static boolean[] visited;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i <= N; i++)
		    li.add(new ArrayList<Integer>());
		    
		for(int i = 0; i < N-1; i++){
		    st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            li.get(a).add(b);
            li.get(b).add(a);
		}
		
		visited = new boolean[N+1];
		DFS(1, 0);
		
		System.out.print((ans%2 == 0)? "No" : "Yes");
    }
    
    private static void DFS(int node, int depth){
        visited[node] = true;
		for(int next : li.get(node)){
			if(!visited[next])
				DFS(next, depth+1);
		}
		
		if(node != 1 && li.get(node).size() == 1)
			ans += depth;
    }
}