//https://www.acmicpc.net/problem/2166

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		long[][] point = new long[N+1][2];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    point[i][0] = Long.parseLong(st.nextToken());
            point[i][1] = Long.parseLong(st.nextToken());
		}
		
		long sum = 0;
        for(int i = 1; i < N-1; i++)
            sum += ccw(point[0][0], point[0][1], point[i][0], point[i][1], point[i+1][0], point[i+1][1]);
        
        sum = Math.abs(sum);
        
		System.out.printf("%.1f", (double)sum/2);
	}
	
	static long ccw(long x1, long y1, long x2, long y2, long x3, long y3){	//신발끈 공식(ccw)
	    return (x1*y2+x2*y3+x3*y1) - (y1*x2+y2*x3+y3*x1);
	}
}