//https://www.acmicpc.net/problem/10655

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static CheckPoint[] cp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		cp = new CheckPoint[N];
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    cp[i] = new CheckPoint(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		int sum = 0;
		for(int i = 0; i < N-1; i++)
		    sum += getDis(i, i+1);
		
		int ans = sum;
        for(int i = 1; i < N-1; i++){
            int tmp = sum - getDis(i,i-1) - getDis(i,i+1) + getDis(i-1,i+1);
            ans = Math.min(ans, tmp);
        }
		
		System.out.print(ans);
	}
	
	public static int getDis(int i, int j){
	    return Math.abs(cp[i].x-cp[j].x) + Math.abs(cp[i].y-cp[j].y);
	}
	
	static class CheckPoint{
	    int x, y;
	    public CheckPoint(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	}
}