//https://www.acmicpc.net/problem/1485

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0){
		    StringTokenizer st;
		    Pos[] arr = new Pos[4];
		    for(int i = 0; i < 4; i++){
		        st = new StringTokenizer(br.readLine());
		        int x = Integer.parseInt(st.nextToken());
		        int y = Integer.parseInt(st.nextToken());
		        
		        arr[i] = new Pos(x, y);
		    }
		    
		    long[] dis = new long[6];
            int idx = 0;
            for(int i = 0; i < 4; i++){
                for (int j = i+1; j < 4; j++){
                    dis[idx++] = getDis(arr[i], arr[j]);
                }
            }
            
            Arrays.sort(dis);
            
            if(dis[0]==dis[1] && dis[1]==dis[2] && dis[2]==dis[3] && dis[4]==dis[5])
                sb.append(1+"\n");
            else
                sb.append(0+"\n");
		}
		
		System.out.print(sb);
	}
	
	private static long getDis(Pos a, Pos b){
        return (long)(Math.pow((a.x-b.x), 2) + Math.pow((a.y-b.y), 2));
    }
	
	static class Pos{
        int x, y;
        public Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}