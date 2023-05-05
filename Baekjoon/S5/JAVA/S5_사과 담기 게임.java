//https://www.acmicpc.net/problem/2828

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
		
		int J = Integer.parseInt(br.readLine());
		int l = 0, r = l+(M-1), cnt = 0;
		for(int i = 0; i < J; i++){
		    int apple = Integer.parseInt(br.readLine())-1;
		    if(apple < l){
		        cnt += l-apple;
		        l = apple;
		        r = l+(M-1);
		    }
		    else if(apple > r){
		        cnt += apple-r;
		        r = apple;
		        l = apple-(M-1);
		    }
		}
		
        System.out.print(cnt);
	}
}