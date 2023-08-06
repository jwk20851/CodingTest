//https://www.acmicpc.net/problem/2669

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int[][] map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        map = new int[101][101];
        for(int i = 0; i < 4; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            checkSquare(x1, y1, x2, y2);
        }
        
        System.out.print(checkCnt());
	}
	
	private static void checkSquare(int x1, int y1, int x2, int y2){
	    for(int i = x1; i < x2; i++){
	        for(int j = y1; j < y2; j++)
	            map[i][j] = 1;
	    }
	}
	
	private static int checkCnt(){
	    int ans = 0;
        for(int i = 0; i < 101; i++){
            for(int j = 0; j < 101; j++){
                if(map[i][j] == 1)
                    ans++;
            }
        }
        
        return ans;
	}
}