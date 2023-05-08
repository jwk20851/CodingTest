//https://www.acmicpc.net/problem/17615

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    private static int N;
    private static String ball;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		ball = br.readLine();
		
		int R = 0, B = 0;
		for(int i = 0; i < N; i++){
			if(ball.charAt(i)=='R') 
				R++;
			else
				B++;
		}
		
		int ans = N;
		ans = Math.min(ans, R-colorCheck('R'));
		ans = Math.min(ans, B-colorCheck('B'));
		ans = Math.min(ans, R-reverseCheck('R'));
		ans = Math.min(ans, B-reverseCheck('B'));
        System.out.print(ans);
	}
	
	private static int colorCheck(char c){
	    int cnt = 0;
	    for(int i = 0; i < N; i++){
			if(ball.charAt(i) == c)
				cnt++;
			else
				break;
		}
		return cnt;
	}
	
	private static int reverseCheck(char c){
	    int cnt = 0;
	    for(int i = N-1; i >= 0; i--){
			if(ball.charAt(i) == c){
				cnt++;
			}
			else
				break;
		}
		return cnt;
	}
}