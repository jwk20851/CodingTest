//https://www.acmicpc.net/problem/5567

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main{
    static List<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
    static boolean[] visit;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i <= n; i++)
		    li.add(new ArrayList<Integer>());
		
		StringTokenizer st;
		boolean check = false;
		for(int i = 0; i < m; i++){
		    st = new StringTokenizer(br.readLine());
		    int a = Integer.parseInt(st.nextToken());
		    int b = Integer.parseInt(st.nextToken());
		    
		    li.get(a).add(b);
		    li.get(b).add(a);
		    
		    if(a == 1 || b == 1)
		        check = true;
		}
		
		if(!check){
		    System.out.print("0");
		    System.exit(0);
		}
		
		visit = new boolean[n+1];
		DFS(1, 0);
		
		int cnt = 0;
		for(int i = 2; i <= n; i++){
		    if(visit[i])
		        cnt++;
		}
		        
		System.out.print(cnt);
	}
	
	private static void DFS(int num, int depth){
	    if(depth > 2)
	        return;

	    visit[num] = true;
        for(int i : li.get(num))
            DFS(i, depth+1);
	}
}