//https://www.acmicpc.net/problem/1064

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ax = Integer.parseInt(st.nextToken());
		int ay = Integer.parseInt(st.nextToken());
		int bx = Integer.parseInt(st.nextToken());
		int by = Integer.parseInt(st.nextToken());
		int cx = Integer.parseInt(st.nextToken());
		int cy = Integer.parseInt(st.nextToken());
		
		if((ax-bx)*(ay-cy)==(ax-cx)*(ay-by))	//나눌 경우((ax-bx)/(ay-by))에서 0으로 나눠질 수 있어 곱셈으로 변경
		    System.out.print(-1);
		else{
		    double ab = Math.sqrt(Math.pow(ax-bx,2)+Math.pow(ay-by,2));
		    double bc = Math.sqrt(Math.pow(bx-cx,2)+Math.pow(by-cy,2));
		    double ca = Math.sqrt(Math.pow(cx-ax,2)+Math.pow(cy-ay,2));
		    
		    double max = Math.max(ab,Math.max(bc,ca));
		    double min = Math.min(ab,Math.min(bc,ca));
		    
		    System.out.print(2*(max-min));
		}
	}
}