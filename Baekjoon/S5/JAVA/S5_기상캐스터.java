//https://www.acmicpc.net/problem/10709

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int H, W;
    private static int[][] ans;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		ans = new int[H][W];
		for(int i = 0; i < H; i++){
		    for(int j = 0; j < W; j++)
		        ans[i][j] = -1;
		}
		
		for(int i = 0; i < H; i++)
		    checkWeather(i, br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++)
                sb.append(ans[i][j]).append(" ");
            sb.append("\n");
        }
        
		System.out.print(sb);
    }
    
    private static void checkWeather(int i, String cloud){
        for(int j = 0; j < W; j++){
            char c = cloud.charAt(j);
            if(c == 'c'){
                int min = 0;
                for(int k = j; k < W; k++)
                    ans[i][k] = min++;
            }
        }
    }
}