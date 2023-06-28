//https://www.acmicpc.net/problem/16926

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int N, M, R;
    private static int[][] arr;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < M; j++)
		        arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		rotateArr();

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++){
			for(int j = 0; j < M; j++){
				sb.append(arr[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
	private static void rotateArr(){
	    int cnt = Math.min(N, M)/2;
	    while(R-- > 0){
	        for(int i = 0; i < cnt; i++){
				int x = i, y = i;
				int start = arr[x][y];
				int idx = 0;
				while(idx < 4){
					int nx = x + dx[idx];
					int ny = y + dy[idx];
					
					if(nx<i || ny<i || nx>=N-i || ny>=M-i){
					    idx++;
					    continue;
					}
			
					arr[x][y] = arr[nx][ny];
					x = nx;
					y = ny;
				}
				
				arr[i+1][i] = start;
			}
	    }
		
		return;
	}
}