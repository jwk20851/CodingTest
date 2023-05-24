//https://www.acmicpc.net/problem/15970

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] point = new int[N][2];
		for(int i = 0; i < N; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    point[i][0] = Integer.parseInt(st.nextToken());
		    point[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(point, (o1, o2) -> {
		    if(o1[1] == o2[1])
		        return o1[0]-o2[0];
            else
                return o1[1]-o2[1];
		});
		
		int ans = 0;
		for(int i = 0; i < N; i++){
		    if(i == 0)
		        ans += point[1][0] - point[0][0];
		    else if(i == N-1)
		        ans += point[N-1][0]-point[N-2][0];
		    else{
		        if(point[i][1] == point[i-1][1] && point[i][1] == point[i+1][1])
                    ans += Math.min(point[i][0]-point[i-1][0], point[i+1][0]-point[i][0]);
                else if(point[i][1] == point[i-1][1])
                    ans += point[i][0]-point[i-1][0];
                else
                    ans += point[i+1][0]-point[i][0];
		    }
		}
		
		System.out.print(ans);
	}
}