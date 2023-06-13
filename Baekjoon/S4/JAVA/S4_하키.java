//https://www.acmicpc.net/problem/1358

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int endX = X+W, endY = Y+H;
		int r = H/2, halfY = Y+r;
		int cnt = 0;
		for(int i = 0; i < P; i++){
		    st = new StringTokenizer(br.readLine());
		    int playerX = Integer.parseInt(st.nextToken());
            int playerY = Integer.parseInt(st.nextToken());
            
            if(playerX >= X && playerX <= endX && playerY >= Y && playerY <= endY)	//직사각형
                cnt++;
            else if(checkCircle(playerX, playerY, X, halfY) <= r*r)	//앞쪽 반원
				cnt++;
            else if(checkCircle(playerX, playerY, endX, halfY) <= r*r)	//뒤쪽 반원
                cnt++;
		}
		
		System.out.print(cnt);
	}
	
	static double checkCircle(int x1, int y1, int x2, int y2){
		return Math.pow(Math.abs(x2-x1), 2) + Math.pow(Math.abs(y2-y1), 2);
	}
}