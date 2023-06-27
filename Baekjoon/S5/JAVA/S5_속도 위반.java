//https://www.acmicpc.net/problem/11971

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
		
		int[][] road = new int [N][2];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    road[i][0] = Integer.parseInt(st.nextToken());
		    road[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		for(int i = 0; i < M; i++){
		    st = new StringTokenizer(br.readLine());
		    int dis = Integer.parseInt(st.nextToken());
		    int speed = Integer.parseInt(st.nextToken());
		    
		    for(int j = 0; j < N; j++){
		        if(dis > 0){
    		        if(dis > road[j][0] && road[j][0] != 0){
    		            dis -= road[j][0];
    		            road[j][0] = 0;
    		            max = Math.max(max, (road[j][1]<speed)? speed-road[j][1] : 0);
    		        }
    		        else if(dis <= road[j][0]){
    		            road[j][0] -= dis;
    		            dis = 0;
    		            max = Math.max(max, (road[j][1]<speed)? speed-road[j][1] : 0);
    		        }
		        }
		        else
		            break;
		    }
		}
		
		System.out.println(max);
	}
}