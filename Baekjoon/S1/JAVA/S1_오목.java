//https://www.acmicpc.net/problem/2615

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int[][] board = new int[19][19];
    private static int[] dx = {1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i = 0; i < 19; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < 19; j++)
		        board[i][j] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int j = 0; j < 19; j++){        //가장 왼쪽부터 탐색
		    for(int i = 0; i < 19; i++){
		        if(board[i][j] != 0)
		            checkOmok(i, j);
		    }
		}
		
		System.out.println(0);
	}
	
	private static void checkOmok(int x, int y){
	    for(int i = 0; i < 4; i++){
	        int nx = x;
	        int ny = y;
	        int cnt = 1;
	        while(true){
	            nx += dx[i];
    	        ny += dy[i];
    	        
    	        if(nx<0 || ny<0 || nx>=19 || ny>=19)
    	            break;
    	            
    	        if(board[x][y] == board[nx][ny])
    	            cnt++;
    	        else
    	            break;
	        }
	        
	        nx = x;
	        ny = y;
	        while(true){
	            nx -= dx[i];
    	        ny -= dy[i];
    	        
    	        if(nx<0 || ny<0 || nx>=19 || ny>=19)
    	            break;
    	            
    	        if(board[x][y] == board[nx][ny])
    	            cnt++;
    	        else
    	            break;
	        }
	        
	        if(cnt == 5){
				System.out.println(board[x][y]);
				System.out.println((x+1) +" "+ (y+1));
				System.exit(0);
			}
	    }
        
	    return;
	}
}