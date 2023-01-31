//https://www.acmicpc.net/problem/1389

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int[][] arr;
	static boolean[] visit;
	static int min = Integer.MAX_VALUE;
	static int n, m, ans = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		for(int i = 0; i < m; i++){
		    st = new StringTokenizer(br.readLine());
		    int a = Integer.parseInt(st.nextToken());
		    int b = Integer.parseInt(st.nextToken());
		    
		    arr[a][b] = arr[b][a] = 1;
		}
		
		for(int i = 1; i <= n; i++){
			visit = new boolean[n+1];
			BFS(i);
		}
		
		System.out.print(ans);
	}
	
	static void BFS(int tmp) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(tmp, 0));
		visit[tmp] = true;
		
		int cnt = 0;
		while(!q.isEmpty()){
			Point p = q.poll();
			int x = p.x;
			int y = p.y;
			
			cnt += p.y;
			
			for(int i = 1; i <= n; i++){
				int num = arr[x][i];
				
				if(num == 1 && !visit[i]){
					visit[i] = true;
					q.add(new Point(i, y+1));
				}
			}
		}

		if(min > cnt) {
			min = cnt;
			ans = tmp;
		}
	}
	
	static class Point{
	    int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
	}
}