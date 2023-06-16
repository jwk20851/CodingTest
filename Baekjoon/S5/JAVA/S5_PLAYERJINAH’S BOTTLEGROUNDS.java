//https://www.acmicpc.net/problem/15803

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	    Pos[] arr = new Pos[3];
	    for(int i = 0; i < 3; i++){
	        st = new StringTokenizer(br.readLine());
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
	        
	        arr[i] = new Pos(x, y);
	    }
	    
	    boolean check = checkSt(arr[0], arr[1], arr[2]);
        
		System.out.print(check? "WHERE IS MY CHICKEN?":"WINNER WINNER CHICKEN DINNER!");
	}
	
	private static boolean checkSt(Pos a, Pos b, Pos c){
        if(Math.abs(a.x-c.x)*Math.abs(a.y-b.y) == Math.abs(a.x-b.x)*Math.abs(a.y-c.y))
            return true;
        else
            return false;
    }
	
	static class Pos{
        int x, y;
        public Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}