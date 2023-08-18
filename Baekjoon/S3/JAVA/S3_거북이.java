//https://www.acmicpc.net/problem/8911

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	private static int[] dx = {0, 1, 0, -1};
	private static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(N-- > 0){
		    String route = br.readLine();
		    int area = checkRoute(route);
		    sb.append(area).append("\n");
		}
		
		System.out.print(sb);
    }
    
    private static int checkRoute(String str){
        int x = 0, y = 0, dir = 0;
        int minX = 0, minY = 0, maxX = 0, maxY = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
			if(c == 'F'){
				x += dx[dir];
				y += dy[dir];
			}
			else if(c == 'B'){
				x -= dx[dir];
				y -= dy[dir];
			}
			else if(c == 'L')
			    dir = (dir+1)%4;
			else if(c == 'R')
				dir = (dir+3)%4;
			
			minX = Math.min(minX, x);
			minY = Math.min(minY, y);
			maxX = Math.max(maxX, x);
			maxY = Math.max(maxY, y);
        }
        
        int w = maxX - minX;
		int h = maxY - minY;
		
		return w*h;
    }
}