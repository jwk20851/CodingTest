//https://www.acmicpc.net/problem/1051

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] board = new int[N][M];
		for(int i = 0; i < N; i++){
		    String str = br.readLine();
		    for(int j = 0; j < M; j++)
		        board[i][j] = str.charAt(j);
		}
		
		int l = Math.min(N,M);
		while(l > 0){
    		for(int i = 0; i <= N-l; i++){
    		    for(int j = 0; j <= M-l; j++){
    		        int tmp = board[i][j];
        	        if(tmp==board[i+l-1][j] && tmp==board[i][j+l-1] && tmp==board[i+l-1][j+l-1]){
                        System.out.print(l*l);
                        System.exit(0);
                    }
    		    }
    		}
    		l--;
		}
		
        System.out.print(l*l);
	}
}