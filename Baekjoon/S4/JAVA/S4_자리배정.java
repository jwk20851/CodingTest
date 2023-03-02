//https://www.acmicpc.net/problem/10157

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        
        if(K == 1){
			System.out.println("1 1");
			System.exit(0);
		}
		if(C*R < K){
			System.out.println("0");
			System.exit(0);
		}
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
        int[][] arr = new int[R][C];
        arr[0][0] = 1;
        int x = 0, y = 0, cnt = 1;
        
        loop:
        while(true){
            for(int i = 0; i < 4; i++){
                while(true) {
					x = x+dx[i];
					y = y+dy[i];
					
					if(x<0 || R<=x || y<0 || C<=y){
    					x = x-dx[i];
    					y = y-dy[i];
						break;
					}
					if(arr[x][y] != 0){
    					x = x-dx[i];
    					y = y-dy[i];
						break;
					}
					
					arr[x][y] = ++cnt;
					
					if(cnt == K) {
						System.out.println((y+1)+" "+(x+1));
						break loop;
					}
				}
            }
        }
	}
}