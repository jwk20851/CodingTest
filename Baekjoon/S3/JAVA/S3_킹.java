//https://www.acmicpc.net/problem/1063

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String king = st.nextToken();
		int kingX = king.charAt(0)-'A'+1;
		int kingY = king.charAt(1)-'0';
		
		String stone = st.nextToken();
		int stoneX = stone.charAt(0)-'A'+1;
		int stoneY = stone.charAt(1)-'0';
		
		//          R L T B RT LT RB LB
		int[] dx = {1,-1,0,0,1,-1,1,-1};
		int[] dy = {0,0,-1,1,1,1,-1,-1};
		int N = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++){
		    String move = br.readLine();
		    
		    int idx = checkDir(move);
		    int kX = kingX +dx[idx];
		    int kY = kingY +dy[idx];
		    
		    if(kX<1 || kY<1 || kX>8 || kY>8)
		        continue;
		        
		    if(kX==stoneX && kY==stoneY){
		        stoneX += dx[idx];
		        stoneY += dy[idx];

		        if(stoneX<1 || stoneY<1 || stoneX>8 || stoneY>8){
		            stoneX -= dx[idx];
		            stoneY -= dy[idx];
		            continue;
		        }
		    }
		    
	        kingX = kX;
	        kingY = kY;
		}
		
		System.out.println((char)(kingX +'A'-1) +""+ kingY);
		System.out.println((char)(stoneX +'A'-1) +""+ stoneY);
    }
    
    private static int checkDir(String move){
        int tmp = 0;
	    switch(move){
	        case "R":
	            tmp = 0;
	            break;
	        case "L":
	            tmp = 1;
	            break;
	        case "B":
	            tmp = 2;
	            break;
	        case "T":
	            tmp = 3;
	            break;
	        case "RT":
	            tmp = 4;
	            break;
	        case "LT":
	            tmp = 5;
	            break;
	        case "RB":
	            tmp = 6;
	            break;
	        case "LB":
	            tmp = 7;
	            break;
	    }
	    
	    return tmp;
    }
}