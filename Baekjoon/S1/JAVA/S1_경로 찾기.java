//https://www.acmicpc.net/submit/11403/57213426

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    private static int N;
    private static int[][] map;
    private static boolean[] visit;
    private static List<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N+1][N+1];
		
		for(int i = 0; i <= N; i++)
		    li.add(new ArrayList<Integer>());
		    
		StringTokenizer st;
		for(int i = 1; i <= N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 1; j <= N; j++)
		        if(st.nextToken().equals("1"))
		            li.get(i).add(j);
		}
		
		for(int i = 1; i <= N; i++){
		    visit = new boolean[N+1];
		    BFS(i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++){
		    for(int j = 1; j <= N; j++)
		        sb.append(map[i][j]+" ");
		    sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
	private static void BFS(int num){
	    Queue<Integer> q = new LinkedList<Integer>();
	    q.add(num);

	    int cnt = 0;
	    while(!q.isEmpty()){
	        int tmp = q.poll();
	        for(int i : li.get(tmp)){
	            if(!visit[i] && ++cnt <= N){
    	            q.add(i);
    	            visit[i] = true;
    	            map[num][i] = 1;
	            }
	        }
	    }
	}
}