//https://www.acmicpc.net/problem/18221

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] room = new int[N][N];
		int sgX = 0, sgY = 0, proX = 0, proY = 0;
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j = 0; j < N; j++){
		        room[i][j] = Integer.parseInt(st.nextToken());
		        if(room[i][j] == 2){
		            sgX = i;
		            sgY = j;
		        }
		        else if(room[i][j] == 5){
		            proX = i;
		            proY = j;
		        }
		    }
		}
		if(Math.sqrt((sgX-proX)*(sgX-proX) + (sgY-proY)*(sgY-proY)) < 5){
		    System.out.print(0);
		    System.exit(0);
		}
		
		int startX = Math.min(sgX, proX), startY= Math.min(sgY, proY);
		int endX = Math.max(sgX, proX), endY = Math.max(sgY, proY);
		int cnt = 0;
		for(int i = startX; i <= endX; i++){
		    for(int j = startY; j <= endY; j++){
		        if(room[i][j] == 1)
		            cnt++;
		    }
		}
		System.out.print(cnt>=3? 1:0);
	}
}