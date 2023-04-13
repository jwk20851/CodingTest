//https://www.acmicpc.net/problem/8979

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] nation = new int[N+1][3];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    int idx = Integer.parseInt(st.nextToken());
		    nation[idx][0] = Integer.parseInt(st.nextToken());
		    nation[idx][1] = Integer.parseInt(st.nextToken());
		    nation[idx][2] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 1;
		for(int i = 1; i <= N; i++){
			if(nation[i][0] > nation[K][0])
				cnt++;
			else if(nation[i][0] == nation[K][0]){
			    if(nation[i][1] > nation[K][1])
				    cnt++;
				else if(nation[i][1] == nation[K][1]){
				    if(nation[i][2] > nation[K][2])
				        cnt++;
				}
			}
		}
		
		System.out.print(cnt);
	}
}