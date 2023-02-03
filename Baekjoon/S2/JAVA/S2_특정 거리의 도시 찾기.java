//https://www.acmicpc.net/problem/18352

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
    static int[] dis;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		dis = new int[n+1];
		for(int i = 0; i <= n; i++){
			al.add(new ArrayList<Integer>());
			dis[i] = -1;
		}
		
		for(int i = 0; i < m; i++){
		    st = new StringTokenizer(br.readLine());
		    int a = Integer.parseInt(st.nextToken());
		    int b = Integer.parseInt(st.nextToken());
		    
		    al.get(a).add(b);
		}
		
		BFS(x);
		
		boolean check = false;
		for(int i = 1; i <= n; i++){
			if(dis[i] == k){
				System.out.println(i);
				check = true;
			}
		}
		
		if(check == false)
			System.out.println(-1);
	}
	
	static void BFS(int x){
	    dis[x] = 0;
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		
		while(!q.isEmpty()){
		    int tmp = q.poll();
		    
		    for(int i = 0; i < al.get(tmp).size(); i++){
		        int next = al.get(tmp).get(i);
		        
		        if(dis[next] == -1){
		            dis[next] = dis[tmp]+1;
		            q.offer(next);
		        }
		    }
		}
	}
}