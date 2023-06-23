//https://www.acmicpc.net/problem/1002

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(T-- > 0){
		    st = new StringTokenizer(br.readLine());
		    int x1 = Integer.parseInt(st.nextToken());
		    int y1 = Integer.parseInt(st.nextToken());
		    int r1 = Integer.parseInt(st.nextToken());
		    
		    int x2 = Integer.parseInt(st.nextToken());
		    int y2 = Integer.parseInt(st.nextToken());
		    int r2 = Integer.parseInt(st.nextToken());
		    
		    sb.append(checkRange(x1, y1, r1, x2, y2, r2)+"\n");
		}
		
		System.out.print(sb);
	}
	
	private static int checkRange(int x1, int y1, int r1, int x2, int y2, int r2){
	    int powDis = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
	    int outDis = (r1+r2)*(r1+r2);
	    int inDis = (r2-r1)*(r2-r1);
	    
	    if(x1 == x2 && y1 == y2 && r1 == r2)
			return r1 == 0? 1:-1;
		else if(powDis > outDis || powDis < inDis)
		    return 0;
		else if(powDis == outDis || powDis == inDis)
		    return 1;
		else
		    return 2;
	}
}