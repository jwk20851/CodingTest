//https://www.acmicpc.net/problem/1913

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    private static int[][] arr;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int N, num;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		num = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		setArr();

		StringBuilder sb = new StringBuilder();
		printArr(sb);
		
		System.out.print(sb);
	}
	
	private static void setArr(){
	    int cnt = N*N;
	    arr[0][0] = cnt--;
	    
	    int nx = 0, ny = 0, idx = 0;
	    while(true){
	        nx += dx[idx];
	        ny += dy[idx];

	        if(nx<0 || ny<0 || nx>=N || ny>=N || arr[nx][ny] != 0){
	            nx -= dx[idx];
	            ny -= dy[idx];
	            
	            idx = (idx+1)%4;
	            
	            continue;
	        }
	        
            arr[nx][ny] = cnt--;
            if(cnt == 0)
                break;
	    }
	    
	    return;
	}
	
	private static void printArr(StringBuilder sb){
		int x = 0, y = 0;
		for(int i = 0; i < N; i++){
		    for(int j = 0; j < N; j++){
		        sb.append(arr[i][j]+" ");
		        if(arr[i][j] == num){
		            x = i+1;
		            y = j+1;
		        }
		    }
		    sb.append("\n");
		}
		sb.append(x +" "+ y);
		
		return;
	}
}